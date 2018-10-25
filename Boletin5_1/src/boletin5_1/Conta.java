package boletin5_1;

public class Conta {

    private String nome;
    private String conta;
    private double saldo;

    public Conta() {

    }

    public Conta(String nome, String conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresoSaldo(double dinero) {
        if (dinero <= 0) {
            dinero = 0;
        }
        saldo += dinero;

    }

//    public boolean ingresoSaldo(double dinero) {
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
    public void reintegroSaldo(double dinero) {
        if (dinero <= 0) {
            dinero = 0;
        }
        saldo -= dinero;
    }

//    public boolean reintegroSaldo(double dinero){
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
        System.out.println("\nNome: " + nome + "\nConta: " + conta + "\nSaldo: " + saldo);
    }

    public void transferencia(Conta origen, double importe) {
        reintegroSaldo(importe);
        origen.ingresoSaldo(importe);
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
