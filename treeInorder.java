import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
*/

class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode(int x) { val = x; }
}

class treeInorder
{
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> treeStack = new Stack<>();
        if(root == null)
            return list;

        TreeNode curr = root;

        while(curr != null || !treeStack.isEmpty())
        {
            while(curr != null)
            {
                treeStack.push(curr);
                curr = curr.left;
            }

            curr = treeStack.pop();
            list.add(curr.val);
            curr = curr.right;
        }

        return list;
    }
}