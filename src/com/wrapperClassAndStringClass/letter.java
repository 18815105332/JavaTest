//18计本1_18210559009_武文浩_JAVA0703
package com.wrapperClassAndStringClass;

import javax.swing.*;

public class letter {
    public static void main(String[] args) {
        letterClass lettersClass = new letterClass();
        String letters = JOptionPane.showInputDialog("请输入一个有大小写字母的字符串");
        lettersClass.setLetters(letters);
        lettersClass.isLower();
        lettersClass.isUpper();
        lettersClass.showLetters();
    }
}
