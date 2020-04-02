//18计本1_18210559009_武文浩_JAVA0402
package com.method;

import java.util.Scanner;

public class sumMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入两个整数：");
        int a = input.nextInt();
        int b = input.nextInt();
        getSum(a,b);
        System.out.print("请输入两个浮点数：");
        float c = input.nextFloat();
        float d = input.nextFloat();
        getSum(c,d);
    }
    public  static void getSum(int a, int b){
        int result = a+b;
        System.out.println("两个整数的和为："+result);
    }
    public static void getSum(float a,float b){
        float result = a+b;
        System.out.println("两个浮点数的和为："+result);
    }
}
