package zju.zsq.sorting;

import org.junit.Test;

/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * @author zhushiqing
 * 冒泡排序
 */
public class Test03 {

	public void sortColors(int[] A) {
		int temp = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i; j < A.length-1 ; j++) {
				if (A[i] > A[j + 1]) {
					temp = A[j + 1];
					A[j + 1] = A[i];
					A[i] = temp;
				}
			}
		}
	}

	@Test
	public void testsortColors() {
		int[] A = {1,2,0};
		sortColors(A);
		for(int num:A){
			System.out.println(num);
		}
	}
}
