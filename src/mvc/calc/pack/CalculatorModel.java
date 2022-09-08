package mvc.calc.pack;

public class CalculatorModel {
	
	private int sum; 
	
	public void addNumbers (int firstNumber, int secondNumber) {
		sum = firstNumber + secondNumber; 
	}
	
	public int getSum () {
		return sum; 
	}

}
