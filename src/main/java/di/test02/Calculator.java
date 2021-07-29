package di.test02;

public class Calculator {

	public int Add(int firstNum, int secondNum) {
		System.out.println("add()");
		
		int result = firstNum + secondNum;
		
//		System.out.println(firstNum + "+" + secondNum+ "="+ result );
		return result;
	}
	
	
	public int Sub(int firstNum, int secondNum) {
		
		int result = firstNum - secondNum;
		
//		System.out.println(firstNum + "-" + secondNum+ "="+ result );
		return result;
		
	}
	
	public int Mul(int firstNum, int secondNum) {
		
		int result = firstNum * secondNum;
		
//		System.out.println(firstNum + "*" + secondNum+ "="+ result );
		return result;
		
	}
	public int Div(int firstNum, int secondNum) {
		
		int result = firstNum / secondNum;
		
//		System.out.println(firstNum + "/" + secondNum+ "="+ result );
		return result;
	}


}
