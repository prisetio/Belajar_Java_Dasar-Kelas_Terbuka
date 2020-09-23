package com.tutorial;

public class Main {

    public static void main(String[] args) {
	    // program untuk konversi data

        int nilaiInt = 255; //32-bit
        System.out.println("Nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yanglebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai byte " + nilaiByte);
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min byte =  " + Byte.MIN_VALUE);

        // casting pembagian
        int a = 10;
        float b = 4;

        float c = a/b;

        System.out.printf("%d / %f = %f\n",a,b,c);

        int x = 10;
        int y = 4;

        float z = (float)x / y;
        System.out.printf("%d / %d = %f \n",x,y,z);
    }
}
