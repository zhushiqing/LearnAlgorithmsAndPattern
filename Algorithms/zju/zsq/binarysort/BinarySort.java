package zju.zsq.binarysort;

import org.junit.Test;


public class BinarySort {
	public  void binaryInsertSort(int[] data) {  
        for (int i = 1; i < data.length; i++) {  
            if (data[i] < data[i - 1]) {  
                // 缓存i处的元素值  
                int tmp = data[i];  
                // 记录搜索范围的左边界  
                int low = 0;  
                // 记录搜索范围的右边界  
                int high = i - 1;  
                while (low <= high) {  
                    // 记录中间位置  
                    int mid = (low + high) / 2;  
                    // 比较中间位置数据和i处数据大小，以缩小搜索范围  
                    if (data[mid] < tmp) {  
                        low = mid + 1;  
                    } else {  
                        high = mid - 1;  
                    }  
                }  
                //将low~i处数据整体向后移动1位  
                for (int j = i; j > low; j--) {  
                    data[j] = data[j - 1];  
                }  
                data[low] = tmp;  
                for (int number : data) {
    				System.out.print(number + " ");
    			}
    			System.out.println();
            }  
        }  
    }  
	

	@Test
	public void testBubbleSort() {
		int[] nums = { 1, 7, 3, 4, 5, 5, 9, 8, 11, 10 };
		binaryInsertSort(nums);
		System.out.println("排序之后:");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

}
