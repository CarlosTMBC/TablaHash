/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;

/**
 *
 * @author umg
 */
public class ListaModelo {
    
    public void IngresarDatos(int codigo,String pais)
    {
        HashMap MiLista = new HashMap();
        //Lista nuevaLista= new Lista(codigo, pais);
        MiLista.put(codigo, pais);
        MiLista.forEach((clave,valor)->{
            if(MiLista==null)
            {
               System.out.println(clave+" "+valor); 
               
            }
            else 
            {
                if(MiLista != MiLista)
                {
                   System.out.println(clave+" "+valor);  
                }
                else
                {
                    System.out.println("Ya se Ingreso xd");
                }
              
              
            }
            
        });
        
    }
    
     
        
}
