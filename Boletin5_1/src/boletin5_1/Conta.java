package boletin5_1;

public class Conta {

    private String nome;
    private String numConta;
    private double saldo;

    public Conta() {

    }

    public Conta(String nome, String conta, double saldo) {
        this.nome = nome;
        this.numConta = conta;
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarSaldo(double dinero) {
        if (dinero <= 0) {
            dinero = 0;
        }
        saldo += dinero;

    }

//    public boolean ingresarSaldo(double dinero) {
//        boolean correcto = true;
//        if (dinero < 0) {
//            correcto = false;
//        } else if (saldo >= dinero) {
//            saldo += dinero;
//        } else {
//            correcto = false;
//        }
//        return correcto;
//    }
    public void retirarSaldo(double dinero) {
        if (dinero <= 0) {
            dinero = 0;
        }
        saldo -= dinero;
    }

//    public boolean retirarSaldo(double dinero){
//    boolean correcto = true;
//       if (dinero < 0){
//                correcto = false;
//            } else if (saldo >= dinero) {
//                saldo -= dinero;
//            } else {
//                correcto = false;
//            }
//            return correcto;
//        }
    public void amosarDatos() {
        System.out.println("\nNome: " + nome + "\nConta: " + numConta + "\nSaldo: " + saldo);
    }

    public void transferencia(Conta origen, double importe) {
        retirarSaldo(importe);
        origen.ingresarSaldo(importe);
    }

//    public boolean transferencia(Conta origen, double importe) {
//        boolean correcto = true;
//        if (importe < 0) {
//            correcto = false;
//        } else if (saldo >= importe) {
//            reintegroSaldo(importe);
//            origen.ingresoSaldo(importe);
//        } else {
//            correcto = false;
//        }
//        return correcto;
//    }
}
