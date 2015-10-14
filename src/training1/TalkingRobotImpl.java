package training1;

import java.util.List;

/**
 * Created by Tanja on 10/14/2015.
 */
public class TalkingRobotImpl implements TalkingRobot {

    private List<Quoter> quoters;

    public void setQuoters(List<Quoter> quoters) {
        this.quoters = quoters;
    }

    @Override
    public void talk() {
        for (Quoter quoter : quoters) {
            quoter.sayHello();
        }
    }
}
