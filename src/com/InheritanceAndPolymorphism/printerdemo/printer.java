//18计本1_18210559009_武文浩_JAVA0904
package com.InheritanceAndPolymorphism.printerdemo;

import com.InheritanceAndPolymorphism.printerdemo.iface.IInkBox;
import com.InheritanceAndPolymorphism.printerdemo.iface.IPaper;

public class printer {
    private IInkBox inkBox;
    private IPaper paper;

    public void print(String content){
        if (null==inkBox || null==paper){
            System.out.println("墨盒和纸张出现错误，请安装正确后重试！");
            return;
        }
        String color = inkBox.getColor();
        String type = paper.getSize();
        System.out.println("以下文字是"+color+"颜色的！");
        System.out.println("使用纸张："+type);
        System.out.println("打印内容："+content);
    }
    public IPaper getPaper() {
        return paper;
    }

    public void setPaper(IPaper paper) {
        this.paper = paper;
    }

    public IInkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(IInkBox inkBox) {
        this.inkBox = inkBox;
    }
}
