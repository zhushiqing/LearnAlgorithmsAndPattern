package study.zsq.pat;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CountPrime {

	/**
	 * 令Pi表示第i个素数。现任给两个正整数M <= N <= 10^4，请输出PM到PN的所有素数。
	 * 输入 M  N
	 * 输出从PM到PN的所有素数，每10个数字占1行，其间以空格分隔，但行末不得有多余空格。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		for (int i = 2; i <= 10000; i++) {
			if(isPrime(i))
				list1.add(i);
		}
		for (int i = n-1; i <=m-1; i++) {
			list2.add(list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			if((i+1)%10==0&&i!=0){
				System.out.println(list2.get(i));
			}else if(i==(list2.size()-1)){
				System.out.print(list2.get(i)+" ");
			}else{
				System.out.print(list2.get(i)+" ");
			}
			
		}
	}
	
	public static boolean isPrime(int n){
	    for(int i= 2;i<= Math.sqrt(n);i++){
	         if(n%i == 0)
	              return false; 
	    }
	    return true; 
	}
	
	

}
