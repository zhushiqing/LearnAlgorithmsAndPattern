package study.zsq.reflect;

import java.lang.reflect.Method;

import org.junit.Test;

public class Demo3 {

	@Test
	public void test1() throws Exception{
		Person p = new Person();
		
		Class clazz = Class.forName("study.zsq.reflect.Person");
		Method method = clazz.getMethod("aa1", null);
		
		method.invoke(p, null);
	}
}
