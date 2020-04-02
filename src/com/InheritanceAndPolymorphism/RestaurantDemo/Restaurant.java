//18计本1_18210559009_武文浩_JAVA0803
package com.InheritanceAndPolymorphism.RestaurantDemo;

public class Restaurant {
    private String food;
    private double price;
    private int count;
    private String special;
    public Restaurant(){
        super();
    }
    public Restaurant(String special){
        setSpecial(special);
    }
    public Restaurant(String food,double price,int count){
        setFood(food);
        setPrice(price);
        setCount(count);
    }
    public void printSpecial(){
        System.out.println("今日特色菜"+special+"!\n一食堂有特色菜“黄焖鸡”!\n二食堂有特色菜“豆花鱼”!");
    }

    public void sell(){
        count--;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
}
