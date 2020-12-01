package edu;

public class MinCostSolution {

    public static final char INVALID = '-';

    public static int solve(String key, int[] cost){
        if (key == null || key.isEmpty() || cost == null || key.length() != cost.length){
            return INVALID;
        }
        int costNumbers = cost[0];
        int maxCost = cost[0];
        for (int i = 1; i < key.length(); i++){
            if (key.charAt(i) != key.charAt(i-1)){
                costNumbers -= maxCost;
                maxCost = 0;
            }
            costNumbers += cost[i];
            maxCost = Math.max(maxCost, cost[i]);
        }
        System.out.println(costNumbers - maxCost);
        return costNumbers - maxCost;
    }
}
