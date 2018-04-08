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
public class Stack {
   int[] tablica;
   int wskaznik=0;
   int dlugosc;
    

    public Stack(int dlugosc) {
        tablica=new int [dlugosc];
        this.dlugosc=dlugosc;
    }
    
    public void Push(int  element)
    {
        if(wskaznik<dlugosc)
        {
            tablica[0]=element;
            wskaznik++;
        }
    }
    
     public int  Pop()
    {
        if(wskaznik>0)
        {
            wskaznik--;
            return tablica[wskaznik];
        }
        return 0;
    }
    
}
