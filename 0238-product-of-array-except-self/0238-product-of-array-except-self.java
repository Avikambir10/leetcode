class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
        }
        //prefix 
        // 1 1
        // suffix 
        //      3  1

        int[] suffix = new int[n];
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = nums[i+1] * suffix[i +1];
        }
        
        int[] ans = new int[n];
        
        for(int i = 0; i< n ;i++){
            ans[i] = prefix[i]* suffix[i];
        }
        
        return ans;

        
        // int n = nums.length;
        // int []ans = new int[n];
        // for(int i=0;i<nums.length;i++){
        //     int product = 1;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             continue;
        //         }
        //         product = product*nums[j];
        //     }
        //     ans[i] = product;
        // }
        // return ans;
        
    }
}