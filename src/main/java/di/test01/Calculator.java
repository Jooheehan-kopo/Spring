package di.test01;

public class Calculator {

	
	public void Add(int firstNum, int secondNum) {
		System.out.println("add()");
		
		int result = firstNum + secondNum;
		
		System.out.println(firstNum + "+" + secondNum+ "="+ result );
		
	}
	public void Sub(int firstNum, int secondNum) {
		
		int result = firstNum - secondNum;
		
		System.out.println(firstNum + "-" + secondNum+ "="+ result );
		
	}
	
	public void Mul(int firstNum, int secondNum) {
		
		int result = firstNum * secondNum;
		
		System.out.println(firstNum + "*" + secondNum+ "="+ result );
		
	}
	public void Div(int firstNum, int secondNum) {
		
		int result = firstNum / secondNum;
		
		System.out.println(firstNum + "/" + secondNum+ "="+ result );
		
	}

}
