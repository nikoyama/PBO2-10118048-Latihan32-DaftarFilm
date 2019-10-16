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
 * Deskripsi program : menampilkan daftar film
 */
public class PBO210118048Latihan32DaftarFilm {

    public static void main(String[] args) {
        Film objFilm = new Film();
        
        objFilm.filmName = "Venom";
        objFilm.filmGenre = "Action, Horror, Scifi";
        objFilm.filmRating = 8.5;
        objFilm.filmDuration = 120;
        objFilm.nowPlaying();
        
        objFilm.filmName = "Small Foot";
        objFilm.filmGenre = "Animation";
        objFilm.filmRating = 9.0;
        objFilm.filmDuration = 96;
        objFilm.nowPlaying();
        
        objFilm.filmName = "Crazy Rich Asian";
        objFilm.filmGenre = "Comedy";
        objFilm.filmRating = 7.8;
        objFilm.filmDuration = 119;
        objFilm.nowPlaying();
        
        objFilm.filmName = "Asih";
        objFilm.filmGenre = "Horror";
        objFilm.filmRating = 6.0;
        objFilm.filmDuration = 100;
        objFilm.nowPlaying();
    }

}
