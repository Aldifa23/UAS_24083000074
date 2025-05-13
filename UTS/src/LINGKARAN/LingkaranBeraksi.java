/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LINGKARAN;

/**
 *
 * @author Difa
 */
public class LingkaranBeraksi {
        public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        double r = 11.78;
        // Menghitung dan menampilkan luas lingkaran
        // 1. Hasil bilangan pecahan
        lingkaran.hitungLuas(r);
        // 2. Hasil bilangan bulat (type-casting)
        int luasBulat = (int)(Math.PI * r * r);
        System.out.println("Luas lingkaran (bulat): " + luasBulat);
        // 3. Pembulatan (rounding)
        double luasPembulatan = Math.round(Math.PI * r * r);
        System.out.println("Luas lingkaran (pembulatan): " + luasPembulatan);
    }
}
