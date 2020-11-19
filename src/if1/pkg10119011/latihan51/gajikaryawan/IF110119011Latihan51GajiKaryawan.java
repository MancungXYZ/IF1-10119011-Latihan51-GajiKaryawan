/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama        : Reihan Wiyanda
 *  Kelas       : IF-1
 *  Nim         : 10119011
 */
public class IF110119011Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manager mag = new Manager();
        Scanner sc = new Scanner(System.in);
        System.out.println("===Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukan Nik : ");
        mag.setNik(sc.nextLine());
        System.out.print("Masukan Nama : ");
        mag.setNama(sc.nextLine());
        System.out.print("Masukan Golongan : ");
        mag.setGolongan(sc.nextInt());
        System.out.print("Masukan Jabatan (Manager/Kabag): ");
        mag.setJabatan(sc.next());
        System.out.print("Masukan Kehadiran : ");
        mag.setKehadiran(sc.nextInt());
        
        System.out.println();
        
        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK\t\t : " + mag.getNik());
        System.out.println("Nama\t\t : " + mag.getNama());
        System.out.println("Golongan\t : " + mag.getGolongan());
        System.out.println("Kehadiran\t : " + mag.getKehadiran());
        System.out.println();
        
        System.out.println("Tunjangan GOLONGAN\t: " + mag.tunjanganGolongan(mag.getGolongan()));
        System.out.println("Tunjangan JABATAN\t: " + mag.tunjanganJabatan(mag.getJabatan()));
        System.out.println("Tunjangan KEHADIRAN\t: " + mag.tunjanganKehadiran(mag.getKehadiran()));
        System.out.println();
        
        System.out.println("Gaji Total\t : " + mag.gajiTotal());
    }
    
}
