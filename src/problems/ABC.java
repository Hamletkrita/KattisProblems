/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.Scanner;

/**
 *
 * @author hannapersson
 */
public class ABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");

        String firstline = scanner.nextLine();
        
        System.out.println("Enter letters for order");

        String secondline = scanner.nextLine();

        int a = 0, b = 0, c = 0;
        String[] arr;

        if (firstline.contains(" ")) {
            arr = firstline.split(" ");
        } else {
            arr = firstline.split("(?!^)");
        }

        int[] numberArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numberArray[i] = Integer.parseInt(arr[i]);
        }
        int nr1 = numberArray[0], nr2 = numberArray[1], nr3 = numberArray[2];

        char[] charArray = secondline.toCharArray();
        char c1 = charArray[0], c2 = charArray[1], c3 = charArray[2];
        
        if (compare(nr1, nr2, nr3)) {
            a = nr1;
            b = nr2;
            c = nr3;
        } else if (compare(nr1, nr3, nr2)) {
            a = nr1;
            b = nr3;
            c = nr2;
        } else if (compare(nr2, nr3, nr1)) {
            a = nr2;
            b = nr3;
            c = nr1;
        } else if (compare(nr2, nr1, nr3)) {
            a = nr2;
            b = nr1;
            c = nr3;
        } else if (compare(nr3, nr2, nr1)) {
            a = nr3;
            b = nr2;
            c = nr1;
        } else if (compare(nr3, nr1, nr2)) {
            a = nr3;
            b = nr1;
            c = nr2;
        }
        int array[] = {a, b, c};
         //Funkar med Achii tabellen ex c = 67 och för att få ut index 2 så tar vi A =65
        //67 - 65 =2
        System.out.println(array[c1 - 'A'] + " " + array[c2 - 'A'] + " " + array[c3 - 'A']);

    }

    static boolean compare(int a, int b, int c) {
        return (((a) < (b)) && ((b) < (c)));
    }

}
