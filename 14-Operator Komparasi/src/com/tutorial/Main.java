package com.tutorial;

public class Main {

    public static void main(String[] args) {
	// Operator komparasi (ini akan menghasilkan nilai dalam bentuk boolean)
    int a,b;
    boolean hasilKomparasi;
    // operator equal atau persamaan
    System.out.println("=====PERSAMAAN=====");
    a = 10;
    b = 10;
    hasilKomparasi = (a==b);
    System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

    // operator not equal
    System.out.println("=====PERTIDAKSAMAAN=====");
    a = 10;
    b = 12;
    hasilKomparasi = (a!=b);
    System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);

    // operator Less than
    System.out.println("=====LEBIH KURANG DARI=====");
    a = 10;
    b = 12;
    hasilKomparasi = (a<b);
    System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);

    // operator greater than
    System.out.println("=====LEBIH BESAR DARI=====");
    a = 10;
    b = 12;
    hasilKomparasi = (a>b);
    System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);

    }
}
