/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author chelvivil
 */
public class RegistroAuto {
    private String numeroRegistro;
    private String nombreDueño;
    private String cedula;
    private String placaAuto;

    public RegistroAuto() {
    }

    public RegistroAuto(String numeroRegistro, String nombreDueño, String cedula, String placaAuto) {
        this.numeroRegistro = numeroRegistro;
        this.nombreDueño = nombreDueño;
        this.cedula = cedula;
        this.placaAuto = placaAuto;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlacaAuto() {
        return placaAuto;
    }

    public void setPlacaAuto(String placaAuto) {
        this.placaAuto = placaAuto;
    }
    
}
