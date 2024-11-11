package Ejercicio2;

import java.util.ArrayList;

// nombreCompleto(string), precio (double), esBebida (boolean)
public class Plato {
    String nombreCompleto;
    double precio;
    boolean esBebida;
    ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }
}
