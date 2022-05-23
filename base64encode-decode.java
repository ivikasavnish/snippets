
import java.util.Base64;

public class Encoder {
    public static void main(String[] args){
        String username  = "username";
        String password = "password";
        Base64.Encoder encoder =  Base64.getEncoder();
        String encodedString = encoder.encodeToString((username+" "+password).getBytes());
        System.out.println(encodedString);
        Base64.Decoder decoder = Base64.getDecoder();
       byte[] decodedByte =  decoder.decode(encodedString);
       System.out.println(new String(decodedByte));

    }
}
