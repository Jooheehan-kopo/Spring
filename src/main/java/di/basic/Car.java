package di.basic;

public class Car {
	
	//의존관계 발생 - 다른 곳에 있는 객체 겟
	private Tire tire;
	
	//DI: 생성자 주입 (의존성있는 객체를 생성자를 통해 받아옴)
	public Car(Tire tire) {
		this.tire =tire;
	}
	
	
	public Car() {
		
	}
	
	/*
	 * public Car() {
	 *  tire = new HankookTire();
	 * 
	 * }
	 */
	
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}

	//DI 의존주입 : Setter 주입
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("set tire..");
	}
	
}
