//18计本1_18210559009_武文浩_JAVA0803
package com.InheritanceAndPolymorphism.RestaurantDemo;

public class RestaurantSell {
    public static void main(String[] args) {
        Restaurant sell = new Restaurant("红烧牛肉面");
        sell.printSpecial();
        Restaurant_1 sell1 = new Restaurant_1("老坛酸菜牛肉面");
        sell1.printSpecial();
        Restaurant_2 sell2 = new Restaurant_2("香辣牛肉面");
        sell2.printSpecial();
        System.out.printf("");
    }

}
