package com.dk;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UserTest {
	public static void main(String[] args) {
		
		/*Resource resource=new ClassPathResource("NewFile.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
		*/
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		User u =(User)context.getBean("User");
	    
	   
		u.showinfo();
		context.registerShutdownHook();
		
	}

}
