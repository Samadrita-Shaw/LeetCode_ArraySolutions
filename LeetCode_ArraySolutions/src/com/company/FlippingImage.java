package com.company;

public class FlippingImage {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0; i<image.length; i++)
        {
            int start=0,end=image[i].length-1;
            while(start<end)
            {
                swap(image[i], start, end);
                start++;
                end--;
            }
            for(int j=0; j<image[i].length; j++)
            {
                if(image[i][j]==0)
                    image[i][j]=1;
                else
                    image[i][j]=0;
            }
        }
        return image;
    }
    public static void swap(int[] arr, int index1, int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
