package MVCalc;

public class CaalcRun {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		CalcView View  = new CalcView();
		CalcModel Model = new CalcModel();
		
		//Create a bridge  that allows interaction between Model and View
		CalcController Controller = new CalcController(View, Model);
		
		//Allows me to see the model ion the screen 
		View.setVisible(true);
		


	}

}
