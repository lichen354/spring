package sram.spring.lesson02.bean实例化方式.构造器方式;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sram\\spring\\lesson02\\bean实例化方式\\构造器方式\\applicationContext.xml");
		
		Person person = (Person) context.getBean("person01");
	}
}
