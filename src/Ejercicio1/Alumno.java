package Ejercicio1;

import java.util.ArrayList;

public class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> nota1 = new ArrayList<>();

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public void agregarNota(Nota nota){
        nota1.add(nota);
    }

    public ArrayList<Nota> getNotas(){
        return nota1;
    }

    public double obtenerPromedio(){
        double promedio = 0;

        if (nota1.isEmpty()){
            System.out.println("No hay notas agregadas");
            return 0;
        }

        for (Nota i: nota1) {
            promedio += i.getNotaExamen();
        }

        return promedio;
    }
}
