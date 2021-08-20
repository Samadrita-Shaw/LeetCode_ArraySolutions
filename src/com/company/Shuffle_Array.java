package com.company;

public class Shuffle_Array
{
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int k=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2==0)
                arr[i]=nums[k];
            else{
                arr[i]=nums[n+k];
                k++;
            }
        }
        return arr;
    }
}
