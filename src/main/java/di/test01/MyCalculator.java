package di.test01;

//숫자
public class MyCalculator {
	
	private int firstNum;
	private int secondNum;
	private Calculator calculator;
	
	public MyCalculator() {
		
	}
	
	public void add() {
		calculator.Add(firstNum, secondNum);
	}

	
	public void sub() {
		calculator.Sub(firstNum, secondNum);
		
	}
	
	public void mult() {
		calculator.Mul(firstNum, secondNum);
	}
	
	public void div() {
		calculator.Div(firstNum, secondNum);
	}
	
	
	
	public void setCalculator(Calculator calculator) {
		
		this.calculator = calculator;
		System.out.println("setCal..");
	}
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	
	
}
