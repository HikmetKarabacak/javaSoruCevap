package com.hikmetkarabacak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Soru 1: Klavyeden girilen 3 sayının ortlamasını alan bir uygulama yazınız
/*
	    int x, y, z;
	    double ortalama;

        Scanner tara = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz :");
        x = tara.nextInt();

        System.out.println("İkinci sayiyi giriniz :");
        y = tara.nextInt();

        System.out.println("Üçüncü sayiyi giriniz :");
        z = tara.nextInt();

        ortalama = (x + y + z) / 3d;
        System.out.println("Ortalama :" + ortalama);
*/
        //******************************************

        //Soru 2: Klavyeden kenarları girilen bir üçgenin çeşidini veren uygulamayı yazınız

        int x, y, z;

        Scanner tara = new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz :");
        x = tara.nextInt();

        System.out.println("İkinci kenarı giriniz :");
        y = tara.nextInt();

        System.out.println("Üçüncü kenarı giriniz :");
        z = tara.nextInt();

        if (x == y && y == z) {
            System.out.println("Üçgenimiz eşkanardır");
        } else if (x != y && y != z && x != z) {
            System.out.println("Üçgenimiz çeşitkenardır");
        } else {
            System.out.println("üçgenimiz ikizkenardır");
        }

    }
}
