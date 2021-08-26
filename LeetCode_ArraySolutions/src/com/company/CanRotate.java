package com.company;

public class CanRotate {
    public boolean findRotation(int[][] mat, int[][] target)
    {
        for(int i=0; i<4; i++)
        {
            rotate(mat);
            if (Arrays.deepEquals(mat, target))
                return true;
        }
        return false;
    }

    public void rotate(int[][] matrix)
    {
        int start=0,end=matrix.length-1;
        while(start<end)
        {
            int[] temp= matrix[start];
            matrix[start]= matrix[end];
            matrix[end]= temp;
            start ++;
            end--;

        }
        for (var i = 0; i < matrix.length; i++)
        {
            for (var j = i + 1; j < matrix[0].length; j++)
            {
                var temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
