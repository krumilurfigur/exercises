/*
program description
date
Gabriel Öberg
 */

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        printCapitalized(kb.nextLine());

    }

    static void printCapitalized(String s) {
        char c;
        boolean b = true;
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (b) {
                c = Character.toUpperCase(c);
                b = false;
            }
            if (!Character.isLetter(c)) {
                b = true;
            }
            ch[i] = c;
        }
        String output = new String(ch);
        System.out.println(output);


    }
}