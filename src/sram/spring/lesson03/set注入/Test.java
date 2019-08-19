package sram.spring.lesson03.set注入;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sram\\spring\\lesson03\\setע��\\applicationContext.xml");
		Person p = (Person)context.getBean("person");
		System.out.println(p.toString());
	}
}
