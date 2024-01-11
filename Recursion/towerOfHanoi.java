package Recursion;
public class towerOfHanoi{
    static void recursiveFunc(int n, char from_rod, 
                             char to_rod, char aux_rod) 
    { 
        if (n == 0) return;
        recursiveFunc(n - 1, from_rod, aux_rod, to_rod); 
        System.out.println("Move disk " + n + " from rod "
                           + from_rod + " to rod "
                           + to_rod); 
        recursiveFunc(n - 1, aux_rod, to_rod, from_rod); 
    } 
    public static void main(String args[]){
        int n = 3;
        recursiveFunc(n, 's', 'd', 'h');
    }
}