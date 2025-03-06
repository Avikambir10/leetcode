class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        // Key: number from nums, Value: index where it appears
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array once
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement: the number we need to reach the target
            int comp = target - nums[i];

            // Check if the complement exists in the HashMap
            if (map.containsKey(comp)) {
                // If found, return an array with the complement's index and current index
                // map.get(comp) gives the index of the complement
                return new int[] { map.get(comp), i };
            }

            // If complement not found, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        // (Problem guarantees a solution exists, so this is just for completeness)
        return new int[] {};
    }
}
