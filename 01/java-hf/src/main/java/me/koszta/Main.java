package me.koszta;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int benzinAr = 370;
    public static final int szoloAr = 650;
    public static final int almaAr = 240;
    public static final int szilvaAr = 310;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean on = true;
        while (on)
            if (on) {
                System.out.println("Melyik feladatot szeretned? [1-12]\nKilepeshez \"q\"");
                String feladat = sc.nextLine();
                switch (feladat) {
                    case "1":
                        feladat1();
                        break;
                    case "2":
                        feladat2();
                        break;
                    case "3":
                        feladat3();
                        break;
                    case "4":
                        feladat4();
                        break;
                    case "5":
                        feladat5();
                        break;
                    case "6":
                        feladat6(3);
                        break;
                    case "7":
                        feladat7();
                        break;
                    case "8":
                        feladat8();
                        break;
                    case "9":
                        feladat9();
                        break;
                    case "10":
                        feladat10();
                        break;
                    case "11":
                        feladat11();
                        break;
                    case "12":
                        feladat12();
                        break;
                    case "q":
                        on = false;
                        break;
                }
            }
        sc.close();
    }

    public static void feladat1() {
        System.out.println("Iranyitoszam: ");
        String postalCode = sc.nextLine();
        System.out.println("Varos: ");
        String city = sc.nextLine();
        System.out.println("Utca: ");
        String street = sc.nextLine();
        System.out.println("Hazszam: ");
        String streetNumber = sc.nextLine();
        System.out.println(postalCode + " " + city + ", " + street + " " + streetNumber);
    }

    public static void feladat2() {
        double a, b, c;
        System.out.println("A oldal: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("B oldal: ");
        b = Double.parseDouble(sc.nextLine());
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Atfogo: " + c);
    }

    public static void feladat3() {
        System.out.println("Fogyasztas: ");
        double fogyasztas = Double.parseDouble(sc.nextLine()) * benzinAr;
        System.out.println("Tavolsag: ");
        double utHossz = Double.parseDouble(sc.nextLine()) / 100;
        double vegsoAr = utHossz * fogyasztas;
        System.out.println("Osszesen " + vegsoAr + "Ft az ut");

    }

    public static void feladat4() {
        double a, b, k, t;
        System.out.println("A oldal: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("B oldal: ");
        b = Double.parseDouble(sc.nextLine());
        k = 2 * (a + b);
        t = a * b;
        System.out.println("Kerulet: " + k + "\nTerulet: " + t);
    }

    public static void feladat5() {
        double r, k, t;
        r = Double.parseDouble(sc.nextLine());
        t = Math.pow(r, 2) * Math.PI;
        k = 2 * r * Math.PI;
        System.out.println("Kerulet: " + k + "\nTerulet: " + t);
    }

    public static void feladat6(int osszes) {
        double sum = 0;
        int counter = 0;
        while (counter != osszes) {
            counter++;
            System.out.println(counter + ". szam: ");
            sum += Double.parseDouble(sc.nextLine());
        }
        System.out.println("atlag: " + sum / counter);
    }

    public static void feladat7() {
        double arfolyam, mennyiseg;
        System.out.println("Mai euro arfolyam: ");
        arfolyam = Double.parseDouble(sc.nextLine());
        System.out.println("Mennyi eurot akarsz atvaltani? ");
        mennyiseg = Double.parseDouble(sc.nextLine());
        System.out.println("Atvaltott euro: " + (arfolyam * mennyiseg));
    }

    public static void feladat8() {
        Random random = new Random();
        int randomDobas = random.nextInt(6) + 1;
        System.out.println("Kocka: " + randomDobas);
    }

    public static void feladat9() {
        double alma, szolo, szilva;
        System.out.println("|Gyumolcs arak|\nalma : (240ft/kg)\nszolo : (650ft/kg)\nszilva : (310ft/kg)\n\nkerlek a sulyat grammban add meg");
        System.out.println("Alma: ");
        alma = (Integer.parseInt(sc.nextLine()) / 1000.0) * almaAr;
        System.out.println("Szolo: ");
        szolo = (Integer.parseInt(sc.nextLine()) / 1000.0) * szoloAr;
        System.out.println("Szilva: ");
        szilva = (Integer.parseInt(sc.nextLine()) / 1000.0) * szilvaAr;
        System.out.println("Alma: " + alma + "Ft\n" +
                "Szolo: " + szolo + "Ft\n" +
                "Szilva: " + szilva + "Ft\n" +
                "-------------\nOsszesen: " + (alma + szolo + szilva) + "Ft");
    }

    public static void feladat10() {
        double terfogat, felszin, a;
        System.out.println("Kocka oldala: ");
        a = Double.parseDouble(sc.nextLine());
        terfogat = Math.pow(a, 3);
        felszin = a * a * 6;
        System.out.println("Terfogat: " + terfogat + "\nFelszin: " + felszin);
    }

    public static void feladat11() {
        int randomSzam = (int) Math.floor(Math.random() * (100 - -50) - 50);
        System.out.println(randomSzam);
    }
    public static void feladat12 () {
        double r, m, felszin, terfogat;
        System.out.println("Sugar: ");
        r = Double.parseDouble(sc.nextLine());
        System.out.println("Magassag: ");
        m = Double.parseDouble(sc.nextLine());
        double a = Math.sqrt(Math.pow((r / 2), 2) + Math.pow(m, 2));
        felszin = ((r * r) * Math.PI) + (r * Math.PI * a);
        terfogat = (((r * r) * Math.PI *m)/3);
        System.out.println("Felszin: " + felszin + "\nTerfogat: " + terfogat);


    }
}