package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// Operator Logika --> operasi yang bisa kita lakukan kepada tipe Boolean
    // AND, OR, XOR, Negasi

    boolean a, b, c;

    // OR / atau (|)
    System.out.println("==== OR (||) ====");
    a = false;
    b = false;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);
    a = true;
    b = false;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);
    a = false;
    b = true;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);
    a = true;
    b = true;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);

    // AND / dan (&&)
    System.out.println("==== AND (&&) ====");
    a = false;
    b = false;
    c = (a&&b);
    System.out.println(a + " && " + b + " = " + c);
    a = true;
    b = false;
    c = (a&&b);
    System.out.println(a + " && " + b + " = " + c);
    a = false;
    b = true;
    c = (a&&b);
    System.out.println(a + " && " + b + " = " + c);
    a = true;
    b = true;
    c = (a&&b);
    System.out.println(a + " && " + b + " = " + c);

    // XOR / Exclusive Or (^)
    System.out.println("==== XOR (^) ====");
    a = false;
    b = false;
    c = (a^b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = true;
    b = false;
    c = (a^b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = false;
    b = true;
    c = (a^b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = true;
    b = true;
    c = (a^b);
    System.out.println(a + " ^ " + b + " = " + c);

    // Not / Negasi (!)
    System.out.println("==== OR (||) ====");
    a = false;
    c = (!a);
    System.out.println(a + " --->  = " + c);
    a = true;
    c = (!a);
    System.out.println(a + " --->  = " + c);
    }
}
