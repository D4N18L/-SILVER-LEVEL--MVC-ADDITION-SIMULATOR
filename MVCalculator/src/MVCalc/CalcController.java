package MVCalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//INTERACTS BETWEEN THE MODEL AND VIEW
public class CalcController {
	
	//Call both the model and view to the controller 
	private CalcView View;
	private CalcModel Model;
	
	//Constructor
	public CalcController(CalcView View , CalcModel Model) {
		this.View = View;
		this.Model = Model;
		
		this.View.addCalcListener(new CalcListener());
	}
	
	
	class CalcListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int fnum , snum = 0;
			
			//Prevent any errors 
			try {
				fnum = View.getfnum();
				snum = View.getsnum();
				
				Model.add2Num(fnum, snum);
				
				//assign new value from getCalculationV
				View.setanswer(Model.getCalculationV());

			}
			
			//Catch potential errors
			catch(NumberFormatException x) {
				View.Error("You have to enter 2 numbers");
			}
			
			
		}
		
	}
	
	
	
	
	
	
	


}
