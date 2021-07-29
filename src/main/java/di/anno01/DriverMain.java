package di.anno01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
public static void main(String[] args) {
	
	
	ApplicationContext context = new GenericXmlApplicationContext("di.anno01.xml");
	
	
	//의존주입 전  : 기본생성자만 호출 Car()
	
	Car car = context.getBean("car" ,Car.class);
	car.prnTireBrand(); // 의존객체없어서 null 뜸.

	}
}
