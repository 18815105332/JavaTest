//18计本1_18210559009_武文浩_JAVA0603
package com.classAndObject;

public class phoneTest {
    public static void main(String[] args) {
        phone one = new phone();
        one.brand = "苹果";
        one.price = 8388.0;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("===========================");
        one.call("乔布斯");
        one.sendMessage();
    }
}
