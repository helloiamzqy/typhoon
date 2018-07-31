package main;

import jmsmanager.MyJmsListener;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextTest {

    public static void main(String[] args) {
        //listener
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyJmsListener jmsListener = context.getBean(MyJmsListener.class);
    }
}
