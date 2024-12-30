package edu.stpeters;
public class PrintHelloRec2 {
    public static void main(String[] args) {
      long  n = 123456789; 
        printHello(n);  
    }
    private static void printHello(long  n) {
        if (n > 0) {
            System.out.println(n);
            n=n/10;
            printHello(n);  
    }
}
}