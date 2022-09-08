package mvc.calc.pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	private CalculatorView theView; 
	private CalculatorModel theModel; 
	
	public CalculatorController (CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView; 
		this.theModel = theModel; 
		
		this.theView.addCalculationListener(new CalculateListener ());
	}
	class CalculateListener implements ActionListener {
		public void actionPerformed (ActionEvent arg0) {
			int firstNumber, secondNumber = 0; 
			
			try {
				firstNumber = theView.getFirstNumber(); 
				secondNumber = theView.getSecondNumber(); 
				theModel.addNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getSum());
				
			} 
			catch (NumberFormatException ex) {
				theView.displayErrorMessage("They/YOu need to enter two Integers, please");
			}
			
		}
	}

}
