package study.zsq.pat;

import java.util.Scanner;

public class SumBlackHole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[4];
		for (int i = 0; i < 0; i++) {
			num[i]=sc.nextInt();
		}
		
	}
	
	//冒泡排序，降序
	public static void sort(int[] num){
		int temp;
		for (int i = 0; i < num.length-1; i++) {
			for (int j = 0; j < num.length-i-1; j++) {
				if(num[j]<num[j+1]){
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
	}
	//将顺序倒转
	
	public static void resever(int[] num){
		int temp1=num[0];
		int temp2=num[1];
		num[0]=num[3];
		num[3]=temp1;
		num[1]=num[2];
		num[2]=temp2;
	}
}
