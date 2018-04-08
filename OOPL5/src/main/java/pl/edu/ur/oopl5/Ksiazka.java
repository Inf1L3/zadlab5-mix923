/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author Mateusz
 */
public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczba_stron;
    private int dor_wydania;
    private float cena;

    public Ksiazka(String tytul, String autor, int liczba_stron, int dor_wydania, float cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczba_stron = liczba_stron;
        this.dor_wydania = dor_wydania;
        this.cena = cena;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getLiczba_stron() {
        return liczba_stron;
    }

    public int getDor_wydania() {
        return dor_wydania;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
    
    
}
