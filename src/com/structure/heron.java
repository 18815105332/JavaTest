//18计本1_18210559010_向思佳_JAVA0302
package com.structure;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class heron {
    public static void main(String[] args) {
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入三角形的三条边长：");
        double lineA = input.nextDouble();
        double lineB = input.nextDouble();
        double lineC = input.nextDouble();
        if(lineA+lineB>lineC&&lineC+lineA>lineB&&lineB+lineC>lineA){
            area = sqrt((lineA+lineB+lineC)*(lineA+lineB-lineC)*(lineA+lineC-lineB)*(lineB+lineC-lineA))/4;
            System.out.printf("三角形的面积为%.2f",area);
        }else{
            System.out.println("不能构成三角形！");
        }
    }
}
