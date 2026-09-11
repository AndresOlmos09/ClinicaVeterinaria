/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.clinicaveterinaria.modelo;

/**
 *
 * @author Andres
 */
public class Veterinario {
    private String nombre;
    private String especialidad;
    private String numeroLicencia;
    
    //Constructor 
    public Veterinario(String nombre, String especialidad, String numeroLicencia){
        this.nombre=nombre;
        this.especialidad=especialidad;
        this.numeroLicencia=numeroLicencia;
    }
    
    //Getters y Settters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    
    public void recetar(Consulta c, Medicamento m){
        c.agregarMedicamento(m);
    }
}
