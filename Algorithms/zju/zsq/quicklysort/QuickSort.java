package zju.zsq.quicklysort;

import org.junit.Test;

public class QuickSort {
	/**
	 * 快排，平均时间复杂度为O(nlog(n))，最坏情况下为O(n^2)
	 * @param num
	 * @param low
	 * @param high
	 * @return
	 */
	//获取中值
	public int getMid(int[] num , int low , int high){
		int temp = num[low];
	
		while(low < high){
			while(low < high && num[high] >= temp){
				high --;
			}
			num[low] = num[high];
			while(low < high && num[low] <= temp){
				low ++;
			}
			num[high] = num[low];
		}
		
		num[low] = temp;
		return low;
	}
	
	public void quickSort(int[] num,int low,int high){
		if(low < high){
			int mid = getMid(num,low,high);
			quickSort(num,mid+1,high);
			quickSort(num,low,mid-1);
		}
		
	}
	

	public void sort(int[] num){
		if(num.length > 0){
			quickSort(num,0,num.length-1);
		}
	}
	
	@Test
	public void testQucikSort(){
		int[] num= {1,7,3,4,5,5,9,8,11,10};
		sort(num);
		
		for(int number : num){
			System.out.print(number+" ");
		}
	}
}
