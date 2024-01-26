package Recursion;

public class printSubseq {

    public static void printSubSequence(String str, int idx, String newStr){
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char curChar = str.charAt(idx);
        printSubSequence(str, idx+1, newStr+curChar);
        printSubSequence(str, idx+1, newStr);

    }
    public static void main(String args[]){
        String s = "abc";
        printSubSequence(s, 0, "");
    }
}
