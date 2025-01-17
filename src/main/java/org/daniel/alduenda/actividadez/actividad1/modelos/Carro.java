package org.daniel.alduenda.actividadez.actividad1.modelos;

public class Carro {
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
        setNumeroPuertas(numeroPuertas);
        this.color = color;

    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas){
        if(numeroPuertas<2 || numeroPuertas>5){
            throw new IllegalArgumentException("Número de puertas no valido, prueba un número entre 2 y 5. -");
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
