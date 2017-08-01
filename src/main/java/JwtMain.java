import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rest.JwtRestController;
import java.io.UnsupportedEncodingException;


/**
 * Created by JnSnw on 31.07.2017.
 */




@SpringBootApplication
public class JwtMain {

    public static void main(String[] args) throws UnsupportedEncodingException {

        SpringApplication.run(JwtRestController.class, args);
    }
}
