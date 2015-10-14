package training1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tanja on 10/14/2015.
 */
public class Launcher {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

       // Quoter obj = (Quoter) context.getBean("terminatorQuoter");

       // obj.sayHello();

    }

}
