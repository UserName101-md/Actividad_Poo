package org.daniel.alduenda.actividadez.actividad3.user_int;

import org.daniel.alduenda.actividadez.actividad3.models.Product;
import org.daniel.alduenda.actividadez.actividad3.process.ProductManager;
import java.util.Scanner;


public class CLI {
    /**
     * Le permite al usuario ingresar a las características del programa. -
     */
    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        System.out.println("""
            [v]Tienda de Dani:
            ---------------------------------
            Selecciona una opción
            
            [@]x. Agregar un producto al carrito. -
            [Q]2. (No disponible). -
            ---------------------------------
            Opciones:
            [@]3. Salir
            """);
        int option = scanner.nextInt();scanner.nextLine();


        while (option != 3){
            switch (option){
                case 1:
                    System.out.print("[*] Bienvenido a su carrito, Por favor ingrese la información de su producto. - \n");
                    System.out.println("---------------------------------");
                    System.out.print("[?] Ingrese el nombre del producto: \n");
                    String name = scanner.nextLine();
                    System.out.println("---------------------------------");
                    System.out.print("[?] Ingrese el precio del producto: \n");
                    double cost = scanner.nextDouble();
                    double beforeTax = cost + (cost*.20);
                    double afterTax = beforeTax + (beforeTax*.162);
                    productManager.addProduct(name, cost, beforeTax, afterTax);

                    break;

                case 2:

                    System.out.println("\n [!] Los productos a comparar son: ");
                    for(Product product:productManager.getStock()){
                        formatProduct(product);
                    }
                    System.out.println("\n [*] El producto más barato es el número: " +
                            productManager.cheapestProduct(productManager.getStock()) + "\n");

                    break;

                default:
                    System.out.println("[!] ¡Opción no valida!, por favor intenta otro número");
            }
            showMenu();
            option = scanner.nextInt();scanner.nextLine();
        }
    }

    /**
     * Genera la interfaz visual
     */
    public static void showMenu(){
        System.out.println("""
            [v]Tienda de Dani:
            ---------------------------------
            Selecciona una opción
            
            [@]1. Agregar un producto al carrito. -
            [Q]2. Comparar precios del carrito. -
            ---------------------------------
            Opciones:
            [@]3. Salir
            """);
    }

    /**
     * El método sirve para definir mejor la impresión del objeto product
     * @param product el objeto principal, incluye nombre, costo e impuestos. -
     */
    public static void formatProduct(Product product){
        System.out.println("\n" +
                "[#] Nombre del producto: " + product.getName() + '\n' +
                "[$] Precio: " + product.getCost() + '\n' +
                "[<] Precio previo a impuestos: " + product.getBeforeTax() + '\n' +
                "[>] Precio después de impuestos: " + product.getAfterTax() + '\n' );
    }
}