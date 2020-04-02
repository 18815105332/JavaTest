//18计本1_18210559009_武文浩_JAVA0403
package com.arraysdemo;

public class selectSort {
    public static void main(String[] args) {
        int[] arrays = {20,10,30,50,40,90,80,60,70,100};
        for (int i = 0;i<arrays.length;i++){
            int max = arrays[i];
            int maxIndex = i;
            for (int j = i+1;j<arrays.length;j++){
                if (arrays[j]>max){
                    max = arrays[j];
                    maxIndex = j;
                }
            }
            int temp = arrays[i];
            arrays[i] = arrays[maxIndex];
            arrays[maxIndex] = temp;
        }
        System.out.println("选择排序后结果为：");
        for (int i = 0;i<arrays.length;i++)
            System.out.print(arrays[i]+"\t");
    }
}
