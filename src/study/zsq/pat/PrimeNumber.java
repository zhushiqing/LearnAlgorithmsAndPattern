/**
 * 让我们定义 dn 为：dn = pn+1 - pn，其中 pi 是第i个素数。显然有 d1=1 且对于n>1有 dn 是偶数。“素数对猜想”认为“存在无穷多对相邻且差为2的素数”。
 * 现给定任意正整数N (< 105)，请计算不超过N的满足猜想的素数对的个数。
 * 输入格式：每个测试输入包含1个测试用例，给出正整数N。
 * 输出格式：每个测试用例的输出占一行，不超过N的满足猜想的素数对的个数。
 *输入样例：20     输出样例：4
 */



package study.zsq.pat;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			if(isPrime(i))
				list.add(i);
		}
		
		
		if(list.size()==1)
			System.out.println(0);
		else{
			int count = 0;
			for (int i = 0; i < (list.size()-1); i++) {
				if((list.get(i+1)-list.get(i))==2)
					count++;
			}
			System.out.println(count);
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
