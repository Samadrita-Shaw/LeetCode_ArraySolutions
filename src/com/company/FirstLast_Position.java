package com.company;

public class FirstLast_Position {
    public int[] searchRange(int[] nums, int target)
    {
        int[] out=new int[2];
        int c=0;
        for (int i = 0; i < nums.length; i++)
        {
            if((nums[i]==target && i==0) || (nums[i]==target && nums[i-1]!=target))
            {
                out[0]=i;
                c++;
            }
            if((nums[i]==target && i==nums.length-1) || (nums[i]==target && nums[i+1]!=target))
            {
                out[1]=i;
                c++;
                break;
            }
        }
        if(c==0)
        {
            out[0]=out[1]=-1;
        }
        else if(c==1)
            out[1]=out[0];

        return out;
    }
}
