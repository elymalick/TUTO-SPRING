package Main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
im rt org.springframework.context.support.ClassPathXmlApplicationContext;

import BeanSpring.Helloer;



public class Application {

	public static void main(String args[]){
	
			    ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/bean.xml");
			    BeanFactory factory = context;
			    Helloer test = (Helloer) factory.getBean("helloer");
			    test.run();
			  }

}