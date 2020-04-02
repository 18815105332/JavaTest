//18计本1_18210559009_武文浩_JAVA0804
package com.InheritanceAndPolymorphism.ActorDemo;

import java.io.IOException;
import java.util.Properties;

public class ChunWanTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Director 张艺谋 = new Director();
        Singer 宋祖英 = new Singer("宋祖英");
        Dancer 杨丽萍 = new Dancer("杨丽萍");
        //Actor actor = new Actor("吴宗宪");
        张艺谋.action(宋祖英);
        张艺谋.action(杨丽萍);
        //张艺谋.action(actor);
        /**1、模拟程序的升级，要求添加相声演员，核心业务代码不变*/
        CrossActor 冯巩 = new CrossActor("冯巩");
        张艺谋.action(冯巩);
        /**2、要求实现main方法中的代码也不修改的情况下，实现某个角色的升级*/
        Properties props = new Properties();
        props.load(ChunWanTest.class.getResourceAsStream("ActorConfig.properties"));
        Actor actor = (Actor)Class.forName(props.getProperty("crossActor")).newInstance();
        actor.setName("郭德纲");
        张艺谋.action(actor);
    }
}
