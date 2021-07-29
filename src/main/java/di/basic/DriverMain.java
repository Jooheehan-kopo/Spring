package di.basic;

public class DriverMain {
public static void main(String[] args) {
	
	HankookTire han = new HankookTire(); //외부에서 만들어줌.
	KumhoTire kum = new KumhoTire();
	
	//setter 주입방식
	Car car = new Car();
	car.setTire(kum);
	car.prnTireBrand();
	
	/*//생성자 주입방식
	 * Car car = new Car(kum); 
	 * car.prnTireBrand();
	 */
	
	/*
	 * Car car = new Car(); car.prnTireBrand();
	 */
	
	}
}
