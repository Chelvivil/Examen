/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.MetodosRegistroAutos;
import vista.FRM_RegistroAutos;

/**
 *
 * @author chelvivil
 */
public class Controlador_FRM_RegistroAutos implements ActionListener{
FRM_RegistroAutos control;
    MetodosRegistroAutos metodos;
    public Controlador_FRM_RegistroAutos(FRM_RegistroAutos control) {
       this.control = control; 
       metodos= new MetodosRegistroAutos();
    }

    public Controlador_FRM_RegistroAutos() {
    }
    
    public void actionPerformed(ActionEvent e){
         if(e.getActionCommand().equals("Buscar"))
        {
        this.buscar();
          
          
        }
          if(e.getActionCommand().equals("Agregar"))
        {
         metodos.agregarRegistro(control.devolverInformacion());
         control.limpiarInterfaz();
         control.estadoInicial();
          control.estadoInicialBotones();
          
        }
           if(e.getActionCommand().equals("Modificar"))
        {
       metodos.modificarRegistro(control.devolverInformacion());
       control.limpiarInterfaz();
       control.estadoInicial();
       control.estadoInicialBotones();
          
          
        }
            if(e.getActionCommand().equals("Eliminar"))
        {
         metodos.eliminar(control.devolverInformacion());
         control.limpiarInterfaz();
         control.estadoInicial();
         control.estadoInicialBotones();
          
        }
    }
    
   public void buscar(){
    if(metodos.buscarRegistro(control.devolverInformacion())){
        control.mostrarInformacion(metodos.getInformaccionConsulta());
        control.habilitarOpcionesBotones();
        control.habilitarAgregar();
        
    }
    else{
        control.habilitarAgregar();
        control.habilitarAgregarBotones();
        JOptionPane.showMessageDialog(null,"El Registro no se Encuentra");
    }
   }
}
