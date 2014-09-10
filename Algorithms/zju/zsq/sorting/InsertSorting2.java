package zju.zsq.sorting;

public class InsertSorting2 {
	/**
	 * 二分插入排序
	 * @param num
	 */
	public static void sort(int[] num){
		
		for(int i = 1; i< num.length;i++){
			int temp = num[i];
			int low = 0;
			int high = i - 1;
			while(low <= high){
				int mid = (low+high)/2;
				if(num[mid] > temp)
					high = mid - 1;
				else
					low = mid + 1;
			}
			for(int j = i -1 ; j >= high +1;--j)
				num[j] = num[j+1];
			num[high+1] = temp;
		}
	}
	public static void main(String[] args) {
		int[] nums = { 1, 7, 3, 4, 5, 5, 9, 8, 11, 10 };
		sort(nums);
		System.out.println("排序之后:");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}
