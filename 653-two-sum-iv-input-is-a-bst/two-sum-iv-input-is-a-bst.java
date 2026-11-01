
class Solution {
    HashSet<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }

        int required = k - root.val;

        if (set.contains(required)) {
            return true;
        }

        set.add(root.val);

        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
