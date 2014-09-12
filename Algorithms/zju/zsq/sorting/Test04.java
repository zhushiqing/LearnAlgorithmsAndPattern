package zju.zsq.sorting;

import org.junit.Test;

/*
 * 
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array A = [1,1,2],

 Your function should return length = 2, and A is now [1,2].
 * 
 * 
 */
public class Test04 {
	public int removeDuplicates(int[] A) {
		if(A.length==0){
			return 0;
		}else if(A.length==1){
			return 1;
		}else{
			int count = 1;
			for (int i = 0; i < A.length-1; i++) {
				if(A[i]==A[i+1]){
					for(int j = i;j<A.length-1;j++){
						A[j] = A[j+1]; 
					}
				}
				if(A[i]!=A[i+1]){
					count++;
				}
			}
		
			
			return count;
		}
	}
	@Test
	public void testremoveDuplicates(){
		int A[] = {1,2,2,3,4,4};
		int count = removeDuplicates(A);
		System.out.println(count);
	}
}
