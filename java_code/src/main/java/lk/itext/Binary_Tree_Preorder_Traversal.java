package lk.itext;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}


public class Binary_Tree_Preorder_Traversal {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);  // Root node
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);


        // Call preorder traversal
        List<Integer> result = preorderTraversal(root);
        System.out.println(result);

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root ==null ) return list;

        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.add(root);

        while(!stack.empty()){
            TreeNode currentNode = stack.pop();
            list.add(currentNode.val);

            if (currentNode.right!= null){
                stack.add(currentNode.right);
            }
            if (currentNode.left!= null){
                stack.add(currentNode.left);
            }

        }
        return  list;
    }


}

