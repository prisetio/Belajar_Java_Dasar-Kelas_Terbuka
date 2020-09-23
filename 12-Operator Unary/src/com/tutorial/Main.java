package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// unary = operasi yang dilakukan pada satu variable

    // unary plus (+) dan minus (-)
    int angka = 1;
    System.out.printf("unary '+', %d menjadi %d\n", angka, +angka);
    System.out.printf("unary '-', %d menjadi %d\n", angka, -angka);

    // unary decrement dan increment
    int angka2 = 10;
    angka2++;
    System.out.println("Nilai dengan '++' menjadi = " + angka2);

    int angka3 = 7;
    angka3--;
    System.out.println("Nilai dengan '--' menjadi = " + angka3);

    int a = 5;
    System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);
    int b = 5;
    System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++);
    System.out.printf("nilai hasil dari postfix menjadi = %d \n", b);

    // unary boolean dengan ! untuk negasi
    boolean bening = true;
        System.out.println("nilai boolean = " + bening);
        System.out.println("nilai boolean = " + !bening);
    }
}
