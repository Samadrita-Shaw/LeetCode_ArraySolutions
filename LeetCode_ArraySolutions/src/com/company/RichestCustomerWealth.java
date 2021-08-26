package com.company;

public class RichestCustomerWealth
{
    public int maximumWealth(int[][] accounts) {

        int sum=0,max=0;
        for (int customer = 0; customer < accounts.length; customer++) {
            sum=0;
            for(int bank=0; bank<accounts[customer].length; bank++)
            {
                sum= sum+accounts[customer][bank];
            }
            if(sum>max)
                max=sum;
        }
        return max;
    }
}
