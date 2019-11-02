/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umurbarangantik;

/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
    BarangAntik b = new BarangAntik();
    Radio r = new Radio();
    r.setNama("Radio AM");
    System.out.println("Nama Barang Antik : "+r.getNama());
    b.tampilUmur();
    }
}
