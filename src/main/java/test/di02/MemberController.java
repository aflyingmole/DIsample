package test.di02;

public class MemberController {
    private CommonDao dao;

    public void setDao(CommonDao dao) {
        this.dao = dao;
    }

    public void service(){
        dao.insert("일유현");
        dao.update("이유현");
        dao.delete("삼유현");
        dao.select("사유현");
    }
}
