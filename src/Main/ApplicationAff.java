package Main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
im rt org.springframework.context.support.ClassPathXmlApplicationContext;


import GraphicalPrinter.GraphicalPrinter;

	public class ApplicationAff {

		public static void main(String args[]){
		
				    ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beang.xml");
				    BeanFactory factory = context;
				    GraphicalPrinter test = (GraphicalPrinter) factory.getBean("igraph");
				    test.run();
				  }
	}