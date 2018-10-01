/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding huruf
 *                        kecil dan besar.
 */
public class PBO210117070Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        
        System.out.println("=====Hasil Formatting=====");
        Scanner masuk = new Scanner (System.in);
        kalimat = masuk.nextLine();
        System.out.println("Huruf besar : "+ kalimat.toUpperCase());
        System.out.println("Huruf kecil : "+ kalimat.toLowerCase());
    }
    
}
