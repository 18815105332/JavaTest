//18计本1_18210559009_武文浩_JAVA0604
package com.classAndObject;

public class HumanPlayer {
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
            "动感光波~biubiubiu~",
            "大象大象你的鼻子为什么这么长~~",
            "必杀：露PP外星人~~",
            "大姐姐你喜欢吃青椒吗？",
            "胸部扁扁的欧巴桑，吃我一拳~"
    };
    private String[] winWords = {
            "还有谁~~",
            "猜拳，有点意思~~",
            "~~~超~~~神~~~~",
            "全军出击~~！！！",
            "吃着火锅唱着歌，然后你就输了~"
    };
    private  String[] loseWords = {
            "通往成功的路总在施工中。。。",
            "等到潮水褪去，就知道谁在裸泳了。。。",
            "夏天就是不好，穷的时候我连西北风都没得喝。。。",
            "将来我死了，把QQ捐给希望工程，让孩子们一上来就能用带太阳的QQ。。。",
            "众人皆醉我独醒，举世皆浊我独清。。。"
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
        return fist;
    }
    public void setFist(int fist){
        this.fist = fist;
    }
}
