package queue;


public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val) {this.val = val;}

    public TreeNode( TreeNode left, int val,TreeNode right) {
        this.left=left;
        this.right=right;
        this.val=val;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }
}
