package boletin5_1;

public class Boletin5_1 {

    public static void main(String[] args) {
        //Instanciamos un objeto con constructor sin parametros
        Conta cuentaOrigen = new Conta();
        cuentaOrigen.setNome("Maria");
        cuentaOrigen.setNumConta("842642");
        cuentaOrigen.setSaldo(7529.55);
        //Instanciamos un objeto con constructo con parametros
        Conta cuentaDestino = new Conta("Pepe", "842532", 5242.53);

        //retiro e ingreso saldo en distintas cuentas
        cuentaOrigen.retirarSaldo(
                100);
        cuentaDestino.ingresarSaldo(800);
        //Muestro datos
        cuentaOrigen.amosarDatos();
        cuentaDestino.amosarDatos();

        //hago transferencia de cOrigen a cDestino y muestro
        cuentaOrigen.transferencia(cuentaDestino, 2000);

        cuentaDestino.amosarDatos();
        cuentaOrigen.amosarDatos();
    }

}
