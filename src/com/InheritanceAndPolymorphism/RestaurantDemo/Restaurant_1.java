//18计本1_18210559009_武文浩_JAVA0803
package com.InheritanceAndPolymorphism.RestaurantDemo;

public class Restaurant_1 extends Restaurant {
    private String drink;
    public Restaurant_1(){
        super();
    }
    public Restaurant_1(String special){
        super(special);
    }
    public Restaurant_1(String food,double price,int count,String drink){
        super(food, price, count);
        setDrink(drink);
    }
    @Override
    public void printSpecial() {
        System.out.println("喜大普奔，一食堂隆重推出"+getSpecial());
    }

    public void giveDrink(){
        System.out.println("每购买一份"+getFood()+"赠送"+getDrink()+"!");
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
