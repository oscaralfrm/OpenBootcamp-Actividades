import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        // Edad
        persona.setEdad(26);
        int edadPersona = persona.getEdad();

        // Nombre
        persona.setNombre("Oscar");
        String nombrePersona = persona.getNombre();

        // Teléfono
        persona.setTelefono("3518570887");
        String telefonoPersona = persona.getTelefono();

        llamarPersona(edadPersona, nombrePersona, telefonoPersona);
    }

    public static void llamarPersona(int edad, String nombre, String telefono) {
        System.out.println("Edad: " + edad + " ; Nombre: " + nombre + " ; Teléfono: " + telefono);
    }
}


class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    // Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    // Getters

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }


}