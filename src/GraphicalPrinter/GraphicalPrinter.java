package GraphicalPrinter;

public class GraphicalPrinter{
	
		private IGraphical igraphical;
		
		public void setAff(IGraphical igraphical){
			this.igraphical=igraphical;			
		}
		
		public void run(){
			
			String s= "Bonjour tous le monde";
			igraphical.AfficheGRaph(s);
			
		}

		 /** public static void main(String[] args)
		  {
		    String backupDir = "Bonjour tous le monde";
		    
		    // create a jframe
		    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
		    
		    // show a joptionpane dialog using showMessageDialog
		    JOptionPane.showMessageDialog(frame, "'" + backupDir + "'.");
		    System.exit(0);
		  }**/

			// TODO Auto-generated method stub
			
		   
		
}
