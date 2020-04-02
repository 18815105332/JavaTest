//18计本1_18210559009_武文浩_JAVA0804
package com.InheritanceAndPolymorphism.ActorDemo;

public class Dancer extends Actor {
    public Dancer(){
        super();
    }
    public Dancer(String name){
        super(name);
    }

    @Override
    public void perform() {
        System.out.println("舞蹈演员"+getName()+"正在展现她那婀娜多姿的舞蹈");
    }
}
