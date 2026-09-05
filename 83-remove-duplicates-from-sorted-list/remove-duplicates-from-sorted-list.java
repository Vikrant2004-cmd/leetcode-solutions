class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = head;

        while(current != null && current.next != null){

            if(current.val == current.next.val){
                ListNode temp = current.next.next;
                current.next = temp;
            }
            else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}