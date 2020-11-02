package fr.manulep.entrainement;

import java.util.Scanner;

public class test {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N%2 != 0){
            System.out.println("Weird");
        }else if(N%2 == 0 && N>20){
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}