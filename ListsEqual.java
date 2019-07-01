
public class ListsEqual {
	public int equal (ListNode a1, ListNode a2) {
		int ans = 0;
		while (a2 != null && a1 != null) {
			if (a2.info != a1.info) {
				ans = 0;
				break;
			}
			a2 = a2.next;
			a1 = a1.next;
		}

		if (a2 == null && a1 == null) {
			ans = 1;
		}
		return ans;
	}

}
