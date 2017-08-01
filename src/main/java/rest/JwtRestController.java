package rest;

import java.io.UnsupportedEncodingException;
import jwt.auth0.TokenHandler;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JnSnw on 31.07.2017.
 */


@SpringBootApplication
@RestController
public class JwtRestController {


    @CrossOrigin
    @RequestMapping("/tokenhandler")
    public String tokenValues(@RequestParam String subject, long expiration, String name, String scope, String signature ) throws UnsupportedEncodingException {
        TokenHandler tokenHandler = new TokenHandler();
        return tokenHandler.createToken(subject, expiration, name, scope, signature);

    }
}
