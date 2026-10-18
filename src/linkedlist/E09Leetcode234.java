package linkedlist;

import java.util.Objects;

public class E09Leetcode234 {

    public boolean isPalindrome(ListNode h1){
        ListNode p1 = h1;
        ListNode p2 = h1;
        ListNode n1 = null;
        ListNode o1 = h1;

        while (p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;

            //反转
//            ListNode o2 = o1.next;
            o1.next = n1;
            n1 = o1;
            o1 = p1;
        }

        // handle list with size of even number
        if(p2 != null){
            p1 = p1.next;
        }

        while (n1 != null){
            if(!Objects.equals(n1.val, p1.val)){
                return false;
            }
            n1 = n1.next;
            p1 = p1.next;
        }
        return true;
    }

    public boolean isPalindrome1(ListNode h1){
        ListNode midlle = middle(h1);
        System.out.println(midlle);
        ListNode newHead = reverse(midlle);
        System.out.println(newHead);
        while (newHead != null){
            if (!Objects.equals(newHead.val, h1.val)){
                return false;
            }
            newHead = newHead.next;
            h1 = h1.next;
        }
        return true;
    }

    private ListNode reverse(ListNode o1){
        ListNode n1 = null;
        while (o1 !=null){
            ListNode o2 = o1.next;
            o1.next = n1;
            n1 = o1;
            o1 = o2;
        }
        return n1;
    }

    private ListNode middle(ListNode head){
        ListNode p1 = head;
        ListNode p2 = head;

        while (p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        return p1;
    }

    public static void main(String[] args) {

        System.out.println(new E09Leetcode234().isPalindrome(ListNode.of(1,2,2,1)));
        System.out.println(new E09Leetcode234().isPalindrome(ListNode.of(1,2,3,2,1)));


    }
}
