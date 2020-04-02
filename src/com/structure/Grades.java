//18计本1_18210559010_向思佳_JAVA0302
package com.structure;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生成绩：");
        int score = input.nextInt();
        if (score>=60&&score<=69){
            System.out.println("及格");
        }else if (score>=70&&score<=79){
            System.out.println("中等");
        }else if (score>=80&&score<=89){
            System.out.println("良好");
        }else if (score>=90){
            System.out.println("优秀");
        }else{
            System.out.println("不合格");
        }
    }
}
