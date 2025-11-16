class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxi = 0;

        int n = nums.length;
        for(int num : nums) maxi = Math.max(maxi,num);

        int [] points = new int[maxi + 1];

        for(int num : nums) points[num] += num;

        int[] dp = new int[maxi + 1];

        dp[0] = 0;
        dp[1] = points[1];

        for(int i = 2; i <= maxi; i++) {
            dp[i]= Math.max(dp[i-2] + points[i] , dp[i-1]);
        }

        return dp[maxi];
    }

    
}