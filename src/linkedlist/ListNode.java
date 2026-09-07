package linkedlist;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(5,null);
        ListNode o4 = new ListNode(4,o5);
        ListNode o3 = new ListNode(3,o4);
        ListNode o2 = new ListNode(2,o3);
        ListNode o1 = new ListNode(1,o2);
        System.out.println(o1);
        ListNode n1 = reverseList(o1);
        System.out.println(n1);
    }

    public static ListNode reverseList(ListNode o1){
        ListNode n1 = null;
        ListNode p = o1;
        while (p != null){
            n1 = new ListNode(p.val,n1);
            p = p.next;
        }
        return  n1;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder(64);
        sb.append("[");
        ListNode p = this;
        while (p != null ){
            sb.append(p.val);
            if(p.next != null){
                sb.append(",");
            }
            p = p.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
