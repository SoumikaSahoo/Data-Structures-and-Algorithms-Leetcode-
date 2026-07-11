class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        int n = nums.length;

        int sum = 0;
        for (int x : nums)
            sum += x;

        if (Math.abs(target) > sum)
            return 0;

        if ((sum + target) % 2 != 0)
            return 0;

        sum = (sum + target) / 2;

        int[][] dp = new int[n + 1][sum + 1];

        dp[n][0] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int s = 0; s <= sum; s++) {

                if (nums[i] > s) {
                    dp[i][s] = dp[i + 1][s];
                } else {
                    int c1 = dp[i + 1][s - nums[i]];
                    int c2 = dp[i + 1][s];

                    dp[i][s] = c1 + c2;
                }
            }
        }

        return dp[0][sum];
    }
}