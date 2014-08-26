package study.zsq.introspector;

public class Person {//javabean
	private String name;//字段
	private String password;//字段
	private int age;//字段
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAB(){
		return null;
	}
	
}
