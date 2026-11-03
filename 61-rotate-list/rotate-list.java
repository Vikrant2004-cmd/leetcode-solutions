class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null) {
            return head;
        }

        int length = 0;
        ListNode current = head;
        ListNode lastnode = head;

        while(current != null) {
            if(current.next == null) {
                lastnode = current;
            }

            current = current.next;
            length++;
        }

        k = k % length;

        if(k == 0) {
            return head;
        }

        current = head;
        int brokenode = length - k;
        int i = 1;

        while(i < brokenode) {
            current = current.next;
            i++;
        }

        ListNode temp = current.next;
        current.next = null;
        lastnode.next = head;
        head = temp;

        return head;
    }
}