//18计本1_18210559009_武文浩_JAVA0404
package com.arraysdemo;

public class fibonacci {
    public static void main(String[] args) {
        final int N = 50;
        long[] fiNums = new long[N];
        fiNums[0] = 0;
        fiNums[1] = 1;
        for (int i = 2;i<fiNums.length;i++){
            fiNums[i] = fiNums[i-1]+fiNums[i-2];
        }
       System.out.printf("黄金比例值为：%.10f",fiNums[49]/1.0/fiNums[48]);
    }
}
