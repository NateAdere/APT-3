
public class ListStretch {
	public ListNode stretch (ListNode list, int amount){
		ListNode front = list;
        while (list !=null) {
            for (int k = 0; k < amount-1; k+=1) {
            list.next = new ListNode(list.info,list.next);
            }
           for (int k = 0; k < amount; k+=1) {
           list = list.next;
           }
        }
        return front;
    }

}
