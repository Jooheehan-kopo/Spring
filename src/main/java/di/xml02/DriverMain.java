package di.xml02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new GenericXmlApplicationContext("di-xml02.xml");
		
		Car car = context.getBean("car", Car.class);
		car.prnTireBrand();
		
		
		/*
		Tire tire = new HankookTire();
		Car car = new Car(tire);
		car.prnTireBrand();
		*/
		
	}

}
