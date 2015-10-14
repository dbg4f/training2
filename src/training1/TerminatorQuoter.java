package training1;

import java.util.List;

/**
 * Created by Tanja on 10/14/2015.
 */
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public void sayHello() {

        for (String message : messages) {
            System.out.println(message);
        }

    }
}
