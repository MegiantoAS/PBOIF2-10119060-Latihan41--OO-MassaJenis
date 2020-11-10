/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan41.massajenis;
import kubus.kubus;
/**
 *
 @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Menghitung Massa Jenis
 */
public class PBOIF210119060Latihan41MassaJenis {

   
    public static void main(String[] args) {
        // TODO code application logic here
        kubus objKubus=new kubus();
        System.out.println("======Massa Jenis Kubus======");
        objKubus.setSisi(5);
        System.out.println("Sisi : "+objKubus.getSisi());
        objKubus.setMassa(250);
        System.out.println("Massa : "+objKubus.getMassa());
        System.out.println("");
          System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : "+objKubus.hitungVolume(0));
        System.out.println("Massa Jenis : "+objKubus.hitungMassaJenis(0, 0));
        
    }
    
}
