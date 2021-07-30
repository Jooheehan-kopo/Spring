package aop.pojo;

public class Manager implements Employee {

	public void work() {
		
		//공통코드를 넣어주지않으면 실행이 되지 않음.
//		Action.gotoOffice();
		System.out.println("팀원과 회의를 합니다");
//		Action.getoffOffice();
	}

}
