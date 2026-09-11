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
public class Consulta {
    private String fecha;
    private String motivo;
    private String diagnostico;
    private Mascota m;
    private Veterinario v;
    private List<Medicamento> medicamentos;

    //Constructor
    public Consulta(String fecha, String motivo, String diagnostico, Mascota m, Veterinario v) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.m = m;
        this.v = v;
        this.medicamentos = new ArrayList<>();
    }
    
    //Getters y Setters

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Mascota getM() {
        return m;
    }

    public void setM(Mascota m) {
        this.m = m;
    }

    public Veterinario getV() {
        return v;
    }

    public void setV(Veterinario v) {
        this.v = v;
    }
    
    public List<Medicamento> getMedicamentos(){
        return medicamentos;
    }
    
    public void agregarMedicamento(Medicamento medicamento){
        medicamentos.add(medicamento);
    }
  
    
}
