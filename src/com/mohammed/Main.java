package com.mohammed;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("C:\\Users\\Mohammed\\Development\\DATA6"));
        PrintStream printStream = new PrintStream(new FileOutputStream("C:\\Users\\Mohammed\\Development\\OUT6"));
        while (scanner.hasNext()) {
            int dialAt = scanner.nextInt()*9;
            int[] comb = new int[3];
            comb[0] = scanner.nextInt()*9; comb[1] = scanner.nextInt()*9; comb[2] = scanner.nextInt()*9;
            int totalRotation = 0;
            totalRotation+= 720;
            while (dialAt != comb[0]) {
                dialAt++;
                totalRotation++;
                if (dialAt == 360)
                    dialAt = 0;
            }
            System.out.println(totalRotation);
            System.out.println(dialAt);
//            totalRotation+= 360;
            while (dialAt != comb[1]) {
                dialAt--;
                totalRotation++;
//                if (dialAt == 360)
//                    dialAt = 0;
                if (dialAt < 0)
                    dialAt = 360 + dialAt;
            }
            System.out.println(totalRotation);
            System.out.println(dialAt);
            while (dialAt != comb[2]) {
                dialAt++;
                totalRotation++;
                if (dialAt == 360)
                    dialAt = 0;
            }
            printStream.println(totalRotation);
        }
    }
}
