//18计本1_18210559009_武文浩_JAVA0904
package com.InheritanceAndPolymorphism.printerdemo.impl;

import com.InheritanceAndPolymorphism.printerdemo.iface.IPaper;

public class A4PaperImpl implements IPaper {
    @Override
    public String getSize() {
        return "A4";
    }
}
