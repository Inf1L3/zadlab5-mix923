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
public class Firma {
    private ArrayList<Pracownik> lista=new ArrayList<Pracownik>();

    public Firma() {
    }
    
    public void Dodaj(Pracownik tmp )
    {
        lista.add(tmp);
    }
    
    public void WypiszAll()
    {
          for(Pracownik tmp : lista)
          {
              tmp.pokazDane();
          }
    }
}
