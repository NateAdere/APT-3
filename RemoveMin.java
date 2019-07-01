
public class RemoveMin {
	public ListNode remove (ListNode list) {
		ListNode front = list;
		int best = 1000;
        while (list !=null) {
           if (list.info < best) {
              best = list.info;
              list = list.next;
           }
           else {
            list = list.next;
           }
        }
       list = front;
        while (list !=null) {
        	if (list.next == null) {
                list = null;
                break;
        	}
        	if (list.info == best) {
                list = list.next;
                break;
             }
           if (list.next.info == best) {
               list.next = list.next.next;
               list = front;
              break;
           }
           else {
            list = list.next;
           }
           
            
        }
	  return list;
    }

}
