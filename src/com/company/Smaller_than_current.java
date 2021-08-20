package com.company;

public class Smaller_than_current
{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int c=0;
        for(int i=0; i<nums.length; i++)
        {
            c=0;
            for(int num:nums)
            {
                if(nums[i]>num)
                    c++;
            }
            arr[i]=c;
        }
        return arr;
    }
}
