package jwt;

import java.io.UnsupportedEncodingException;
import java.util.Date;


/**
 * Created by Volkan on 31.07.2017.
 */
public interface IJwtHandler {

    public String createToken(String subject, long expiration, String name, String scope, String signature) throws UnsupportedEncodingException;

    public String checkString();

}
