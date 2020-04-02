//18计本1_18210559010_向思佳_JAVA0302
package com.structure;

import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        final String PASSWORD = "123456";
        Scanner input = new Scanner(System.in);
        String password = null;
        int i = 0;
        while(i<3){
            System.out.print("请输入密码：");
            password = input.next();
            i++;
            if(!PASSWORD.equals(password)){
                if(i == 3){
                    System.out.println("密码输入错误已达三次，强制退出系统！");
                    System.exit(0);
                }else{
                    System.out.println("密码输入错误，请重新输入！（剩余"+(3-i)+"次)");
                }
            }else break;
        }
        System.out.println("密码正确，成功登录本系统！");
    }
}
