package test.di04.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.di03.BoardController;

public class MainText {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("di04.xml");
        MembersController mc = (MembersController) ac.getBean("membersController");
        mc.service();
    }



}
