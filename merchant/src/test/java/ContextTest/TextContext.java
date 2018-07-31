package ContextTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextContext {
    @Test
    public void test(){
        //sender
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    }
}
