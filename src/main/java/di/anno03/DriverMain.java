package di.anno03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
	
	public static void main(String[] args) {
	
	ApplicationContext context = new GenericXmlApplicationContext("di.anno03.xml");
	//autowise
//	Car car = context.getBean("car",Car.class);
//	car.prnTireBrand();
	
	//resource
	Car2 car2 = context.getBean("car2",Car2.class);
	car2.prnTireBrand();
	
	}
}
