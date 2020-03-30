package com.sort;

//冒泡排序

/**
 * 从后往前，与前一个数进行比较，如果比自己大，那么交换位置。当然也可以从前往后。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,1,15,3,9,34,14};
        int[] resultList = buSort(arr);
        for (int i = 0; i < resultList.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static int[] buSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
