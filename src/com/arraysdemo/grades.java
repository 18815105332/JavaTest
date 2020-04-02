//18计本1_18210559009_武文浩_JAVA0402
package com.arraysdemo;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class grades {
    public static void main(String[] args) {
         int[] grades = {80,85,96,74,67};
         int maxGrade = MIN_VALUE, minGrade = MAX_VALUE;
         int sumGrade = 0,avg;
         for (int i = 0;i<grades.length;i++){
             sumGrade += grades[i];
             if (grades[i]>maxGrade)
                 maxGrade = grades[i];
             else if(grades[i]<minGrade)
                 minGrade = grades[i];
         }
        System.out.println("最高成绩为："+maxGrade+"\n最低成绩为："+minGrade+"\n总成绩为："+sumGrade+"\n平均成绩为："+(sumGrade/1.0/grades.length));
    }
}
