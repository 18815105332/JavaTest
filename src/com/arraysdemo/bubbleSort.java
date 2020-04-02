//18计本1_18210559009_武文浩_JAVA0403
package com.arraysdemo;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arrays = {20,10,30,50,40,90,80,60,70,100};
        for (int i = 0;i<arrays.length-1;i++){
            for (int j = 0;j<arrays.length-i-1;j++){
                if(arrays[j]<arrays[j+1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                }
            }
        }
        System.out.println("冒泡排序后结果为:");
        for (int i = 0;i<arrays.length;i++)
            System.out.print(arrays[i]+"\t");
    }
}
