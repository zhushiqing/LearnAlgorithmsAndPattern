package study.zsq.reflect;

import java.awt.List;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.junit.Test;
//反射类的构造函数，创建类的对象，反射构造函数：public Person
public class Demo2 {

	//反射构造函数public Person()
	@Test
	public void test1() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("study.zsq.reflect.Person");
		Constructor c = clazz.getConstructor(null);
		
		Person p = (Person)c.newInstance(null);
		
		
		
	}
	
	//反射构造函数public Person(String name)
	@Test
	public void test2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("study.zsq.reflect.Person");
		Constructor c = clazz.getConstructor(String.class);
		
		Person p = (Person)c.newInstance("zhushiqing");
		
		System.out.println(p.name);
		
	}
	
	//反射构造函数public Person(String name,int password)
	@Test
	public void test3() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("study.zsq.reflect.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		
		Person p = (Person)c.newInstance("zhushiqing",123456);
		
		System.out.println(p.name);
		
	}
	
	//反射构造函数private Person(List)
	@Test
	public void test4() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("study.zsq.reflect.Person");
		Constructor c = clazz.getDeclaredConstructor(List.class);
		
		c.setAccessible(true);//暴力反射 拿到构造函数之后 
		
		Person p =(Person)c.newInstance(new ArrayList());//
		System.out.println(p.name);
		
		
	}
	
	//以下代码等效于test1
	@Test
	public void test5() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Class.forName("study.zsq.reflect.Person");
		
		Person p = (Person)clazz.newInstance();//无参的
	}
}
