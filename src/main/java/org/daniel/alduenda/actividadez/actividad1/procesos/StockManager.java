package org.daniel.alduenda.actividadez.actividad1.procesos;

import org.daniel.alduenda.actividadez.actividad1.modelos.Carro;

import java.util.ArrayList;
import java.util.List;

public class StockManager {
    ArrayList<Carro> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }

    /**
     * Genera un nuevo objeto (auto) y lo agrega al catalogo que posee la aplicación
     * Esto son sus parametros:
     *
     * @param modelo el año donde se manofacturó el auto
     * @param marca que marca ha producido el auto
     * @param numeroPuertas el numero de puertas que poseé (incluyendo la cajuela)
     * @param color Azul, Rojo, Negro, Blanco y Plateado
     */

    public void addCarro(String modelo, String marca, int numeroPuertas, String color){
        Carro carro= new Carro(modelo,marca,numeroPuertas,color);
        stock.add(carro);
    }

    /**
     * @return devuelve la memoria del catalogo en forma de una lista
     */

    public List<Carro> getStock(){
        return this.stock;
    }



}
