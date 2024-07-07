
package com.pe.abstracto;

/**
 *
 * @author Angel
 */
abstract class Animal {
    // Metodo abstracto ( no tiene un cuerpo)
    public abstract void animalSonido();

    // Metodo regular
    public void dormir() {
        System.out.println("Zzz");
    }
}
