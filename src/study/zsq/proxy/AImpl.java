package study.zsq.proxy;

public class AImpl implements A{

	@Override
	public void sayHello(String to) {
		System.out.println("Hello:"+to);
	}

	@Override
	public void print(String p) {
		System.out.println("print:"+p);
	}

}
