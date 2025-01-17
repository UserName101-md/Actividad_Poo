package org.daniel.alduenda.actividadez.actividad1.procces;

import org.daniel.alduenda.actividadez.actividad1.modelos.Carro;

import java.util.ArrayList;

public class stockManager {
    ArrayList<Carro> stock;

    public stockManager() {
        this.stock = new ArrayList<>();
    }


    /**
     * @param modelo el año donde se manofacturó el auto
     * @param marca que marca ha producido el auto
     * @param numeroPuertas el numero de puertas que poseé
     * @param color Blanco y gris
     */

    public void addCarro(String modelo, String marca, int numeroPuertas, String color){
        Carro carro= new Carro(modelo,marca,numeroPuertas,color);
        stock.add(carro);

    }


    public void getStock(){
        System.out.print("El catalogo está vacio");
        System.out.println(stock);
    }



}
