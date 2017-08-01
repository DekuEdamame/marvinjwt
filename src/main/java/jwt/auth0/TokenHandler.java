package jwt.auth0;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jwt.IJwtHandler;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created by JnSnw on 31.07.2017.
 */
public class TokenHandler implements IJwtHandler {

    public String createToken(String subject, long expiration, String name, String scope, String signature) throws UnsupportedEncodingException {

        Date date = new Date(expiration);

        String jwt = Jwts.builder()
                .setSubject(subject)
                .setExpiration(date)
                .claim("name", name)
                .claim("scope", scope)
                .signWith(
                        SignatureAlgorithm.HS256,
                        signature.getBytes("UTF-8")
                )
                .compact();
        return jwt;
    }

    public String checkString() {
        return null;
    }
}
