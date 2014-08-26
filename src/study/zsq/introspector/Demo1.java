package study.zsq.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

//使用内省api操作bean属性
public class Demo1 {
	
	//得到bean的所有属性
	@Test
	public void test1() throws IntrospectionException{
		
		BeanInfo info = Introspector.getBeanInfo(Person.class,Object.class);
		PropertyDescriptor[] pd = info.getPropertyDescriptors();
		for (PropertyDescriptor property : pd) {
			System.out.println(property.getName());
		}
	}
	
	//得到bean的特定属性
	@Test
	public void test2() throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Person p = new Person();
		
		PropertyDescriptor pd = new PropertyDescriptor("name", Person.class);
		
		//得到属性的写方法，为属性赋值
		Method method = pd.getWriteMethod();
		method.invoke(p, "zhushiqing");
		
		//获取属性值
//		System.out.println(p.getName());
		method = pd.getReadMethod();
		System.out.println(method.invoke(p, null));
	}
	
	//得到bean的属性的类型
	@Test
	public void test3() throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Person p = new Person();
		
		PropertyDescriptor pd = new PropertyDescriptor("name", Person.class);
		
		System.out.println(pd.getPropertyType());
	}
}
