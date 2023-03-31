/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pckMain;

import Controlador.HashController;
import Modelo.ListaModelo;
import Vistas.frmPrincipal;

/**
 *
 * @author umg
 */
public class Main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        ListaModelo ModeloLista = new ListaModelo();
        HashController Controlador = new HashController(VistaPrincipal,ModeloLista);
    }
    
}
