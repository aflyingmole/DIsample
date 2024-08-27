package test.di05.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        //자바설정파일에서 스프링빈 객체 만들기
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
        //메서드이름이 스프링빈객체의 name이 된다
        Person pp = (Person) ac.getBean("person");
        System.out.println(pp.getName() + "," + pp.getAge());

        MembersDao dao = (MembersDao) ac.getBean("memberDao"); //@Bean(name="memberDao")로 변경했기때문에 아니면 dao 라고 적으면됨
        dao.select("홍길동");

        MembersController controller = (MembersController) ac.getBean("controller");
        controller.service();
    }
}
