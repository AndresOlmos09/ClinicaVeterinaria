/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.clinicaveterinaria.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class Propietario {
    private String nombre;
    private String cedula;
    private String telefono;
    private List<Mascota> mascotas;
    
    //Constructor
    public Propietario(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.mascotas = new ArrayList<>();
    }
    
    //GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }
    
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }
    
}
