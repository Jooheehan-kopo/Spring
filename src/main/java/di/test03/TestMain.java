package di.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("di.test03.xml");
		
		 MyCalculator mc = context.getBean("Mycal",MyCalculator.class);
		 
		 mc.printAll();
		/*
		 * MyCalculator mc = (MyCalculator)context.getBean("mycalculator"); Calculator
		 * cal = (Calculator)context.getBean("calculator"); mc.setCalculator(cal);
		 * mc.prnResult();
		 */
	}

}
