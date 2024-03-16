import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //empezamos el menu
        var salir = false;
        while (!salir) {
            mostrarMenu();
            try {

                ejecutarOperacion(consola,personas);
            } catch (Exception e) {
                System.out.println("Opcion no valida");
            }


            System.out.println();
        }
    }

    private static void mostrarMenu() {
        System.out.print("""
                1. Agregar persona
                2. Listar personas
                3. Salir
                """);
        System.out.print("Proporciona la opcion?: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion) {
            case 1:
                System.out.print("Proporciona el nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el telefono: ");
                var telefono = consola.nextLine();
                System.out.print("Proporciona el email: ");
                var email = consola.nextLine();

                //Crear el objeto persona
                var persona = new Persona(nombre, telefono, email);

                //agregamos a la lista
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " personas");
                break;
            case 2:
                System.out.println("Listado de Personas: ");

                //usando lambda y metodo de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
                break;
            case 3:
                System.out.println("Programa terminado ...");
                salir = true;
                break;
            default:
                System.out.println("Opcion no valida: "+ opcion);
                break;
        }
        return salir;
    }
}