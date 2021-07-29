package di.xml01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new GenericXmlApplicationContext("di-xml01.xml");
		
		Car car = (Car)context.getBean("car2"); //xml 에 의해서 의존주입이 된것임.
		car.prnTireBrand();
		
		
		
		
		/*방법1
		 * Car car = (Car)context.getBean("car"); Tire tire
		 * =(Tire)context.getBean("tire"); car.setTire(tire); car.prnTireBrand();
		 * car.prnTireBrand();
		 */
		
		
		/*
		Car car = new Car();
		Tire tire = new HankookTire();
		car.setTire(tire);
		car.prnTireBrand();
		*/
		
		
		
		
		
		
	}

}
