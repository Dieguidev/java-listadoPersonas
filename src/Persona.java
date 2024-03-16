public class Persona {
    private int id;
    private String nombre;
    private String telefono;
    private String email;
    private static int numeroPersonas = 0;

    //constructor vacio
    public Persona() {
        this.id = ++Persona.numeroPersonas;
    }

    //constructor con argumentos
    public Persona(String nombre, String telefono, String email) {
        this();
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

}
