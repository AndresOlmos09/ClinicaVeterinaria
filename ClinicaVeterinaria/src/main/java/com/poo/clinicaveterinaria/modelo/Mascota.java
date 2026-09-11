/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.clinicaveterinaria.modelo;

/**
 *
 * @author Andres
 */
public class Mascota extends Animal{
    private String raza;
    private Propietario propietario;
    
    
    //Constructor
    public Mascota(String raza, Propietario propietario, String nombre, String especie, int edad, int peso) {
        super(nombre, especie, edad, peso);
        this.raza = raza;
        this.propietario = propietario;
    }
    
    //GET Y SETS
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    
    
    @Override
    public String obtenerDescripcion() {
        return getNombre() + " (" + getEspecie() + ", " + raza + "), "
                + getEdad() + " años, " + getPeso() + " kg";
    }
}
