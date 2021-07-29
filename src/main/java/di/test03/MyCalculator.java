package di.test03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//숫자

public class MyCalculator {
	
	private int firstNum;
	private int secondNum;
	@Autowired
	private Calculator calculator;
	
	public MyCalculator() {
		
	}
	
	

	
	public void printAll() {
		
		System.out.println(firstNum+"+"+secondNum+ "="+ calculator.Add(firstNum, secondNum));
		System.out.println(firstNum+"-"+secondNum+ "="+ calculator.Sub(firstNum, secondNum));
		System.out.println(firstNum+"*"+secondNum+ "="+ calculator.Mul(firstNum, secondNum));
		System.out.println(firstNum+"/"+secondNum+ "="+ calculator.Div(firstNum, secondNum));
		
	}



	@Value(value = "10")
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}



	@Value(value = "3")
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}




	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	
	
	
}
