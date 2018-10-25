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
    private float velo_Med;
    private float precioGas;

    //constructores
    public Consumo() {

    }

    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.velo_Med = vMed;
        this.precioGas = pGas;

    }

    //metodos de acceso
    public float getTempo() {
        return velo_Med / km;
    }

    public float calcularConsumoMedio() {
        return litros * 100 / km;

    }

    public float calcularConsumoEuros() {
        return precioGas * (litros * 100 / km);

    }

    public void setKms(float km) {
        this.km = km;
    }

    public void setLitros(float litros) {
        this.litros = litros;

    }

    public void setVelo_Med(float velo_Med) {
        this.velo_Med = velo_Med;

    }

    public void setPGas(float pGas) {
        this.precioGas = pGas;

    }

    public void MostrarVelo_Med() {
        System.out.println("A velocidade media é de: " + velo_Med + " km/h");

    }
}
