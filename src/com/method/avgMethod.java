//18计本1_18210559009_武文浩_JAVA0403
package com.method;

public class avgMethod {
    public static void main(String[] args) {
        int[] grades = {91,86,56,86,84};
        System.out.println("该生的平均成绩为："+avgGrade(grades));
    }
    public static float avgGrade(int...grades){
        float aGrade = 0;
        for (int i = 0;i<grades.length;i++)
            aGrade+=(float)grades[i];
        aGrade/=grades.length;
        return aGrade;
    }
}
