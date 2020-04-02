//18计本1_18210559009_武文浩_JAVA0604
package com.classAndObject;

public class ComPlayer {
    public static final int MessageTypeFist = 1;
    public static final int MessageTypeWin = 2;
    public static final int MessageTypeLose = 3;
    /**姓名*/
    private String name;
    /**分数*/
    private int score;
    /**出拳*/
    private int fist;
    /**角色出拳的时候，所说的台词*/
    private String[] fistWords = {
            "必杀：摇摇晃晃真拳！",
            "像我这么帅的人就可以躺在床上赚钱！",
            "给你一记左勾拳！",
            "我叫你一声你敢答应吗？" ,
            "大王叫我来巡山咯！"
    };
    private String[] winWords = {
            "子曾经曰过：“Y挺LJYOYO，一板砖呼死你Y的”！",
            "真想只有一个，你已经死了！",
            "在这一刻"+name+"被灵魂附体，他不是一个人！！！",
            "抽，是一种生活艺术；找抽，是一种生活态度！",
            "“刚和我朋友下棋，他就把我帅吃了”“你想表达什么？”“我帅死了”"
    };
    private  String[] loseWords = {
            "等有一天我修成正果，把你们这些妖孽全收了",
            "人生最大的悲哀是青春不在，青春痘却还在",
            "别逼我，再逼我我就装死给你看",
            "再牛逼百度咋搜索不到你呢？再牛逼你能憋住尿吗？",
            "我和超人唯一的区别就是：我把内裤穿在了里面"
    };
    public void sendMessage(int msfType){
        int index = ((int)(Math.random()*1000))%5;
        String message = null;
        switch (msfType){
            case MessageTypeFist:
                message = fistWords[index];
                break;
            case MessageTypeWin:
                message = winWords[index];
                break;
            case MessageTypeLose:
                message = loseWords[index];
                break;
        }
        System.out.println(message);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
    public int getFist(){
        fist = ((int)Math.random()*30000)%3+1;
        return fist;
    }
}
