package com.company;

public class IntegerSum_uptoZero {
    public int[] sumZero(int n)
    {
        int[] arr = new int[n];
        int k=-n/2;
        for(int i=0; i<n ;i++)
        {
            if(n%2==0 && k==0)
            {
                k=k+1;
            }
            arr[i]=k;
            k++;
        }
        return arr;
    }
}
