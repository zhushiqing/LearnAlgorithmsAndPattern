package zju.zsq.binarysort;

import org.junit.Test;

public class BinarySort {

	public void binarySort(int[] num) {

		for (int i = 0; i < num.length; i++) {
			int temp = num[i];
			int left = 0;
			int right = i - 1;
			int mid = 0;

			while (left <= right) {
				mid = (left + right) / 2;
				if (temp < num[mid])
					right = mid - 1;
				else
					left = mid + 1;
			}
			for (int j = i - 1; j >= left; j--) {
				num[j] = num[j + 1];// 整体后移一个数
			}
			if (left != i)
				num[left] = temp;
		}
	}

	@Test
	public void testBubbleSort() {
		int[] nums = { 1, 7, 3, 4, 5, 5, 9, 8, 11, 10 };
		binarySort(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

}
