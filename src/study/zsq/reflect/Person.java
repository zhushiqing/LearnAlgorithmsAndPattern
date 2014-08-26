package study.zsq.reflect;

import java.awt.List;
import java.io.InputStream;

public class Person {

	String name="zsq";
	
	public Person(){
		System.out.println("person");
	}
	
	public Person(String name){
		System.out.println(name);
	}
	
	public Person(String name,int password){
		System.out.println("name:"+name+"password:"+password);
	}
	private Person(List list){
		System.out.println(list.toString());
	}
	
	
	public void aa1(){
		System.out.println("aaa1");
	}
	
	public void aa1(String name,int password){
		System.out.println(name+":"+password);
	}
	
	
	private void aa1(InputStream in){
		System.out.println(in);
	}
}
