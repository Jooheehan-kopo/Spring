package di.test02;

import org.springframework.stereotype.Repository;

//숫자

public class MyCalculator {
	
	private int firstNum;
	private int secondNum;
	private Calculator calculator;
	
	public MyCalculator() {
		
	}
	
	
	
	
	public MyCalculator(int firstNum, int secondNum, Calculator calculator) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.calculator = calculator;
	}


	
	public void printAll() {
		
		System.out.println(firstNum+"+"+secondNum+ "="+ calculator.Add(firstNum, secondNum));
		System.out.println(firstNum+"-"+secondNum+ "="+ calculator.Sub(firstNum, secondNum));
		System.out.println(firstNum+"*"+secondNum+ "="+ calculator.Mul(firstNum, secondNum));
		System.out.println(firstNum+"/"+secondNum+ "="+ calculator.Div(firstNum, secondNum));
		
	}


	
	
}
