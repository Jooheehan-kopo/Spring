package aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("aop.test.xml");

		Person p = context.getBean("man", Person.class);
		try {
			p.setAge(20);
			p.setAge(-14);
		} catch (Exception e) {

		}
	}
}
