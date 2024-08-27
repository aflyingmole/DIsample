package test.di01;

public class MembersController {
	private MembersDao dao;

	public MembersController() {}

	public MembersController(MembersDao dao) {
		this.dao = dao;
	}
	
	//스프링이 생성해준 객체 주입하기
		public void setDao(MembersDao dao) {
			this.dao = dao;
		}
	
	public void service() {
		dao.insert("일유현");
		dao.insert("이유현");
		dao.insert("삼유현");
		dao.insert("사유현");
	}

}
