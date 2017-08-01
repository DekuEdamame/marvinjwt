package rest;

/**
 * Created by Volkan on 31.07.2017.
 */

import java.io.UnsupportedEncodingException;
import java.util.Date;

import jwt.auth0.TokenHandler;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JwtRestController {



    @RequestMapping("/tokenhandler")
    public String tokenValues(@RequestParam String subject, long expiration, String name, String scope, String signature ) throws UnsupportedEncodingException {
        TokenHandler tokenHandler = new TokenHandler();
        String jwtValue = "{ \"jwt\": \"" +  tokenHandler.createToken(subject, expiration, name, scope, signature) + "\" }";
        return jwtValue;

    }
}
