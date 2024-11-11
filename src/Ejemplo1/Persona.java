package Ejemplo1;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private Curso curso;
    private ArrayList<Auto> autos = new ArrayList<>();


    public Persona(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void mostrarAutos(){
        System.out.println(" tiene los siguientes autos ");

        for (Auto i: autos ) {
            System.out.println(i.getMarca());
        }

    }

    public void agregarAutos(Auto auto1) {
        autos.add(auto1);
    }

    public void caminar(){
        System.out.println("Estoy caminando");
    }
}
