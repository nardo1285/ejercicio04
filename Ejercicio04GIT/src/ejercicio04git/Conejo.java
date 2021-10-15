/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04git;

/**
 *
 * @author recos
 */
public class Conejo {
    private String nombre;
    private int edad;

    public Conejo() {
    }

    public Conejo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Conejo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
