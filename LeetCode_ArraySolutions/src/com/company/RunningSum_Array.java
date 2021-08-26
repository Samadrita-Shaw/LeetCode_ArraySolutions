package com.company;

public class RunningSum_Array
{
    public int[] runningSum(int[] nums) {
        int[] rsum= new int[nums.length];
        int sum=nums[0];
        rsum[0]=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            rsum[i]=sum+nums[i];
            sum=rsum[i];
        }
        return rsum;
    }
}
