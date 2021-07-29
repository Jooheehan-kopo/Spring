package di.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext context = new GenericXmlApplicationContext("di.test02.xml");
		
		 MyCalculator mc = (MyCalculator)context.getBean("MyCal");
		 mc.printAll();
		/*
		 * MyCalculator mc = (MyCalculator)context.getBean("mycalculator"); Calculator
		 * cal = (Calculator)context.getBean("calculator"); mc.setCalculator(cal);
		 * mc.prnResult();
		 */
	}

}
