package com.datatype;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入姓名：");
        String name = input.nextLine();
        Scanner input1 = new Scanner(System.in);
        System.out.print("请输入平时成绩：");
        int usualGrades = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("请输入期末成绩：");
        int finalGrades = input.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.print("请输入总评：");
        int generalGrades = input.nextInt();
        System.out.println("某班级JAVA成绩单");
        System.out.println("---------------------华丽的分隔符---------------------");
        System.out.printf("%3s%12s%12s%12s\n","姓名","平时成绩","期末成绩","总评");
        System.out.printf("%-13s%-15d%-15d%d\n","李子维",80,70,74);
        System.out.printf("%-13s%-15d%-15d%d\n",name,usualGrades,finalGrades,generalGrades);
        System.out.println("---------------------华丽的分隔符---------------------");
    }
}
