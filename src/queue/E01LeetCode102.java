package queue;

import java.util.List;

public class E01LeetCode102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                new TreeNode(new TreeNode(4),2,new TreeNode(5)),
                1,
                new TreeNode(new TreeNode(6),3,new TreeNode(7)));

        LinkedListQueue<TreeNode> queue = new LinkedListQueue<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode n = queue.pool();
            System.out.println(n);
            if(n.getLeft() != null){
                queue.offer(n.getLeft());
            }
            if(n.getRight() != null){
                queue.offer(n.getRight());
            }
        }
    }
}
