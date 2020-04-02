//18计本1_18210559010_向思佳_JAVA0302
package com.structure;

public class table {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<4-i;j++){
                System.out.print(" ");
            }
            for (j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
        for (i=1;i<=9;i++){
            for (j=1;j<=i;j++){
                System.out.print(j+"×"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
