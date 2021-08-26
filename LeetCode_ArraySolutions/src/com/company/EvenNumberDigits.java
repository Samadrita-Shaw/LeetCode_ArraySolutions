package com.company;

public class EvenNumberDigits {
    public int findNumbers(int[] nums) {
        int n,c=0,ctr=0;
        for(int i=0;i<nums.length; i++)
        {
            c=0;
            n=nums[i];
            while(n>0)
            {
                c++;
                n=n/10;
            }
            if(c%2==0)
                ctr++;
        }
        return ctr;
    }
}
