package com.company;

public class CellWithOddValues {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        int ctr=0;
        for(int ind=0; ind<indices.length; ind++)
        {
            for(int col=0; col<n; col++)
            {
                matrix[indices[ind][0]][col]++;
            }
            for(int row=0; row<m; row++)
            {
                matrix[row][indices[ind][1]]++;
            }
        }
        for(int i=0; i<m; i++)
        {
            for(int val:matrix[i])
            {
                if(val%2!=0)
                    ctr++;
            }
        }
        return ctr;
    }
}
