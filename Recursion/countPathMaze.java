package Recursion;

public class countPathMaze {

    public static int countPath(int i, int j, int m, int n){
        if( i == m || j == n){
            return 0;
        }

        if( i == m-1 && j == n-1){
            return 1;
        }
        
        int downPath = countPath(i+1, j, m, n);
        int rightPath = countPath(i, j+1, m, n);
        return downPath + rightPath;
    }

    public static void main(String args[]){
        int m = 3;
        int n = 3;
        int totalPath = countPath(0,0,m,n);
        System.out.println(totalPath);
    }
    
}
