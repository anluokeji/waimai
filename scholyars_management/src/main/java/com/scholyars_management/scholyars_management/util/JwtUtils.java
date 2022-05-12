package com.scholyars_management.scholyars_management.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
@ConfigurationProperties(prefix = "markerhub.jwt")
public class JwtUtils {
    private long expire;
    private String secret;
    private String header;
    //生成jwt
    public String generateToken(String username){
        Date date = new Date();
        Date date1 = new Date(date.getTime() + 1000 * expire);
        return Jwts.builder()
                .setHeaderParam("typ","JWT")
                .setSubject(username)
                .setIssuedAt(date)
                .setExpiration(date1)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }
}
