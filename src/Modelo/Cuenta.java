package Modelo;

import java.util.ArrayList;

public class Cuenta {
    String numeroCuenta;
    ArrayList<Transaccion> transacciones = new ArrayList<>();

    public Cuenta(String numeroCuenta, ArrayList<Transaccion> transacciones) {
        this.numeroCuenta = numeroCuenta;
        this.transacciones = transacciones;
    }
}
