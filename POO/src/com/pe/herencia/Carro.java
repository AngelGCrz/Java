
package com.pe.herencia;

/**
 *
 * @author Angel
 */
public class Carro extends Vehiculo {
    private final String modelo = "Rav4";

    public static void main(String[] args) {
        // Crea un objeto miCarro
        Carro miCarro = new Carro();

        // Llama al metodo claczon (desde la clase Vehiculo) en el objeto miCarro
        miCarro.claczon();

        // Muestra el valor del atributo marca(desde la clase Vehiculo)
        // y el valor de modelo desde la clase carro
        System.out.println(miCarro.marca + " " + miCarro.modelo);
    }
}
