class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low++,mid++);
            }else if(nums[mid] == 1) {
                mid++;
            }else{
                swap(nums,mid ,high--);
            }
        }

    }

    void swap(int[] nums, int l, int r) {

        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;

    }
    
}