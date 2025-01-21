package org.daniel.alduenda.actividadez.actividad1.modelos;

public class Carro {

    /**
     * crea los objetos pertenecientes a la clase (Carro)
     */

    private String modelo;

    private String marca;

    private int numeroPuertas;

    private String color;

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numeroPuertas=" + numeroPuertas +
                ", color='" + color + '\'' +
                '}';
    }

    public Carro(String modelo, String marca, int numeroPuertas, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        setNumeroPuertas(numeroPuertas);


    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * @throws IllegalArgumentException
     * @param numeroPuertas solo acepta valores mayores de 2 y menores de 5. -
     */

    public void setNumeroPuertas(int numeroPuertas){
        if(numeroPuertas<2 || numeroPuertas>5){
            throw new IllegalArgumentException("El número de puertas no es valido; intenta con un número entre 2 y 5. -");
        }

        this.numeroPuertas = numeroPuertas;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
