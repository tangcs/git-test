package com.sort;

/**
 * 插入排序
 * 从第2个数开始，与前面所有的数进行比较，将较小的数放前面。当与左边最靠近的数比较时，比左边的数大，
 * 说明左边的数都已经排好序，应结束该趟比较，继续下一趟比较。
 */
public class InsertSort {
    public static void main(String[] args) {
       int[] arr={5,1,15,3,9,34,14};
        int[] reList = sort(arr);
        for (int i = 0; i < reList.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] sort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =i+1; j >0; j--) {
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else if (arr[j]>arr[j-1]){
                    break;
                }
            }
        }
        return arr;
    }
}
