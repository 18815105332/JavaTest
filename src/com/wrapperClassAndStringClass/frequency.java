//18计本1_18210559009_武文浩_JAVA0705
package com.wrapperClassAndStringClass;

public class frequency {
    private String originalString;
    private char findString;
    private int times = 0;
    private int index = 0;
    public int countTimes(){
        while (originalString.indexOf(findString,index)!=-1){
            index = originalString.indexOf(findString,index)+1;
            times++;
        }
        return times;
    }

    public String getOriginalString(){
        return originalString;
    }
    public String setOriginalString(String OriginalString){
        this.originalString = OriginalString;
        return originalString;
    }
    public char getFindString(){
        return findString;
    }
    public char setFindString(char findString){
        this.findString = findString;
        return findString;
    }
}
