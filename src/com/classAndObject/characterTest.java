//18计本1_18210559009_武文浩_JAVA0602
package com.classAndObject;

public class characterTest {
    public static void main(String[] args) {
        character character1 = new character("旋涡·那鲁托",99,"下忍");
        character character2 = new character("宇智波·撒斯给",199,"下忍");
        character1.printSkill();
        character1.showCharacter();
        System.out.println("----------------------------------------------");
        character2.printSkill();
        character2.showCharacter();
    }
}
