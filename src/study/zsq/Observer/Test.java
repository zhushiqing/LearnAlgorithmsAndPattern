package study.zsq.Observer;

public class Test {
	public static void main(String[] args) {
		Subject sb = new ConcreteSubject();
		sb.add(new ConcreteObserver1());
		sb.add(new ConcreteObserver2());
		sb.doSomething();
	}
}
