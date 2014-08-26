package study.zsq.Observer;

public class ConcreteObserver1 implements Observer{

	@Override
	public void update() {
		System.out.println("Observer1 receive the msm,update!");
	}
	
}
