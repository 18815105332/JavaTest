//18计本1_18210559009_武文浩_JAVA0703
package com.wrapperClassAndStringClass;

public class letterClass {
    private String letters;
    private String isUpperLetter = new String();
    private String isLowerLetter = new String();
    public void isUpper(){
        for (int i = 0;i<letters.length();i++){
            if (Character.isUpperCase(letters.charAt(i))){
                isUpperLetter = isUpperLetter.concat(String.valueOf(letters.charAt(i)));
            }
        }
    }
    public void isLower(){
        for (int i = 0;i<letters.length();i++){
            if (Character.isLowerCase(letters.charAt(i))){
                isLowerLetter+=letters.charAt(i);
            }
        }
    }
    public void showLetters(){
        System.out.println("大写字母:"+isUpperLetter);
        System.out.println("小写字母:"+isLowerLetter);
    }
    public String getLetters() {
        return letters;
    }
    public String setLetters(String letters){
        this.letters = letters;
        return letters;
    }
}
