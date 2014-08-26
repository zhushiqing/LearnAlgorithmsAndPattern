package study.zsq.pat;

import java.util.Scanner;

public class ReorderList {
	public static void main(String[] args) {
		System.out.println("请输入字符串");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int n = atoi(str);
		System.out.println(n);
		
	}
	static int atoi(String str){
		if("".equals(str.trim()))
			return 0;
		Long number ;
		int num;
		number = Long.parseLong(str.trim());
		if(number>=(2147483647)||number<=(-2147483648))
			return num = 0; 
		else
			return num= number.intValue();
	}
}
