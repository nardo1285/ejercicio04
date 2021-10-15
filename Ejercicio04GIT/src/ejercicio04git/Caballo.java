/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04git;

/**
 *
 * @author luis
 */
public class Caballo {
    private String nombre;
    private String apodo;
    private int edad;
    private String raza;
    private long peso;

    public Caballo() {
    }
    
    public Caballo(String nombre, String apodo, int edad, String raza, long peso) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public long getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Caballo{" + "nombre=" + nombre + ", apodo=" + apodo + ", edad=" + edad + ", raza=" + raza + ", peso=" + peso + '}';
    }
    
    
    
    
}
