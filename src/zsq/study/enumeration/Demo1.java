package zsq.study.enumeration;

import org.junit.Test;



//Enum的实现
class Grade {
	private Grade(){}
	public static final Grade A = new Grade();
	public static final Grade B = new Grade();
	public static final Grade C = new Grade();
	public static final Grade D = new Grade();
	public static final Grade E = new Grade();
}

enum GradeA{//class A:100-90 B:89-80 C:79-70 D:69-60 E: 59-0
	A("100-90"),B("89-80"),C("79-70"),D("69-60"),E("59-0");//object
	private String value;
	private GradeA(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
}
public class Demo1{
	@Test
	public void test1(){
		System.out.println(GradeA.B);
	}
}