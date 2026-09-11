/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.clinicaveterinaria.vista;
import com.poo.clinicaveterinaria.modelo.*;
import java.util.List;

/**
 *
 * @author Andres
 */
public class VeterinariaVista {
    public void mostrarPropietariosConMascotas(List<Propietario> propietarios) {
        System.out.println("========================================");
        System.out.println("      PROPIETARIOS Y SUS MASCOTAS");
        System.out.println("========================================"); 

        for (Propietario p : propietarios) {
            System.out.println("Propietario: " + p.getNombre()
                    + " | Cedula: " + p.getCedula()
                    + " | Teléfono: " + p.getTelefono());

            List<Mascota> mascotas = p.getMascotas();
            if (mascotas.isEmpty()) {
                System.out.println("   (Sin mascotas registradas)");
            } else {
                for (Mascota m : mascotas) {
                    System.out.println("   -> " + m.obtenerDescripcion());
                }
            }
            System.out.println("----------------------------------------");
        }
        System.out.println();
    }

    public void mostrarConsultas(List<Consulta> consultas) {
        System.out.println("========================================");
        System.out.println("           CONSULTAS REALIZADAS");
        System.out.println("========================================");

        for (Consulta c : consultas) {
            System.out.println("Fecha: " + c.getFecha());
            System.out.println("Mascota atendida: " + c.getM().getNombre());
            System.out.println("Veterinario: " + c.getV().getNombre());
            System.out.println("Motivo: " + c.getMotivo());
            System.out.println("Diagnóstico: " + c.getDiagnostico());
            System.out.println("----------------------------------------");
        }
        System.out.println();
    }

    public void mostrarMedicamentosRecetados(List<Consulta> consultas) {
        System.out.println("========================================");
        System.out.println("        MEDICAMENTOS RECETADOS");
        System.out.println("========================================");

        for (Consulta c : consultas) {
            List<Medicamento> medicamentos = c.getMedicamentos();

            System.out.println("Consulta del " + c.getFecha()
                    + " (Mascota: " + c.getM().getNombre() + ")");

            if (medicamentos.isEmpty()) {
                System.out.println("   (No se recetaron medicamentos)");
            } else {
                for (Medicamento med : medicamentos) {
                    System.out.println("   -> " + med.getNombre()
                            + " | Dosis: " + med.getDosis()
                            + " | Frecuencia: " + med.getFrecuencia()
                            + " | Duración: " + med.getDuracionTratamiento() + " días");
                }
            }
            System.out.println("----------------------------------------");
        }
        System.out.println();
    }
}
