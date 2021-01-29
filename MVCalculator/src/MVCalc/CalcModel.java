package MVCalc;


//PERFORMS THE ACTUAL CALCULATIONS IN A PROGRAM 

public class CalcModel {
private int  calculationV;
	
	public void add2Num(int fnum , int snum) {
		calculationV = fnum + snum;
	}
	
	public int getCalculationV() {
		//Retrieves the current value stored in the variable
		return calculationV;
	}

}
