package com.company;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int i, top=0, down=matrix.length-1, left=0, right=matrix[0].length-1;
        int dir=0;
        while(top<=down && left<=right)
        {
            if(dir==0)    //from left to right
            {
                for(i=left; i<=right; i++)
                {
                    list.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir==1)   //from top to down
            {
                for(i=top; i<=down; i++)
                {
                    list.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2)  //from right to left
            {
                for(i=right; i>=left; i--)
                {
                    list.add(matrix[down][i]);
                }
                down--;
            }
            else       //from down to top
            {
                for(i=down; i>=top; i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return list;
    }
}
