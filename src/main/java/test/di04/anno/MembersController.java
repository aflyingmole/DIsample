package test.di04.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MembersController {
    @Autowired
    private MembersService service;

    public void service(){
        service.insert("일유현");
        service.update("이유현");
        service.delete("삼유현");
        service.select("사유현");

    }
}
