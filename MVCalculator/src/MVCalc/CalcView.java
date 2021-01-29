package MVCalc;

import java.awt.event.ActionListener;
import javax.swing.*;

//DISPLAYS THE INTERFACE

@SuppressWarnings("serial")
public class CalcView extends JFrame {
	
	private JTextField fnum = new JTextField(10);
	private JLabel addlabel = new JLabel("+");
	private JTextField snum = new  JTextField(10);
	private JButton execute =  new JButton("execute");
	private  JTextField answer = new JTextField(10);
	
	CalcView() {
		
		
		JPanel exePanel = new JPanel();
		
		//WHEN CLICKED , CLOSE APPLICATION
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//DETERMINE SIZE OF THE INTERFACE
		this.setSize(400,200);
		
		//ADD TO PANEL 
		exePanel.add(fnum);
		exePanel.add(addlabel);
		exePanel.add(snum);
		exePanel.add(execute);
		exePanel.add(answer);
		
		this.add(exePanel);
	}
	
	public int getfnum() {
		
		return Integer.parseInt(fnum.getText());
	}
	
	
	public int getsnum() {
			
			return Integer.parseInt(snum.getText());
		}
		
	public int getanswer() {
		
		return Integer.parseInt(answer.getText());
	}
	
	public void setanswer(int solution) {
		answer.setText(Integer.toString(solution));
	}
	
	//NOTIFIES CONTROLLER WHEN A BUTTON IS CLICKED 
	
	void addCalcListener(ActionListener listenforexecution) {
		
		execute.addActionListener(listenforexecution);
	}
	
	void Error(String EMessage) {
		JOptionPane.showMessageDialog(this, EMessage);	
	}


}
