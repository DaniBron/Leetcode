import sun.tools.tree.ArrayAccessExpression;
/*
    Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
    1
   / \
  2   2
 / \ / \
3  4 4  3

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
*/
class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x)
    {
        val = x;
    }
}

class SymmetricTree
{
    public boolean isSymmetric(TreeNode root) 
    {
        if(root == null)
            return true;
        return checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(TreeNode left, TreeNode right) 
    {
        if(right == null && left == null)
            return true;

        else if(right != null && left == null)
            return false;

        else if(right == null && left != null)
            return false;

        if(right.val != left.val)
            return false;
        
        if(!checkSymmetric(left.left, right.right))
            return false;
        
        if(!checkSymmetric(right.left, left.right))
            return false;

		return true;
	}
}