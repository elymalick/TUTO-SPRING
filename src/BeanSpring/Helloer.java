package BeanSpring;

import Printer.IPrinter;

public class Helloer implements IHelloer {
	
	
	private IPrinter iprinter;

	public voi setHello(IPrinter iprinter){
		this.iprinter=iprinter;
	}
	
	public void run(){
		
		String s = "<<Hello World>>";
		String ss = "<<Bonjour tous le monde>>";
		iprinter.printHello(s);
		iprinter.affHello(ss);
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}
}
