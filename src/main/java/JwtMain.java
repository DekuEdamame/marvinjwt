/**
 * Created by Volkan on 31.07.2017.
 */
import javafx.application.Application;
import jwt.auth0.TokenHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rest.JwtRestController;

import java.io.UnsupportedEncodingException;
import java.util.Date;

@SpringBootApplication
public class JwtMain {

    public static void main(String[] args) throws UnsupportedEncodingException {

        SpringApplication.run(JwtRestController.class, args);
    }
}
