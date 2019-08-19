package sram.spring.lesson03.构造器注入;

import java.util.List;
import java.util.Set;

public class Person {
	
	private Dog dog;
	public Person(Dog dog) {
		this.dog = dog;
	}
	
}
