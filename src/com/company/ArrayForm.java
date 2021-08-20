package com.company;
/* This solution is done by using ArrayList, so took 43 ms runtime. Codes with lesser runtime are welcome.*/

public class ArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>(3);
        int s=0,carry=0;

        for(int i=num.length-1; i>=0; i--)
        {
            s=num[i]+k%10;
            list.add(0,s%10);
            carry=s/10;
            k=(k/10)+carry;
        }
        if(k!=0)
        {
            while(k>0)
            {
                list.add(0,k%10);
                k=k/10;
            }
        }
        return list;
    }
}
