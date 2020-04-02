//18计本1_18210559009_武文浩_JAVA0803
package com.InheritanceAndPolymorphism.RestaurantDemo;

public class Restaurant_2 extends Restaurant {
    private String soap;
    public Restaurant_2(){
        super();
    }
    public Restaurant_2(String special){
        super(special);
    }
    public Restaurant_2(String food,double price,int count,String soap){
        super(food,price,count);
        setSoap(soap);
    }

    @Override
    public void printSpecial() {
        System.out.println("天啦噜！二食堂怎么会有这么好吃的"+getSpecial());
    }

    public void giveSoap(){
        System.out.println("每购买一份"+getFood()+"赠送"+getSoap()+"!");
    }
    public String getSoap() {
        return soap;
    }

    public void setSoap(String soap) {
        this.soap = soap;
    }
}
