package leetcode.zsq.multiply;

import java.math.BigInteger;

import org.junit.Test;

public class Multiply {
	
	@Test
	public void test1(){
		String str1 = "401716832807512840963";
		String str2 = "167141802233061013023557397451289113296441069";
		String str=multiply(str1,str2);
		System.out.println(str);
	}
	
	public String multiply(String num1,String num2){
		 if("0".equals(num1)||"0".equals(num2)){
				return "0";
			}else{
				if(num1.length()>=18){
					
				}
				BigInteger number1 = BigInteger.valueOf(Long.parseLong(num1));
				BigInteger number2 = BigInteger.valueOf(Long.parseLong(num2));
				BigInteger num = number1.multiply(number2);
				return String.valueOf(num);
				
			}
	}
}
