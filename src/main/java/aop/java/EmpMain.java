package aop.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 1.runtime 기반
 * 2.proxy 기반
 * 3.인터페이스 기반. employee e = 형으로 써야함.
 */
public class EmpMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Employee e = context.getBean("programmer", Employee.class);
	  //Employee e = context.getBean("designer", Employee.class);
		e.work();
		
		

	}

}
