class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        Map<Integer, Integer> map = new HashMap<>();

        return Math.min(dp(cost,map,cost.length-1) , 
                        dp(cost,map,cost.length -2));
    }

    int dp(int[] cost,Map<Integer, Integer> map ,int i){
        if(i < 0){return 0;}

        if(i == 1 || i==0 ){
            return cost[i];
        }

        if(map.containsKey(i)){
            return map.get(i);
        }


        map.put(i, cost[i] + Math.min(dp(cost, map,i - 2), dp(cost, map, i - 1)));

        return map.get(i);
    }
}