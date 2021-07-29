package di.anno03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	
//	@Autowired //(required = false) //의존주입을 할 객체가 없으면 null로 비워두라는것. 무조건하지 않겠다는것 / 아니면예러가 뜸
	private Tire tire; //의존관게발생.
	
	//기본생성자
	public Car() {
		System.out.println("car()...");
	}
	
	//tire형의 데이터

//	@Resource 안됨
	@Autowired
	public Car(@Qualifier("hankookTire") Tire tire) {
		this.tire =tire;
		System.out.println("Car(Tire)...");
	}
	
	//setter [반드시 기본생성자 가지고 있어야함. 아님 오류남- 먼저호출되기에]
//	@Resource
//	@Autowired
//	@Qualifier("hankookTire")
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("set tire..");
	}
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}


}
