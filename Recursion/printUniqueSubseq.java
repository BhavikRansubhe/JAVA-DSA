package Recursion;

import java.util.HashSet;

public class printUniqueSubseq {

    public static void printSubSequence(String str, int idx, String newStr, HashSet<String>set){
        if (idx == str.length()){
            if(set.contains(newStr)){
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char curChar = str.charAt(idx);
        printSubSequence(str, idx+1, newStr+curChar, set);
        printSubSequence(str, idx+1, newStr, set);

    }
    public static void main(String args[]){
        String s = "abc";
        HashSet<String> set = new HashSet<>();
        printSubSequence(s, 0, "", set);
    }
}
