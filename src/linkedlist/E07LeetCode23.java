package linkedlist;

public class E07LeetCode23 {
    public ListNode mergeTwoLists(ListNode p1,ListNode p2){
        ListNode result = new ListNode(-1,null);
        ListNode currPoint = result;
        ListNode a = p1;
        ListNode b = p2;

        while (a != null && b!= null){

            int val ;

            if(a.val < b.val){
                val = a.val;
                a = a.next;
            }else{
                val = b.val;
                b = b.next;
            }
            currPoint.next= new ListNode(val,null);
            currPoint = currPoint.next;
        }


        if(a!=null){
            currPoint.next = a;
        }

        if(b != null){
            currPoint.next = b;
        }

        return result.next;
    }

    public ListNode mergeKList(ListNode[] lists){
        if(lists.length==0){
            return null;
        }

        return split(lists,0,lists.length-1);

    }

    private ListNode split(ListNode[] lists,int i,int j){
        if(i == j){
            return lists[i];
        }
        int m = (i+j) >>>1;
       ListNode left =  split(lists,i,m);
       ListNode right = split(lists,m+1,j);
       return mergeTwoLists(left,right);

    }

    public static void main(String[] args) {
        ListNode[] lists = {
                ListNode.of(1,4,5),
                ListNode.of(1,3,4),
                ListNode.of(2,6)
        };

        ListNode m = new E07LeetCode23().mergeKList(lists);
        System.out.println(m);
    }
}
