//18计本1_18210559009_武文浩_JAVA0603
package com.classAndObject;

public class phone {
    /**品牌*/
    public String brand;
    /**价格*/
    public double price;
    /**颜色*/
    public String color;
    /**打电话*/
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    /**发短信*/
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
