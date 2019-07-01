import java.util.List;

public class ListCount {
	public int count (ListNode list) {
        int total = 0;
        while (list !=null) {
        	total += 1;
        	list = list.next;
        }
		// replace statement below with code you write
	  return total;
    }

}
