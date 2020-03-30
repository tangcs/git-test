package com.sort;



//选择排序

/**
 * 从第1个数开始，与后面所有的数进行比较，选出最小的数排最前面。
 * 从i=0开始，比较a[i]与a[i+1], 如果a[i]<a[i+1], a[i]与a[i+1]交换位置, i++
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr={5,1,15,3,9,34,14};
        int[] sedList = sort(arr);
        for (int i = 0; i < sedList.length; i++) {
            System.out.print(sedList[i]+" ");
        }

    }
    public static int[] sort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
