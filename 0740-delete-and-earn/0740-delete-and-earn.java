class Solution {
    HashMap<Integer,Integer> cache = new HashMap<>();
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int maxi = nums[0];
        for(int num : nums){
            maxi = Math.max(maxi,num);

            if(map.containsKey(num)){
                map.put(num,map.get(num) + num);
            }else{
                map.put(num,num);
            }
        }        

        return func(maxi,map);
    }

    int func(int n, HashMap<Integer,Integer> map){
        if(cache.containsKey(n)) {
            return cache.get(n);
        }       
        
        if(n == 0)return 0;

        if(n == 1)return map.getOrDefault(1,0);

        cache.put(n, Math.max(map.getOrDefault(n,0) + func(n - 2,map) ,
                        func(n-1, map)));

        return cache.get(n);
        
    }
}