package di.anno01;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	@Autowired
	private Tire tire; //의존관게발생.
	
	//기본생성자
	public Car() {
		System.out.println("car()...");
	}
	
	//tire형의 데이터
//	@Autowired
	public Car(Tire tire) {
		this.tire =tire;
		System.out.println("Car(Tire)...");
	}
	
	//setter [반드시 기본생성자 가지고 있어야함. 아님 오류남- 먼저호출되기에]
//	@Autowired
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("set tire..");
	}
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}


}
