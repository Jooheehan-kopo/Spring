package di.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

	public static void main(String[] args) {
		
		//new GenericXmlApplicationContext(); // 얘대신에 config을 읽어서 넣어줄거임.
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Car car = context.getBean("car",Car.class);
		car.prnTireBrand();
		
	}

}
