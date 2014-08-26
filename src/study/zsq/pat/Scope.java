package study.zsq.pat;


import java.util.Scanner;

public class Scope {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int[] num = new int[n];
		String[] student = new String[n];
		int i = 0;
	
		while(n>=0){
			String s= sc.next();
			
			num[i]=Integer.parseInt(s.substring(s.lastIndexOf(" ")));
			i++;
			n--;
		
		}
		sc.close();
		int min = num[0];
		int mincount ;
		int max = num[0];
		int maxcount ;
		for (int j = 0; j < num.length; j++) {
			if(max < num[j]){
				max = num[j];
				maxcount = j;
			}else if(min > num[j]){
				min = num[j];
				mincount = j;
			}
		}
		System.out.println(student[max]);
		System.out.println(student[min]);
	}
	
}
