package Affichage;

import javax.swing.*;

import GraphicalPrinter.IGraphical;

public class PrinterMSG implements IGraphical {

	
		@ erride
		public void AfficheGRaph(String s) {
			// TODO Auto-generated method stub
	    
			// create a jframe
		 	JFrame frame = new JFrame("JOptionPane showMessageDialog example");

	    // show a joptionpane dialog using showMessageDialog
	    JOptionPane.showMessageDialog(frame, "'" + s + "'.");
	    System.exit(0);
		
		}
}
