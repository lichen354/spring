package sram.spring.lesson02.bean实例化方式.静态工厂方式;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sram\\spring\\lesson02\\beanʵ������ʽ\\��̬������ʽ\\applicationContext.xml");
		
		Product p1 = (Product) context.getBean("product01");
		System.out.println(p1.toString());
	}
}
