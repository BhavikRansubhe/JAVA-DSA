package Recursion;
public class towerOfHanoi{
    static void recursiveFunc(int n, String src, 
                             String dest, String helper) 
    { 
        if (n == 0) return;
        recursiveFunc(n - 1, src, dest, helper); 
        System.out.println("Move disk " + n + " from rod "
                           + src + " to rod "
                           + dest); 
        recursiveFunc(n - 1, helper, dest, src); 
    } 
    public static void main(String args[]){
        int n = 3;
        recursiveFunc(n,"src", "dest", "helper");
    }
}