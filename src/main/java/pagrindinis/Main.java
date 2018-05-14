package pagrindinis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("ac.xml");
        BeanA ba = ac.getBean("beanA", BeanA.class);

        ba.print();
    }
}
