package boletin4_4;

public class Cliente {

    private float polbo;
    private float patacas;

    public void engadirPolbo(int po) {
        polbo = polbo + po;
    }

    public void engadirPatacas(int pa) {
        patacas = patacas + pa;
    }

    public void amosarPolbo() {
        System.out.println("Na despensa hai: " + polbo + " kg de polbo.");
    }

    public void amosarPatacas() {
        System.out.println("Na despensa hai: " + patacas + " kg de patacas.");
    }

    public void calcularRacion(float polb, float pata) {
        polbo = polbo + polb;
        patacas = patacas + pata;
        int racion;
        float racionPatacas;
        float racionPolbo;

        racionPatacas = (patacas * 3);
        racionPolbo = (polbo / 2 * 3);

        if (racionPatacas < racionPolbo) {
            racion = (int) racionPatacas;
        } else {
            racion = (int) racionPolbo;
        }

        System.out.println("\nSe poden atender a un total de: " + racion + " clientes.\n");
    }
}
