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

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode tem = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tem;
        }
        return prev;

//        bad way ->
//        int n = 1;
//        ListNode co = head;
//        while (co != null && co.next != null){
//            n ++;
//            co = co.next;
//        }
//        ListNode newH = null;
//        ListNode newl = null;
//        ListNode val = null;
//        ListNode tem = null;
//        while (n > 0){
//            co = head;
//            for (int i =0; i < n; i ++){
//                val = co;
//                co = co.next;
//            }
//            n --;
//
//            if (newl == null){
//                val.next = tem;
//                newl = val;
//                newH = newl;
//            } else {
//                val.next = null;
//                newl.next = val;
//                newl= newl.next;
//            }
//        }
//        return newH;
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

        ListNode te = reverseList(one);
        while ( te.next != null){
            System.out.println(te.val);
            te = te.next;
        }
    }
}