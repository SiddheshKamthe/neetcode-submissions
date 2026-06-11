class Solution {
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head, fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode second = reverse(slow);

        ListNode first = head;

        while (first != null && second != null) {
            ListNode t1 = first.next;
            ListNode t2 = second.next;

            first.next = second;
            if (t1 == null) break;

            second.next = t1;

            first = t1;
            second = t2;
        }
    }
}
