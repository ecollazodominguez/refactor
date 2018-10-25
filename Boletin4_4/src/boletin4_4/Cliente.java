package boletin4_4;

public class Cliente {

    private float kgPolbo;
    private float kgPatacas;

    public void engadirPolbo(int po) {
        kgPolbo = kgPolbo + po;
    }

    public void engadirPatacas(int pa) {
        kgPatacas = kgPatacas + pa;
    }

    public void amosarPolbo() {
        System.out.println("Na despensa hai: " + kgPolbo + " kg de polbo.");
    }

    public void amosarPatacas() {
        System.out.println("Na despensa hai: " + kgPatacas + " kg de patacas.");
    }

    public void calcularRacion(float polb, float pata) {
        kgPolbo = kgPolbo + polb;
        kgPatacas = kgPatacas + pata;
        int racion;
        float racionPatacas;
        float racionPolbo;

        racionPatacas = (kgPatacas * 3);
        racionPolbo = (kgPolbo / 2 * 3);

        if (racionPatacas < racionPolbo) {
            racion = (int) racionPatacas;
        } else {
            racion = (int) racionPolbo;
        }

        System.out.println("\nSe poden atender a un total de: " + racion + " clientes.\n");
    }
}
