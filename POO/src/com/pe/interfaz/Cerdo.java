
package com.pe.interfaz;

/**
 *
 * @author Angel
 */
public class Cerdo implements Animal{

    @Override
    public void animalSonido() {
        System.out.println("El cerdo dice: wee wee");
    }

    @Override
    public void dormir() {
        System.out.println("Zzz");
    }
    
}
