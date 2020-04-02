//18计本1_18210559009_武文浩_JAVA0804
package com.InheritanceAndPolymorphism.ActorDemo;

public class CrossActorV1 extends Actor{
    public CrossActorV1(){
        super();
    }
    public CrossActorV1(String name){
        super(name);
    }

    @Override
    public void perform() {
        System.out.println(getName()+"：相声讲究拖鞋就唱。。。。。");
    }
}
