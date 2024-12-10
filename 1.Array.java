// Array creation and accessing 
import java.util.Scanner;
import java.io.*;

class ArrayEx {
    public static void main(String[] args) {
        int[] squareNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            squareNumbers[i] = (i + 1) * (i + 1);
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(squareNumbers[i]);
        }
    }
}
