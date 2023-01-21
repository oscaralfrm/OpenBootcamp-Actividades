public class Main {
    public static void main(String[] args) {
        System.out.println("Mostrando por pantalla los datos del cliente en cuestión...");
        Cliente cliente = new Cliente(26, "Oscar", 123456789, "Excelente.");
        System.out.println("Edad: " + cliente.edad + " ; Nombre: " + cliente.nombre + " ; Teléfono: " +
                cliente.telefono + " ; Nivel de Crédito: " + cliente.credito
        );

        System.out.println();

        System.out.println("Ahora, mosrando los datos de un trabajador de nuestra compañía...");
        Trabajador trabajador = new Trabajador(30, "Eugenio", 987654321, 20000.89);
        System.out.println("Edad: " + trabajador.edad + " ; Nombre: " + trabajador.nombre + " ; Teléfono: " +
                trabajador.telefono + " ; Salario: " + trabajador.salario + " pesos."
        );
    }

}

class Persona {
    protected int edad;
    protected String nombre;
    protected long telefono;

}

class Cliente extends Persona {
    protected String credito;

    public Cliente(int edad, String nombre, long telefono, String credito) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.credito = credito;
    }

}

class Trabajador extends Persona {
    protected double salario;

    public Trabajador(int edad, String nombre, long telefono, double salario) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
        this.salario = salario;
    }
}
