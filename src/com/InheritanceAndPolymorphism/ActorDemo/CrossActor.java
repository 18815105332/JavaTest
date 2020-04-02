//18计本1_18210559009_武文浩_JAVA0804
package com.InheritanceAndPolymorphism.ActorDemo;

public class CrossActor extends Actor{
    public CrossActor(){
        super();
    }
    public CrossActor(String name){
        super(name);
    }

    @Override
    public void perform() {
        System.out.println(getName()+"现在相声不景气啦，我只能说：想死你们了！");
    }
}
