//83. 删除排序链表中的重复元素
public class Solution_83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode top = head;
        while (top != null && top.next != null) { // 这里我本来把top.next != null 放前面结果有问题
            if (top.val == top.next.val) {
                top.next = top.next.next;
            } else {
                top = top.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
