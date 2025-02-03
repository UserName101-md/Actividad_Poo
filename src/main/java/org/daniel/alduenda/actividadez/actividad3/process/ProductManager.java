package org.daniel.alduenda.actividadez.actividad3.process;

import org.daniel.alduenda.actividadez.actividad3.models.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    /**
     * Esta parte del codigo declara la lista
     */
    List<Product> stock;
    public ProductManager(){
        this.stock = new ArrayList<>();
    }

    /**
     * Este metodo sirve para añadir las características que incluyen los objetos de "product"
     * @param name significa el nombre del producto
     * @param cost es el costo del producto
     * @param beforeTax el precio del producto antes de impuestos
     * @param afterTax el precio que sigue después de impuestos, precio final
     */
    public void addProduct(String name, double cost, double beforeTax, double afterTax){
        Product product = new Product(cost, name, beforeTax, afterTax);
        stock.add(product);
    }

    /**
     * @return regresa el stock
     */

    public List <Product> getStock(){
        return this.stock;
    }

    /**
     * Metodo para mostrar que producto es más económico
     * @param products es la variable que hace referencia a los productos
     * @return regresa el numero más economico
     */

    public int cheapestProduct(List <Product> products){
        double cost;
        int  indice = 0;

        cost = products.get(0).getCost();

        for (int i=1; i<products.size();i++){
            if (products.get(i).getCost()<cost){
                cost = products.get(i).getCost();
                indice = i;
            }
        }

        return indice+1;
    }
}