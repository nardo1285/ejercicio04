/*

*/
package ejercicio04git;

public class PollitoPio {

    private String nombre;
    private String apodo;
    private int edad;
    private String raza;
    private String color;

    public PollitoPio() {
    }

    public PollitoPio(String nombre, String apodo, int edad, String raza, String color) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
