//24. 两两交换链表中的节点
public class Solution_24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        // 终止条件，如果只剩一个节点或者一个都没有，返回
        if (head == null || head.next == null) {
            return head;
        }
        // 交换三个节点中的前两个节点，从head -> next -> next.next 到 next -> head -> next.next
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
