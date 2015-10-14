package training1;

/**
 * Created by Tanja on 10/14/2015.
 */
public class ShakeSpearQuoter implements Quoter {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayHello() {

        System.out.println(message);

    }
}
