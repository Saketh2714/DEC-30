package edu.stpeters;
public class PrintHelloRec1 {
    public static void main(String[] args) {
        int n = 9; 
        printNumbers(n);  
    }
    private static void printNumbers(int n) {
        if (n > 0) {
           
            for (int i = 1; i <= n; i++) {
                System.out.print(i);  
            }
            System.out.println();  
            printNumbers(n - 1);  
    }
}
}