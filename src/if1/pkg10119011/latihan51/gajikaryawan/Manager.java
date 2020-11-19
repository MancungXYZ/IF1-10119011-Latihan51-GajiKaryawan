/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan51.gajikaryawan;

/**
 *
 * @author 
 *  Nama        : Reihan Wiyanda
 *  Kelas       : IF-1
 *  Nim         : 10119011
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int kehadiran) {
        return kehadiran * 10000;
    }
    
    public float tunjanganJabatan(String jabatan) {
        switch (jabatan) {
            case "Manager" : return 2000000;
            case "Kabag" : return 1000000;
            default : return 0;
        }
    }
    
    public float tunjanganGolongan (int golongan) {
        switch (golongan) {
            case 1 : return 500000;
            case 2 : return 100000;
            case 3 : return 150000;
            default : return 0;
        }
    }
    
    public float gajiTotal () {
        tunjanganKehadiran = tunjanganKehadiran(kehadiran);
        tunjanganGolongan = tunjanganGolongan(golongan);
        tunjanganJabatan = tunjanganJabatan(jabatan);
        
        return tunjanganKehadiran + tunjanganGolongan + tunjanganJabatan;
    }
}
