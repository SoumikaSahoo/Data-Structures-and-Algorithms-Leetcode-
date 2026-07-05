
class Solution {
      List<Integer>inorder=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return inorder.get(k-1);
    }
    void inorder(TreeNode root){
         if(root==null) return ;
    inorder(root.left);

    inorder.add(root.val);

    inorder(root.right);
}
    }
