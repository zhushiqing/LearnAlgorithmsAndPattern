package study.zsq.AbstractFactory;

public class Test {

	public static void main(String[] args) {
		Factory a = new Factory1();
		Factory b = new Factory2();
		
		ProductA pa1 = a.getProductA();
		ProductB pb1 = a.getProductB();
		ProductA pa2 = b.getProductA();
		ProductB pb2 = b.getProductB();
		
		pa1.ProductAName();
		pb1.ProductBName();
		pa2.ProductAName();
		pb2.ProductBName();
	}

}
