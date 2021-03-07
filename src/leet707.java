/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
/**
public class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int x) { val = x; }
}



class MyLinkedList {
    int size;
    ListNode head,tail;

    public MyLinkedList() {
        size=0;
        head = new ListNode(0);
        tail = new  ListNode(0);
        head.next= tail;
        tail.prev =head;
    }

    public int get(int index) {
        if (index<0||index>size){
            return -1;
        }
        ListNode curr=head;
        if (index+1<size-index){
            for(int i = 0; i < index + 1; ++i) curr = curr.next;
        }else{
            curr = tail;
            for (int i=0;i<size-index;i++){
                curr=curr.prev;
            }
        }
        return curr.val;
    }

    public void addAtHead(int val) {
         ListNode tmp = new ListNode(val);
         ListNode pree = head,curr = head.next;

         pree.next = tmp;
         curr.prev = tmp;
         tmp.prev=pree;
         tmp.next = curr;
         size++;
    }

    public void addAtTail(int val) {
        ListNode tmp = new ListNode(val);
        ListNode pree = tail.prev,curr = tail;

        pree.next = tmp;
        curr.prev=tmp;
        tmp.prev =pree;
        tmp.next=curr;


        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index>size) return;
        if (index<0) index=0;
        ListNode pree,curr;
        ListNode tmp = new ListNode(val);
        if (index+1<size-index){
            pree = head;
            for(int i = 0; i < index ; i++) pree = pree.next;
            curr = pree.next;
        }else{
            curr = tail;
            for (int i=0;i<size-index;i++){
                curr=curr.prev;
            }
            pree=curr.prev;
        }
        pree.next = tmp;
        curr.prev=tmp;
        tmp.prev =pree;
        tmp.next=curr;
        size++;


    }


    public void deleteAtIndex(int index) {

        if (index<0||index>=size) return;
        ListNode pree,curr;
        if (index+1<size-index){
            pree = head;
            for(int i = 0; i < index ; i++) pree = pree.next;
            curr = pree.next.next;
        }else{
            curr = tail;
            for (int i=0;i<size-index-1;i++){
                curr=curr.prev;
            }
            pree = curr.prev.prev;

        }

        pree.next =curr;
        curr.prev = pree;
        size--;


    }

}

*/
