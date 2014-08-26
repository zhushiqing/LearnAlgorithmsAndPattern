package study.zsq.Prototype;

public class Test {
	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		for(int i = 0; i < 10; i++){
			ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
			clonecp.name();
		}
	}
}
