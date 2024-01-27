package Recursion;

public class printPermutation {
    public static void printPermu(String str, String permutation){
        if(str.length() == 0){
            System.out.println("->" + permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermu(newStr, permutation+curChar);
        }
    }
    public static void main(String args[]){
        String s = "abc";
        printPermu(s, "");
    }
}

/*
 * Initial Call (main method):

str = "abc"
permutation = ""
Calls printPermu("abc", "")
Inside printPermu("abc", ""):

Loop runs for each character in "abc":
Iteration 1 (i=0):
curChar = 'a'
newStr = "bc"
Calls printPermu("bc", "a")
Iteration 2 (i=1):
curChar = 'b'
newStr = "ac"
Calls printPermu("ac", "b")
Iteration 3 (i=2):
curChar = 'c'
newStr = "ab"
Calls printPermu("ab", "c")
Inside printPermu("bc", "a"):

Loop runs for each character in "bc":
Iteration 1 (i=0):
curChar = 'b'
newStr = "c"
Calls printPermu("c", "ab")
Iteration 2 (i=1):
curChar = 'c'
newStr = "b"
Calls printPermu("b", "ac")
Inside printPermu("c", "ab"):

Base case reached (str.length() == 0):
Prints "->abc"
Inside printPermu("b", "ac"):

Base case reached (str.length() == 0):
Prints "->acb"
Inside printPermu("ac", "b"):

Loop runs for each character in "ac":
Iteration 1 (i=0):
curChar = 'a'
newStr = "c"
Calls printPermu("c", "ba")
Iteration 2 (i=1):
curChar = 'c'
newStr = "a"
Calls printPermu("a", "bc")
Inside printPermu("c", "ba"):

Base case reached (str.length() == 0):
Prints "->bac"
Inside printPermu("a", "bc"):

Base case reached (str.length() == 0):
Prints "->bca"
Inside printPermu("ab", "c"):

Loop runs for each character in "ab":
Iteration 1 (i=0):
curChar = 'a'
newStr = "b"
Calls printPermu("b", "ca")
Iteration 2 (i=1):
curChar = 'b'
newStr = "a"
Calls printPermu("a", "cb")
Inside printPermu("b", "ca"):

Base case reached (str.length() == 0):
Prints "->cab"
Inside printPermu("a", "cb"):

Base case reached (str.length() == 0):
Prints "->cba"

 * 
 * 
 */