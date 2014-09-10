package zju.zsq.sorting;

/**
 * 直接插入排序，前面有序，然后后面插入前面，前面整体后移
 * 
 * @author zhushiqing
 *
 */
public class InsertSorting1 {

	public static void sort(int[] num) {
		for (int i = 1; i < num.length; i++) {
			int index = 0;
			int temp = -1;

			while (index <= i) {
				if (num[i] < num[index]) {
					temp = num[i];
					break;
				}
				index++;
			}
			if (temp != -1) {
				for (int j = index; j < i; j++) {
					num[j + 1] = num[j];
				}
				num[index] = temp;
			}
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
