package study.zsq.AbstractFactory;

public class Factory2 implements Factory{

	@Override
	public ProductA getProductA() {
		return new ProductA2();
	}

	@Override
	public ProductB getProductB() {
		return new ProductB2();
	}
	
}
