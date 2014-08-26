package study.zsq.AbstractFactory;

public class Factory1 implements Factory{

	@Override
	public ProductA getProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB getProductB() {
		return new ProductB1();
	}

}
