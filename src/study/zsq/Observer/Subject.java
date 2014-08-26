package study.zsq.Observer;

import java.util.Vector;

public abstract class Subject {
	private Vector<Observer> obs = new Vector<Observer>();
	
	public void add(Observer o){
		this.obs.add(o);
	}
	
	public void remove(Observer o){
		this.obs.remove(o);
	}
	
	public void notifyObserver(){
		for (Observer o : obs) {
			o.update();
		}
	}
	
	public abstract void doSomething();
}
