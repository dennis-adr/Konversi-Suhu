/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author katoa
 */
public class Konversi {
    double reamur(){return ((4*Main.Celcius)/5);}
    double fahrenheit(){return ((9*Main.Celcius)/5+32);}
    double kelvin(){return (Main.Celcius+273.15);}
    void kondisi(){
        if (Main.Celcius<1) {
            System.out.println("Kondisi Air Beku.");
        }else if (Main.Celcius>0 && Main.Celcius<100) {
            System.out.println("Kondisi Air Normal.");
        }else if (Main.Celcius>100) {
            System.out.println("Kondisi Air Mendidih.");
        }
    }
}
