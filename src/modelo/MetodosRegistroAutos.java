/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author chelvivil
 */

public class MetodosRegistroAutos {
  private ArrayList<RegistroAuto> arrayRegistro;
    String arregloInformacionConsultada[]=new String[3];
    public static String numero="1";
    int num=1;
    public MetodosRegistroAutos() {
        arrayRegistro= new ArrayList<RegistroAuto>();
    }
    public void agregarRegistro(String informacion[]){
        numero=""+num;
        informacion[0]=numero;
        num++;
        numero=""+num;
       
        RegistroAuto temp = new RegistroAuto(informacion[0], informacion[1], informacion[2],informacion[3]);
        arrayRegistro.add(temp);
        JOptionPane.showMessageDialog(null,"El Registro se agregó de forma Correcta");
    }
    public boolean buscarRegistro(String informacion[]){
        boolean existe = false;
        for (int contador = 0; contador < arrayRegistro.size(); contador++) {

            if (arrayRegistro.get(contador).getNumeroRegistro().equals(informacion[0])) {
                arregloInformacionConsultada[0]=arrayRegistro.get(contador).getNombreDueño();
                arregloInformacionConsultada[1]=arrayRegistro.get(contador).getCedula();
                arregloInformacionConsultada[2]=arrayRegistro.get(contador).getPlacaAuto();
                existe=true;
            }
        }
        return existe;
    }
    public String [] getInformaccionConsulta(){
        return this.arregloInformacionConsultada;
    }
    public void modificarRegistro(String informacion[]){
        for(int contador=0;contador<arrayRegistro.size();contador++){
            if(arrayRegistro.get(contador).getNumeroRegistro().equals(informacion[0])){
                arrayRegistro.get(contador).setNombreDueño(informacion[1]);
                arrayRegistro.get(contador).setCedula(informacion[2]);
                arrayRegistro.get(contador).setPlacaAuto(informacion[3]);
                JOptionPane.showMessageDialog(null,"El Registro se Modificó de forma Correcta");
            }
        }
    }
     public void eliminar(String informacion[]){
        
        for(int contador=0;contador<arrayRegistro.size();contador++){
            if(arrayRegistro.get(contador).getNumeroRegistro().equals(informacion[0])){
                arrayRegistro.remove(contador);
                num--;
                numero=""+num;
                JOptionPane.showMessageDialog(null,"El Registro se eliminó de forma Correcta");
            }
        }
        
    }
    
}
