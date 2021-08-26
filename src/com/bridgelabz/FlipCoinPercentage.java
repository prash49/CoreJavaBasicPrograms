package com.bridgelabz;

import java.util.Random;

public class FlipCoinPercentage {
    //Constants
    static final int HEADFLIP = 1;
    //for flipping the coins 100 times
    static final int COUNT = 100;

    public static void main(String[] args) {
        //Variables
        int coin;
        double heads = 0;
        double tails = 0;
        for (int i = 1; i <= COUNT; i++) {
            //for getting Randoms number draw between 0 or 1
            Random random = new Random();
            coin = random.nextInt(2);
            if (coin == HEADFLIP) {
                System.out.println("its Heads");
                heads += 1;
            } else {
                System.out.println("its Tails");
                tails += 1;
            }
        }
        System.out.println("percentage of Heads:" + ((heads / COUNT) * 100));
        System.out.println("percentage of Heads:" + ((tails / COUNT) * 100));
    }
}
