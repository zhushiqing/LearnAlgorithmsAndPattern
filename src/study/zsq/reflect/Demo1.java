package study.zsq.reflect;

public class Demo1 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		//方法1.反射第一步：加载类
		Class clazz = Class.forName("study.zsq.reflect.Person");
		//方法2：
		Class clazz1 = new Person().getClass();
		//方法3：
		Class clazz2 = Person.class;
	}
}
