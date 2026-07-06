
class Solution {
HashMap<Integer, Integer> map= new HashMap<>();
int preindex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {

for (int i=0;i<inorder.length ;i++){
    map.put(inorder[i],i);

}

return helper(preorder,0,inorder.length-1);
        
    }
    TreeNode helper(int[]preorder,int left,int right){
        if(left>right) return null;

    TreeNode root = new TreeNode(preorder[preindex++]);

    int mid = map.get(root.val);
    root.left = helper(preorder, left, mid - 1);
    root.right = helper(preorder, mid + 1, right);
    return root;

    }
}