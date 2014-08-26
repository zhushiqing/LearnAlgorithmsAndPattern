package study.zsq.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler{

	private Object obj;
	
	public Handler(Object obj){
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		doBefore();
		Object result = method.invoke(obj, args);
		doAfter();
		
		return result;
	}

	private void doAfter() {
		System.out.println("after...");
	}

	private void doBefore() {
		System.out.println("before...");
	}

}
