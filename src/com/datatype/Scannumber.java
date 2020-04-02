package com.datatype;

import java.util.Scanner;

public class Scannumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个三位整数：");
        int num  = input.nextInt();
        int hundred = num/100;
        int ten = num/10%10;
        int one = num%10;
        System.out.println("百位数为："+hundred+"\n十位数为："+ten+"\n个位数为:"+one);
    }
}
