package di.anno03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car2 {
	
	/*
	@Resource
	@Qualifier("kumhoTire") //하면 에러남
	*/
	//
	@Resource(name ="hankookTire")
	@Qualifier("kumhoTire")   //hankook이 먼저나옴 resource는 이름이 먼저임
	private Tire tire; //의존관게발생.
	
	//기본생성자
	public Car2() {
		System.out.println("car()...");
	}
	

	@Resource(name= "hankookTire")
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("set tire..");
	}
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}


}
