/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.clinicaveterinaria.controlador;
import com.poo.clinicaveterinaria.modelo.*;
import com.poo.clinicaveterinaria.vista.*;

import java.util.ArrayList;
import java.util.List;

        
/**
 *
 * @author Andres
 */
public class ClinicaController {
    private VeterinariaVista vista;
    
    public ClinicaController(){
        this.vista= new VeterinariaVista();
    }
    
    public void iniciar() {
        // 1. Crear propietarios (ArrayList de prueba #1)
        Propietario p1 = new Propietario("Laura Gómez", "1020304050", "3001112233");
        Propietario p2 = new Propietario("Carlos Ruiz", "1122334455", "3009998877");

        List<Propietario> propietarios = new ArrayList<>();
        propietarios.add(p1);
        propietarios.add(p2);

        // 2. Crear mascotas y asociarlas a sus propietarios
        Mascota m1 = new Mascota("Rocky", "Perro", 3, 12.5, "Labrador", p1);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.2, "Siames", p1);
        Mascota m3 = new Mascota("Firulais", "Perro", 5, 18.0, "Criollo", p2);

        p1.agregarMascota(m1);
        p1.agregarMascota(m2);
        p2.agregarMascota(m3);

        // 3. Crear veterinarios (ArrayList de prueba #2)
        Veterinario v1 = new Veterinario("Dra. Ana Torres", "Medicina General", "MV-001");
        Veterinario v2 = new Veterinario("Dr. Luis Peña", "Cirugía", "MV-002");

        List<Veterinario> veterinarios = new ArrayList<>();
        veterinarios.add(v1);
        veterinarios.add(v2);

        // 4. Crear consultas (asociación con Mascota y Veterinario)
        Consulta c1 = new Consulta("2026-09-01", "Control anual", "Sano", m1, v1);
        Consulta c2 = new Consulta("2026-09-05", "Vómito y decaimiento", "Gastroenteritis leve", m2, v1);
        Consulta c3 = new Consulta("2026-09-08", "Cojera pata trasera", "Esguince leve", m3, v2);

        List<Consulta> consultas = new ArrayList<>();
        consultas.add(c1);
        consultas.add(c2);
        consultas.add(c3);

        // 5. Crear medicamentos y recetarlos (dependencia + composición)
        Medicamento med1 = new Medicamento("Vitamina complejo B", "1 ml", "Cada 24h", 5);
        Medicamento med2 = new Medicamento("Suero oral", "50 ml", "Cada 8h", 3);
        Medicamento med3 = new Medicamento("Antiinflamatorio", "5 mg", "Cada 12h", 7);

        v1.recetar(c2, med1);
        v1.recetar(c2, med2);
        v2.recetar(c3, med3);

        // 6. Delegar la impresión a la vista
        vista.mostrarPropietariosConMascotas(propietarios);
        vista.mostrarConsultas(consultas);
        vista.mostrarMedicamentosRecetados(consultas);
    }
}
