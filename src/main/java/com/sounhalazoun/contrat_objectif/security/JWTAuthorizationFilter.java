package com.sounhalazoun.contrat_objectif.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class JWTAuthorizationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
                                    FilterChain chain)
    throws IOException, ServletException {
    response.addHeader("Access-Control-Allow-Origin", "*");
    response.addHeader("Access-Control-Allow-Headers", "Origin, Accept, X-Requested-With,Content-Type, Access-Control-Request-Method, Access-Control-RequestHeaders,authorization");
    response.addHeader("Access-Control-Expose-Headers", "Access-Control-Allow-Origin, Access-Control-Allow-Credentials, authorization" );
    response.addHeader("Access-Control-Allow-Methods","GET,POST,PUT,DELETE,PATCH");
    if(request.getMethod().equals("OPTIONS")){
    response.setStatus(HttpServletResponse. SC_OK);
    }
    else if(request.getRequestURI().equals( "/login" )) { // exclus le cas du login oû on n'a pas besoin du Token
        chain.doFilter( request, response );
        return;
    }
    else {
    String jwtToken=request.getHeader(SecurityConstants. HEADER_STRING);
    if(jwtToken==null || ! jwtToken.startsWith(SecurityConstants. TOKEN_PREFIX)) {
    chain.doFilter(request, response); return;
    }
    
    JWTVerifier jwtVerifier= JWT.require( Algorithm.HMAC256( SecurityConstants.SECRET ) ).build();
    DecodedJWT decodedJWT=jwtVerifier.verify(  jwtToken.substring( SecurityConstants.TOKEN_PREFIX.length() ) );
    String username=decodedJWT.getSubject();
    List<String> roles=decodedJWT.getClaims().get( "roles" ).asList(String.class );
    Collection<GrantedAuthority> authorities=new ArrayList<>();
    roles.forEach(r->{
    authorities.add(new SimpleGrantedAuthority(r));
    });        
            
    UsernamePasswordAuthenticationToken authenticationToken= new UsernamePasswordAuthenticationToken(username,null,authorities);// null représente le password
    SecurityContextHolder.getContext().setAuthentication(authenticationToken);
    chain.doFilter(request, response);     
            
    
    }
    }
}