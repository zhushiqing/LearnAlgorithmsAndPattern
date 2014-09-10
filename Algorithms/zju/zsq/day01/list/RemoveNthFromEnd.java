package zju.zsq.day01.list;

/**
 * Given a linked list, remove the nth node from the end of list and return its
 * head.
 * 
 * @author zhushiqing
 *
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class RemoveNthFromEnd {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode cur = head;
		for (int i = 0; i < 4; i++) {

			ListNode tmp = new ListNode(i + 2);
			cur.next = tmp;
			cur = tmp;
		}
		cur = removeNthFromEnd(head, 2);

		while (cur != null) {
			System.out.println(cur.val);
			cur = cur.next;
		}

	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return null;
		else if(head.next==null&&n==1)
			return null;
		ListNode p = head, q = head;
		for (int i = 0; i < n; i++) {
			q = q.next;
		}
		while (q.next != null) {
			p = p.next;
			q = q.next;
		}
		ListNode tmp = p.next.next;
		p.next = tmp;
		return head;
	}
}
