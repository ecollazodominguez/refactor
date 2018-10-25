package boletin4_4;

public class Boletin4_4 {

    public static void main(String[] args) {
        Cliente clientes = new Cliente();
        clientes.engadirPolbo(2);
        clientes.engadirPatacas(1);
        clientes.amosarPolbo();
        clientes.amosarPatacas();
        clientes.calcularRacion(0, 0);
        clientes.calcularRacion(18, 9);
        clientes.amosarPolbo();
        clientes.amosarPatacas();
    }

}
