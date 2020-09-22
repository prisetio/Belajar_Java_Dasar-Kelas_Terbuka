package com.tutorial;

public class Main {
    public static void main(String[] args){
        // tipe data di java
        // integer, byte, short, long, double, float, char, boolean

        //INTERGER (satuan)
        int i = 2147483647;
        System.out.println("=====INTEGER=====");
        System.out.println("nilai integer = " + i);
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("besar integer = " + Integer.BYTES + " bytes");
        System.out.println("besar integer = " + Integer.SIZE + " bit");

        //BYTE (satuan)
        int b = 10;
        System.out.println("=====BYTE=====");
        System.out.println("nilai byte = " + b);
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("besar byte = " + Byte.BYTES + " bytes");
        System.out.println("besar byte = " + Byte.SIZE + " bit");

        //SHORT (satuan)
        short s = 10;
        System.out.println("=====SHORT=====");
        System.out.println("nilai short = " + s);
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("besar short = " + Short.BYTES + " bytes");
        System.out.println("besar short = " + Short.SIZE + " bit");

        //LONG (satuan)
        long l = 10L;
        System.out.println("=====BYTE=====");
        System.out.println("nilai long = " + l);
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("besar long = " + Long.BYTES + " bytes");
        System.out.println("besar long = " + Long.SIZE + " bit");

        //FLOAT (koma, bilangan real)
        float f = -7.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("nilai float = " + f);
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("besar float = " + Float.BYTES + " bytes");
        System.out.println("besar float = " + Float.SIZE + " bit");

        //Char (karakter, berdasarkan ASCII)
        char c = 'c';
        System.out.println("=====CHAR=====");
        System.out.println("nilai char = " + c);
        System.out.println("nilai max = " + Character.MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("besar char = " + Character.BYTES + " bytes");
        System.out.println("besar char = " + Character.SIZE + " bit");
    }
}
