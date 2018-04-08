/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.ArrayList;

/**
 *
 * @author Mateusz
 */
public class Liczba {
    private ArrayList<Double> lista=new ArrayList<Double>();
    String napis;
    public Liczba(String napis) {
        this.napis=napis;
    }
    
    public void Wypisz()
    {
        for(Double tmp : lista)
        {
            System.out.println(napis+""+tmp);
        }
    }
    
    public void Mnozenie(int liczba)
    {
         for(Double tmp : lista)
        {
            tmp*=liczba;
        }
    }
    private static int silnia(int i)
    {
    if (i < 1) 
     return 1;
    else
    return i * silnia(i - 1);
    }
    
}
