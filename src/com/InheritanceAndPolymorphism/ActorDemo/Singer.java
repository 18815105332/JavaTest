//18计本1_18210559009_武文浩_JAVA0804
package com.InheritanceAndPolymorphism.ActorDemo;

public class Singer extends Actor {
    public Singer(){
        super();
    }
    public Singer(String name){
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("歌唱演员"+getName()+"正在表演歌唱节目《在这桃花盛开的地方》");
    }
}
