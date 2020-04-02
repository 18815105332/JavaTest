package com.classAndObject;

public class character {
    /**角色的名称*/
    private String name;
    /**角色的等级*/
    private int level;
    /**角色的职业*/
    private String professor;
    private String skill;
    /**构造方法*/
    public character(){}
    public character(String name,int level,String professor){
        this.name = name;
        this.level = level;
        this.professor = professor;
    }
    /**释放技能*/
    public String getSkill(){
        if (name.equals("旋涡·那鲁托")){
            skill = "螺旋丸";
        }else if(name.equals("宇智波·撒斯给")){
            skill = "天照";
        }else{
            skill = "一枚手里剑";
        }
        return skill;
    }
    public void printSkill(){
        System.out.println(name+"对你释放了："+this.getSkill());
    }
    /**查看属性*/
    public void showCharacter(){
            System.out.println("名称："+name);
            System.out.println("等级："+level);
            System.out.println("职业："+professor);
    }
}
