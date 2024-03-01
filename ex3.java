public class ex3 {
    
    static ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode reverseOther = reverseList(head.next);
        ListNode temp = reverseOther;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return reverseOther;
    }
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        ListNode newHead = reverseList(first);
        while(newHead != null) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }
        System.out.println("done");
    }

}
