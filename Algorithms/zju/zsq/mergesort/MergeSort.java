package zju.zsq.mergesort;

public class MergeSort {

	public void mergeArray(int nums[],int first,int mid,int last,int[] temp){
		int i = first;//
		int j = mid + 1;//
		int m = mid;//
		int n = last;//
		int k = 0;//
		while (i <= m && j <= n)  
	    {  
	        if (nums[i] <= nums[j])  //
	            temp[k++] = nums[i++];  
	        else  
	            temp[k++] = nums[j++];  
	    }  
	      
	    while (i <= m)  
	        temp[k++] = nums[i++];  
	      
	    while (j <= n)  
	        temp[k++] = nums[j++];  
	      
	    for (i = 0; i < k; i++)  
	        nums[first + i] = temp[i]; 
	}
	
	
}
