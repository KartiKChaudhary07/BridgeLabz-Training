class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    public int helper(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(helper(node.left), 0);
        int right = Math.max(helper(node.right), 0);

        int sum = node.val + left + right;
        ans = Math.max(ans, sum);

        return node.val + Math.max(left, right);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        /*
              -10
              /  \
             9   20
                / \
               15  7
        */

        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        Solution obj = new Solution();
        int result = obj.maxPathSum(root);

        System.out.println("Maximum Path Sum = " + result);
    }
}
