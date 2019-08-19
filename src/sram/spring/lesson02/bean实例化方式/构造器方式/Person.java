package sram.spring.lesson02.bean实例化方式.构造器方式;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
		System.out.println("person 的构造方法执行 name="+name);
	}
}
