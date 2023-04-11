/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.HashMap;
import javax.swing.JOptionPane;


/**
 *
 * @author umg
 */
public class ListaModelo {
    HashMap MiLista = new HashMap();
    public void IngresarDatos(int codigo,String pais)
    {
        
       
                if(MiLista.containsKey(codigo))
                {
                    JOptionPane.showMessageDialog(null,"El Pais ya se ingreso");
                }
                else
                {
                    MiLista.put(codigo, pais);
                    JOptionPane.showMessageDialog(null,"Se ha Ingresado " +pais);
                }
            
        
        
    }
    public void ListarDatos(){
        
        MiLista.forEach((codigo,valor)->{
            System.out.println(codigo + " "+ valor);
        });
        
    }
    
     
        
}
