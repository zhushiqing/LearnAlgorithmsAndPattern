package zju.zsq.day01.mergelist;

/**
 * 数据结构Page 21 线性表A、B有序，归并成一个新的有序线性表 时间复杂度为O(log(len_A+len_B))
 * @author zhushiqing
 *
 */
public class MergeListTest {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 5 };
		int B[] = { 2, 4, 8, 9, 10 };
		mergeList(A, B);
	}

	public static void mergeList(int[] A, int[] B) {
		int len_A = A.length;
		int len_B = B.length;
		int[] C = new int[len_A + len_B];
		int i = 0, j = 0;
		int k = 0;

		while (len_A > i && len_B > j) {
			if (A[i] > B[j]) {
				C[k] = B[j];
				j++;
			} else {
				C[k] = A[i];
				i++;
			}
			k++;
		}
		while(i< len_A){
			C[k] = A[i];
			i++;
			k++;
		}
		while(j < len_B){
			C[k] = B[j];
			j++;
			k++;
		}
		for (int num : C) {
			System.out.println("num:" + num);
		}

	}

}
