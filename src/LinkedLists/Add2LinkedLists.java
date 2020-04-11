package LinkedLists;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

public class Add2LinkedLists {
    ListNode head;
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int data) {
            this.val = data;
            next = null;
        }
    }

    public void print() {
        ListNode n = head;
        while(n != null) {
            System.out.print(n.val);
            n = n.next;
        }
        System.out.println("");
    }

    public ListNode add(ListNode l1, ListNode l2){
        ListNode p = l1; ListNode q = l2;
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while(p != null || q !=null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = x+y+carry;
            carry=sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        Add2LinkedLists list = new Add2LinkedLists();
        list.head = new ListNode(2);
        ListNode sec = new ListNode(4);
        ListNode thr = new ListNode(3);
        list.head.next = sec; sec.next = thr;
        list.print();

        Add2LinkedLists list2 = new Add2LinkedLists();
        list2.head = new ListNode(5);
        ListNode sec2 = new ListNode(6);
        ListNode thr2 = new ListNode(4);
        list2.head.next = sec2; sec2.next = thr2;
        list2.print();

        ListNode ls = list.add(list.head, list2.head);
        while(ls!=null) {
            System.out.print(ls.val+"->");
            ls = ls.next;
        }
    }
}
