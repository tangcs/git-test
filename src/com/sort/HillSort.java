package com.sort;

/**
 * 希尔排序
 * 在要排序的一组数中，根据间隔分为若干子序列，并对子序列分别进行插入排序。
 * 然后逐渐将间隔缩小,并重复上述过程。直至间隔为1,此时数据序列基本有序,最后进行插入排序。
 */
public class HillSort {
    public static void main(String[] args) {
        int[] arr={5,1,15,3,9,34,14};
        int[] reList = sort(arr);
        for (int i = 0; i < reList.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] sort(int[] arr){
        int temp;
        int gap=arr.length;
        do{
            gap=gap/3+1;
            for(int i=gap;i<arr.length;i+=gap){
                for(int j=i-gap;j>=0;j-=gap){
                    if(arr[j]>arr[j+gap]){
                        temp=arr[j];
                        arr[j]=arr[j+gap];
                        arr[j+gap]=temp;
                    }
                }
            }

        }while(gap>1);

        return arr;
    }
}
