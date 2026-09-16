class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        int count = 1;

        ListNode leftNode = null;
        ListNode leftPrev = null;
        ListNode rightNode = null;
        ListNode rightNext = null;

        ListNode temp = head;

        
        while (temp != null) {

            if (count == left) {
                leftNode = temp;
            }

            if (count == left - 1) {
                leftPrev = temp;
            }

            if (count == right) {
                rightNode = temp;
                rightNext = temp.next;
                break;
            }

            temp = temp.next;
            count++;
        }

        
        ListNode previous = null;
        ListNode next;

        temp = leftNode;

        while (temp != rightNext) {
            next = temp.next;
            temp.next = previous;
            previous = temp;
            temp = next;
        }

        
        if (leftPrev != null) {
            leftPrev.next = rightNode;
        } else {
            head = rightNode;
        }

        leftNode.next = rightNext;

        return head;
    }
}