/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
public class leetcode86 {
    public ListNode reverseList2(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode resultHead = result;
        int count = 0;
        ListNode tmp = head;
        while(tmp!=null){
            tmp = tmp.next;
            count++;
        }
        for (int i=count-1;i>=0;i--){
            int temp = i;
            ListNode tmp2 = head;
            while (temp>0){
                tmp2 = tmp2.next;
                temp--;
            }
            result.next = tmp2;
            result = result.next;

        }
        result.next=null;
        return resultHead.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
 */