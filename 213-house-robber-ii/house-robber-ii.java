class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);
        int dp[]=new int[3];
       Arrays.fill(dp,0);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<=n-2;i++){
            dp[2]=Math.max(nums[i]+dp[0],dp[1]);
            dp[0]=dp[1];
            dp[1]=dp[2];
        }
        int result=dp[1];
      
       dp[0]=nums[1];
       dp[1]=Math.max(nums[1],nums[2]);

          for(int i=3;i<=n-1;i++){
            dp[2]=Math.max(nums[i]+dp[0],dp[1]);
            dp[0]=dp[1];
            dp[1]=dp[2];
        }
        
      result=Math.max(result,dp[1]);
      return result;
   
    }
  
}