package com.company;

public class GreatestNo_Candies
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        int max=0;
        for(int candy: candies){
            max=Math.max(candy,max);
        }
        for(int candy:candies){
            list.add(candy+extraCandies>=max);
        }

        return list;
    }
}
