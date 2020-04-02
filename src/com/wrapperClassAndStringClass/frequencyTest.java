//18计本1_18210559009_武文浩_JAVA0705
package com.wrapperClassAndStringClass;

import javax.swing.*;

public class frequencyTest {
    public static void main(String[] args) {
        frequency frequency = new frequency();
        String originalString = JOptionPane.showInputDialog("请输入一个有大小写字母的字符串");
        String findStr = JOptionPane.showInputDialog("请输入你要查找的字符");
        char findString = findStr.charAt(0);
        frequency.setOriginalString(originalString);
        frequency.setFindString(findString);
        int times = frequency.countTimes();
        System.out.println("你要查找的字符"+findString+"出现的次数为:"+times);
    }

}
