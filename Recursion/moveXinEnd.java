package Recursion;

public class moveXinEnd {
// Move certain character at end of the string 
    public static void recursionHelper(String str, int idx, int cnt, String tmp){
        if(idx == str.length()){
            for(int i=0;i<cnt;i++){
                tmp += "x";
            }
            System.out.println(tmp);
            return;
        }
        char curchar = str.charAt(idx);
        if(curchar == 'x'){
            cnt++;
            recursionHelper(str, idx+1, cnt, tmp);
        } else {
            tmp += curchar;
            recursionHelper(str, idx+1, cnt, tmp);
        }
    }

    public static void main(String args[]){
        String s = "axbcxxd";
        recursionHelper(s, 0, 0, "");
    }

}
