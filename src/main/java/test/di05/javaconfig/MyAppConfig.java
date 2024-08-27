package test.di05.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {


    @Bean // 스프링이 관리하는 빈 객체 만들기
    public Person person() {
        Person p = new Person("홍길동", 20);
        return p;
    }

    @Bean(name = "memberDao") //이름값 변경
    public MembersDao dao() {
        return new MembersDao();
    }

    @Bean
    public MembersController controller() {
        MembersController controller = new MembersController(dao());
        return controller;
    }
}
