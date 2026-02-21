/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int total = 0;

    public int pathSum(TreeNode root, int targetSum) {

        HashMap<Long, Integer> map = new HashMap<>();

        map.put(0L, 1);

        findpathsum(root, 0L, targetSum, map);

        return total;
    }

    private void findpathsum(TreeNode node, long sum, int target, HashMap<Long, Integer> map) {

        if (node == null) return;

        sum += node.val;

        if (map.containsKey(sum - target)) {
            total += map.get(sum - target);
        }

        map.put(sum, map.getOrDefault(sum, 0) + 1);

        findpathsum(node.left, sum, target, map);
        findpathsum(node.right, sum, target, map);

        // backtrack
        map.put(sum, map.get(sum) - 1);
    }
}
