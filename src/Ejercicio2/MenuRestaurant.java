package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        ArrayList<Plato> platos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String continuar;

        // Cargar Platos
        while(true){

            System.out.println("Si desea finalizar el proceso escriba FIN, sino oprima 'enter'");
            continuar = sc.next();
            if (continuar.equalsIgnoreCase("FIN")) break;

            Plato platoCreado = crearPlato(sc);

            // Integrar ingredientes

            if (platoCreado.esBebida){
                platos.add(platoCreado);
                continue;
            }

            while(true){
                System.out.println("Si desea finalizar el proceso escriba FIN, sino oprima 'enter'");
                continuar = sc.next();
                if (continuar.equalsIgnoreCase("FIN")) break;

                crearIngrediente(sc, platoCreado);
            }

            platos.add(platoCreado);
        }

        mostrarMenu(platos);
    }

    public static Plato crearPlato(Scanner sc){
        String nombreCompleto;
        double precio;
        boolean esBebida;
        System.out.println("Registrar nuevo Plato");
        System.out.println("Ingrese el nombre del plato: ");
        nombreCompleto = sc.next();

        System.out.println("Ingrese el precio del plato: ");
        precio = sc.nextDouble();

        System.out.println("Es una bebida?");
        esBebida = sc.nextBoolean();

        Plato nuevoPlato = new Plato(nombreCompleto, precio, esBebida);
        System.out.println("Nuevo plato creado");
        return nuevoPlato;
    }

    public static void crearIngrediente(Scanner sc, Plato plato){
        String nombre;
        double cantidad;
        String unidadDeMedida;
        System.out.println("Registrando ingrediente para " + plato.getNombreCompleto());

        System.out.print("Ingresa el nombre del ingrediente: ");
        nombre = sc.next();

        System.out.print("Ingresa la cantidad del ingrediente: ");
        cantidad = sc.nextDouble();

        System.out.print("Ingresa la unidad de medida del ingrediente: ");
        unidadDeMedida = sc.next();

        Ingrediente nuevoIngrediente = new Ingrediente(nombre, cantidad, unidadDeMedida);

        plato.agregarIngrediente(nuevoIngrediente);
        System.out.println("Nuevo ingrediente agregado con exito");
    }

    public static void mostrarMenu(ArrayList<Plato> platos){
        System.out.println("------MENU-------");
        // mostrar cada plato
        for (Plato p: platos) {
            System.out.println(p.getNombreCompleto());
            System.out.println("Precio: $" + p.getPrecio());
            System.out.println("Ingredientes");
            System.out.println("Nombre   -   Cantidad   -   Unidad Medida");
            for (Ingrediente i: p.ingredientes ) {
                System.out.println(i.getNombre() + " - " + i.getCantidad() + " - " + i.getUnidadDeMedida());
            }
        }
    }
}
