/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.clases;

/**
 *
 * @author Angel
 */
public class Main {
    public static void main(String[] args) {
        //Persona persona = new Persona(1, "Angel", "Gamarra", "angelgcrz@gmail.com", "964339887");
        //var msj = persona.toString();
        //System.out.println(msj);
        
        Persona persona = new Persona();
        persona.setIdPersona(1);
        persona.setNombre("Angel");
        persona.setApellidos("Gamarra");
        persona.setEmail("angelgcrz@gmail.com");
        persona.setTelefono("964339887");
        
        //persona.nombre = "Paola";
        System.out.println(persona);
    }
}
