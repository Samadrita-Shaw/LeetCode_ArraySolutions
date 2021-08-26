package com.company;

public class Product_ofArray {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i=0; i<left.length; i++)
        {
            left[i]=p*nums[i];
            p=left[i];
        }
        p=1;
        for(int i=right.length-1; i>=0; i--)
        {
            right[i]=p*nums[i];
            p=right[i];
        }
        for(int i=0; i<ans.length; i++)
        {
            if(i==0)
                ans[i]=right[1];
            else if(i==ans.length-1)
                ans[i]=left[i-1];
            else
                ans[i]=left[i-1]*right[i+1];
        }
        return ans;
    }
}
