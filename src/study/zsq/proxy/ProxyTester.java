package study.zsq.proxy;

import java.lang.reflect.Proxy;

public class ProxyTester {

	    public static void main(String[] args) {
	        A impl = new AImpl();
	        Handler handler = new Handler(impl);
	        //这里把handler与impl新生成的代理类相关联
	        A hello = (A) Proxy.newProxyInstance(impl.getClass().getClassLoader(),
	        		
	        		impl.getClass().getInterfaces(), handler);
	        
	        //这里无论访问哪个方法，都是会把请求转发到handler.invoke
	        hello.print("All the test");
	        hello.sayHello("zhushiqing");
	    }

}
