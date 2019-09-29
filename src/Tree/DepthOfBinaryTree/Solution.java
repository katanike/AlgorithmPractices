package Tree.DepthOfBinaryTree;




import CommonDataStructure.TreeNode;

import java.util.Stack;

/**
 * Calculate the depth of a binary tree;
 */

public class Solution {

    //recursive depth()
    public int recDepth(TreeNode p) {
        int ldepth, rdepth;

        if (p == null)
            return 0;
        else {
            ldepth = recDepth(p.left);
            rdepth = recDepth(p.right);
            return Math.max(ldepth, rdepth) + 1;
        }
    }

    //non-recursive depth();
    //中序非递归
    public int nonRecDepth(TreeNode p) {
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<Integer> stack2 = new Stack<Integer>();
        int curdep, maxdep = 0;

        curdep = 1;
        while (p != null || stack1.empty() == false) {
            while (p != null) {
                stack1.push(p);
                stack2.push(curdep);
                p = p.left;
                curdep++;
            }
            p = stack1.pop();
            curdep = stack2.pop();
            if (p.left == null && p.right == null)
                maxdep = Math.max(curdep, maxdep);
            p = p.right;
            curdep++;
        }
        return maxdep;

    }

    //前序非递归
    public int prenonRecDepth(TreeNode p) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<Integer> s2 = new Stack<Integer>();
        int curdep, maxdep = 0;

        curdep = 1;
        while (p != null || s1.empty() == false) {
            while (p != null) {
                if (p.left == null && p.right == null)
                    maxdep = Math.max(curdep, maxdep);
                s1.push(p);
                s2.push(curdep);
                p = p.left;
                curdep++;
            }
            p = s1.pop();
            curdep = s2.pop();

            p = p.right;
            curdep++;
        }
        return maxdep;

    }

}
