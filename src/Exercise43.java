/*
program description
date
Gabriel Öberg
 */

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sum;
        System.out.println("Enter a dice sum");
        DiceSum(kb.nextInt());
    }
    static void DiceSum (int sum) {
        double dice1;
        double dice2;
        double dicesum;
        int count = 0;
        boolean b = true;
        if (sum < 2 | sum > 12) {
            b = false;
            throw new IllegalArgumentException();
        }
        while (b) {
            dice1 = Math.random();
            dice1 *= 6;
            dice1 = Math.ceil(dice1);
            dice2 = Math.random();
            dice2 *= 6;
            dice2 = Math.ceil(dice2);
            dicesum = dice1 + dice2;
            count ++;
            if (dicesum == sum) {
                b = false;
                System.out.println("It took " + count + " tries to get " + sum);
            }
        }

    }
}