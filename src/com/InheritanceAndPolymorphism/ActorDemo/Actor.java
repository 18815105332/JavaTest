//18计本1_18210559009_武文浩_JAVA0804
package com.InheritanceAndPolymorphism.ActorDemo;

public abstract class Actor {
    private String name;
    public Actor(){ }
    public Actor(String name){
        setName(name);
    }
    public void perform(){
        System.out.println("演员"+name+"正在表演精彩的节目");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
