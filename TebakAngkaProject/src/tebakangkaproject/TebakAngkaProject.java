/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangkaproject;

/**
 *
 * @author DEWA
 */
import java.util.Scanner;
public class TebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int random, tebak, jumlah;
        random = (int) (Math.random() * 100);
        System.out.println("Tebaklah Angka Antara 1-100");
        Scanner masukan = new Scanner(System.in);
        jumlah = 0;
 
        do {
            jumlah++;
            System.out.print("Masukkan Tebakan Anda : ");
            tebak = masukan.nextInt();
 
            //Output
            if (tebak > random) {
                System.out.println("Tebakan Terlalu Besar");
            } else if (tebak < random) {
                System.out.println("Tebakan Terlalu Kecil");
            } else {
                System.out.print("Tebakan Benar! Setelah " + jumlah + " Kali Menebak");
            }
        } while (tebak != random);
    }
    
}
