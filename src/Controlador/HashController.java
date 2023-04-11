/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ListaModelo;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HashController implements ActionListener{
    frmPrincipal VistaPrincipal;
    ListaModelo ModeloLista;

    public HashController(frmPrincipal VistaPrincipal, ListaModelo ModeloLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloLista = ModeloLista;
        
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==VistaPrincipal.btnIngresar)
        {
            this.ModeloLista.IngresarDatos(Integer.parseInt(this.VistaPrincipal.txtCodigo.getText()),
                    this.VistaPrincipal.txtPais.getText());
            this.VistaPrincipal.txtCodigo.setText("");
            this.VistaPrincipal.txtPais.setText("");
            this.ModeloLista.ListarDatos();
            
        }
    }
    
    
}
