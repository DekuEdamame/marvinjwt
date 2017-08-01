package jwt;

import java.io.UnsupportedEncodingException;


/**
 * Created by JnSnw on 31.07.2017.
 */
public interface IJwtHandler {

    public String createToken(String subject, long expiration, String name, String scope, String signature) throws UnsupportedEncodingException;

    public String checkString();

}
