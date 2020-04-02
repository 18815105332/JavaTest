//18计本1_18210559009_武文浩_JAVA0704
package com.wrapperClassAndStringClass;

public class stringStarts {
    public static void main(String[] args) {
        String[] strings = {"safd","FAsgdsa","gdsas","basfdas","baerwqw2"};
        for (int i = 0;i<strings.length;i++){
            if (strings[i].startsWith("b"))System.out.println(strings[i]);
        }
    }
}
