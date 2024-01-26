package Recursion;

public class removeDupInStr {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char curChar = str.charAt(idx);
        if(map[curChar - 'a']){
            removeDuplicates(str, idx+1, newStr);
        } else {
            newStr += curChar;
            map[curChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr);
        }
    }

    public static void main(String args[]){
        String str = "aabcdd";
        removeDuplicates(str, 0, "");
    }
    
}
