package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class CargarNotas {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos1 = new ArrayList<>();
        ArrayList<Nota> notas1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        int legajo = 1000;
        String cat;

        while (true){
            System.out.println("Ingrese el nombre del nuevo estudiante o escriba FIN para terminar el proceso: ");
            nombre = sc.next();
            if (nombre.equalsIgnoreCase("FIN")) break;

            // Registrar alumno
            legajo += 1;

            Alumno nuevoAlumno = new Alumno(nombre, legajo);


            // Agregar notas
            System.out.println("Registrando las notas de " + nombre);
            while(true){
                System.out.println("ingresa la catedra o escriba FIN para terminar el proceso: ");
                cat = sc.next();
                if (cat.equalsIgnoreCase("FIN")) break;

                System.out.println("Ingresa la nota del examen: ");
                double resultadoNota = sc.nextDouble();
                Nota nuevaNota = new Nota(cat, resultadoNota);
                nuevoAlumno.agregarNota(nuevaNota);
                System.out.println("Nota cargada exitosamente");
            }
            // Guardar alumno
            alumnos1.add(nuevoAlumno);
            System.out.println("Alumno registrado correctamente");
        }

        // Mostrar promedio de cada alumno

        for (Alumno a: alumnos1) {
            System.out.println("Notas de " + a.getNombreCompleto());
            notas1 = a.getNotas();
            for (Nota n: notas1 ) {
                System.out.println(n.getCatedra() + " " + n.getNotaExamen());
            }
            System.out.println("El promedio de notas es de " + a.obtenerPromedio());

        }
    }



}
