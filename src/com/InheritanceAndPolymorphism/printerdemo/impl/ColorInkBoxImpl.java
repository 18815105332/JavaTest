//18计本1_18210559009_武文浩_JAVA0904
package com.InheritanceAndPolymorphism.printerdemo.impl;

import com.InheritanceAndPolymorphism.printerdemo.iface.IInkBox;

public class ColorInkBoxImpl implements IInkBox {

    @Override
    public String getColor() {
        return "红色";
    }
}
