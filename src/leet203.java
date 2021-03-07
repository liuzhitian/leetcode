/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
public class leet203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode tmp =  new ListNode(0);
        ListNode head2 = new ListNode(0);
        tmp.next = head2 ;
        head2.next = head;
        while (head!=null){
            if (head.val==val){
                head2.next=head.next;
            }else{
                head2=head2.next;
            }
            head=head.next;
        }

        return tmp.next.next;
    }
}
 */
