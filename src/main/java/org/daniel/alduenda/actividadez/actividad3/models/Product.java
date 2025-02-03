package org.daniel.alduenda.actividadez.actividad3.models;

public class Product {

    private double cost;
    private String name;
    private double beforeTax;
    private double afterTax;
    /**
     * Parametros de Producto:
     * @param cost
     * @param name
     * @param beforeTax
     * @param afterTax
     */

    public Product(double cost, String name, double beforeTax, double afterTax) {
        setCost(cost);
        setName(name);
        setBeforeTax(beforeTax);
        setAfterTax(afterTax);
    }

    public double getCost() {
        return cost;
    }

        /**
        * @param cost valida el precio mas bajo
         * @throws IllegalArgumentException Termina el programa si el valor no es valido
        */

    public void setCost(double cost) {
        if(cost<=0){
            throw new IllegalArgumentException("[!] !El precio del producto es demasiado bajo¡ \n Por favor intente de nuevo. -");
        }

        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAfterTax() {
        return afterTax;
    }

    public void setAfterTax(double afterTax) {
        this.afterTax = afterTax;
    }

    public double getBeforeTax() {
        return afterTax;
    }

    public void setBeforeTax(double beforeTax) {
        this.beforeTax = beforeTax;
    }


    @Override
    public String toString() {
        return  "To string";
    }

}