//18计本1_18210559010_向思佳_JAVA0302
package com.structure;

public class seller {
    public static void main(String[] args) {
        int year = 2019;
        double money = 2684;
        while(money<=5000){
            year++;
            money*=1.25;
        }
        System.out.printf("%d年交易额可以突破%.2f亿元！",year,money);
    }
}
