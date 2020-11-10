package com.tutorial;

import java.util.*;

public class Main {

    // Switch Case

    public static void main(String[] args) {

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Panggil nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int, long, byte, short), String atau enum
        switch(input) {
            case "bening":
                System.out.println("priyo sayang bening");
            break;
            case "priyo":
                System.out.println("bening sayang priyo");
                break;
            default:
                System.out.println(input + " sayang banget");
        }

        System.out.println("end program");
    }
}
