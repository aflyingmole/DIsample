package test.di04.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.di04.anno.MembersDao;

@Service
//@Autowired : 같은 타입의 객체를 찾아서 자동으로 주입
public class MembersService {
    @Autowired
    private MembersDao dao;

    public void setDao(MembersDao dao) {
        this.dao = dao;
    }
    public int insert (String data){
        return dao.insert(data);
    }
    public int delete (String data){
        return dao.delete(data);
    }
    public int update (String data){
        return dao.update(data);
    }
    public String select(String data){
        return dao.select(data);
    }

}
