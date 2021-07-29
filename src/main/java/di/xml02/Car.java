package di.xml02;

public class Car {
	
	private Tire tire;

	//생성자 주업. 삽입시텨줌/
	public Car() {
		System.out.println("Car 호출..");
	}
	
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Tire 호출..");
	}
	
	public Car(Tire tire1, Tire tire2) {
		System.out.println("Car (Tire, Tire) 호출..");
	}
	
	public Car(Tire tire, String str) {
		System.out.println("Car(Tire, String) 호출..");
		System.out.println("str: "+ str);
	}
	
	public Car(String str, Tire tire) {
		System.out.println("Car( String,Tire) 호출..");
		System.out.println("str: "+ str);
	}
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어: "+ tire.getBrand());
	}
	
}
