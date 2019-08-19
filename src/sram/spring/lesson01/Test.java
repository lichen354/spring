package sram.spring.lesson01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		final String PATH = Test.class.getResource("applicationContext.xml").getPath();
		
		//classPath路径下去寻找 也就是classes文件夹下
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sram\\spring\\lesson01\\applicationContext.xml");
		//如果是绝对目录， 需要拼上 file:
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("file:" + PATH);
		
		//默认是去项目的路径下加载，可以是相对路径，也可以是绝对路径 绝对路径可省略file:
		ApplicationContext applicationContext2 = new FileSystemXmlApplicationContext("src\\sram\\spring\\lesson01\\applicationContext.xml");
		ApplicationContext applicationContext3 = new FileSystemXmlApplicationContext(PATH);
		
		
	}
}
