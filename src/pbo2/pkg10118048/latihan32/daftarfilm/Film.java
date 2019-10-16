/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan32.daftarfilm;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : class daftar film
 */
public class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(){
        System.out.println("Judul Film\t: " + filmName + 
                "\nGenre Film\t: " + filmGenre +
                "\nRating Film\t: " + filmRating +
                "\nDuration Film\t: " + filmDuration + " menit\n");
    }
}
