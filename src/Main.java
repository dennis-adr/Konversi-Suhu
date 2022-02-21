
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author katoa
 */
public class Main {
    static double Celcius;
    public static void main(String[] args) {
        int pilihan;
        Konversi hitung = new Konversi();
        Scanner inputSuhu = new Scanner(System.in);
        Scanner pilihMenu = new Scanner(System.in);
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("-- Input Data --");
        System.out.println("----------------");
        System.out.print("Suhu dalam Celcius : ");
        Celcius = inputSuhu.nextDouble();
        do {
            System.out.println("");
            System.out.println("-- Opsi --");
            System.out.println("----------");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilihan = pilihMenu.nextInt();
            switch (pilihan){
                case 1:
                    System.out.println("");
                    System.out.println("Hasil Konversi:");
                    System.out.println("Suhu dalam Celcius     : " + Celcius + "°C");
                    System.out.println("Suhu dalam Fahrenheit  : " + hitung.fahrenheit() + "°F");
                    System.out.println("Suhu dalam Reamur      : " + hitung.reamur() + "°R");
                    System.out.println("Suhu dalam Kelvin      : " + hitung.kelvin() + "°K");
                    hitung.kondisi();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("-- Input Data --");
                    System.out.println("----------------");
                    System.out.print("Suhu Dalam Celcius : ");
                    Celcius = inputSuhu.nextDouble();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        } while (true);
    }
}
