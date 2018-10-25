/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

/**
 *
 * @author ecollazodominguez
 */
public class Consumo {

    //atributos
    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    //constructores
    public Consumo() {

    }

    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;

    }

    //metodos de acceso
    public float getTempo() {
        return vMed / km;
    }

    public float consumoMedio() {
        return litros * 100 / km;

    }

    public float consumoEuros() {
        return pGas * (litros * 100 / km);

    }

    public void setKms(float km) {
        this.km = km;
    }

    public void setLitros(float litros) {
        this.litros = litros;

    }

    public void setvMed(float vMed) {
        this.vMed = vMed;

    }

    public void setPGas(float pGas) {
        this.pGas = pGas;

    }

    public void vMed() {
        System.out.println("A velocidade media é de: " + vMed + " km/h");

    }
}
