package test.di03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuiz {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("di03.xml");
        BoardController bc = (BoardController) ac.getBean("controller");
        bc.service();



    }
}
