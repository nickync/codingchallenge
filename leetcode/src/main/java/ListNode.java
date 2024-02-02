public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        ListNode tem = head.next;
        ListNode oddd = head.next.next;

        odd.next = oddd;

        while (oddd.next != null){
            oddd = oddd.next;
        }
        oddd.next = tem;

        return odd;

    }

    public static void main(String[] args) {
        ListNode one = new ListNode();
        ListNode two = new ListNode();
        ListNode thr = new ListNode();
        ListNode four = new ListNode();
        one.val = 1;
        one.next = two;
        two.val = 2;
        two.next = thr;
        thr.val = 3;
        thr.next = four;
        four.val = 4;
        four.next = null;

        System.out.println(oddEvenList(one));
    }
}