/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pe.polimorfismo;

/**
 *
 * @author Angel
 */
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal();
        Animal miCerdo = new Cerdo();
        Animal miPerro = new Perro();
        
        miAnimal.animalSonido();
        miCerdo.animalSonido();
        miPerro.animalSonido();
    }
}
