package zju.zsq.bubblesort;

import org.junit.Test;

public class BubbleSort {
	/**
	 * 
	 * @param nums
	 */
	
	public void bubbleSort(int[] nums){
		int temp = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length -1; j++) {
				if(nums[j] > nums[j+1]){
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
	
	@Test
	public void testBubbleSort(){
		int[] nums = {1,7,3,4,5,5,9,8,11,10};
		bubbleSort(nums);
		for(int num : nums){
			System.out.print(num+" ");
		}
	}
}
