//18计本1_18210559009_武文浩_JAVA0904
package com.InheritanceAndPolymorphism.printerdemo;

import com.InheritanceAndPolymorphism.printerdemo.impl.A4PaperImpl;
import com.InheritanceAndPolymorphism.printerdemo.impl.B5PaperImpl;
import com.InheritanceAndPolymorphism.printerdemo.impl.ColorInkBoxImpl;

public class printerTest {
    public static void main(String[] args) {
        printer printer = new printer();
        printer.setInkBox(new ColorInkBoxImpl());
        printer.setPaper(new B5PaperImpl());
        printer.print("测试内容");
    }
}
