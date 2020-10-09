package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// kesimpulannya adalah perkalian dan pembagian dilakukan terlelbih dulu daripada penjumlahan dan pengurangan

    int hasil = 10 / 2 - 2 * 5;
    System.out.println(hasil);

    // menggunakan pengelompokkan operasi dengan ()
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

    Scanner userInput = new Scanner(System.in);
        System.out.println("Menghitung Persamaan Kuadrat");
    int m,x,c;

    System.out.println("nilai x = ");
    x = userInput.nextInt();
    System.out.println("gradient m = ");
    m = userInput.nextInt();
    System.out.println("bias c = ");
    c = userInput.nextInt();
    int y = m*x*x + c;

        System.out.println("nilai y = " + y);
    }
}
