package sram.spring.lesson02.bean实例化方式.静态工厂方式;

public class StaticFactory {

	public static Product getProducts() {
		return new Product();
	}
}
