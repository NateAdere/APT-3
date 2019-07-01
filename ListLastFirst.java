
public class ListLastFirst {
	public ListNode move(ListNode list) {
		if (list == null) {
			return list;
		}
		if (list.next == null) {
			return list;
		}
		ListNode front = list;
		while (list.next.next != null) {
			list = list.next;
		}
		ListNode list1 = list.next;
		list1.next = front;
		front = list1;
		list.next = null;
		return front;
	}

}
