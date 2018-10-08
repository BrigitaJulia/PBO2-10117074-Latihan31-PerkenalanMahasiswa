/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan31.perkenalanmahasiswa;
import java.util.Scanner;
/**
 *
 * @author Brigita Julia Puspita Nai Goncalves
 */
public class PBO210117074Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mhs mhs1 = new Mhs();
        mhs1.nim  = "10117074";
        mhs1.nama = "Brigita Julia Puspita Nai Goncalves" + "\n";
        mhs1.PerkenalanDiri(mhs1.nim, mhs1.nama);
        
        Mhs mhs2 = new Mhs();
        mhs2.nim  = "10117080";
        mhs2.nama = "Daffa Qinthara" + "\n";
        mhs2.PerkenalanDiri(mhs2.nim, mhs2.nama);
        
        Mhs mhs3 = new Mhs();
        mhs3.nim  = "10117077";
        mhs3.nama = "Joseph Armando Carvalo" + "\n";
        mhs3.PerkenalanDiri(mhs3.nim, mhs3.nama);

        Mhs mhs4 = new Mhs();
        mhs4.nim  = "10116282";
        mhs4.nama = "Gcs" + "\n";
        mhs4.PerkenalanDiri(mhs4.nim, mhs4.nama);
    }
    
}
