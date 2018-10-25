package boletin3_1;

public class Boletin3_1 {

    public static void main(String[] args) {
        //A- constructor sen parametros
        Consumo consume = new Consumo();
        //B- damos valor a litros y precio gasolina
        consume.setLitros(50f);
        consume.setPGas(1.57f);
        //C- constructor con parametros
        Consumo consumo = new Consumo(100f, 60f, 105f, 1.80f);
        //D- visualizamos consumo medios
        System.out.println("O consumo medio é de: " + consumo.calcularConsumoMedio() + " litros cada 100km");
        //E- damos valor a litros
        consumo.setLitros(50f);
        //F -visualizamos velocidad media
        consumo.MostrarVelo_Med();
    }

}
