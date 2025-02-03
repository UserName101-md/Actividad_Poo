package org.daniel.alduenda.actividadez.actividad1.user_int;

import org.daniel.alduenda.actividadez.actividad1.procesos.StockManager;
import org.daniel.alduenda.actividadez.actividad1.modelos.Carro;
import java.util.Scanner;

/**
 * CLI es la interfaz que funciona como menú principal del programa
 */

public class CLI {

    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        StockManager stockManager = new StockManager();
        mostrarMenu();

        /**
         * @scanner capaz de leer las respuestas del usuario en 3 opciones principales y un default para que no coloquen valores erroneos
         */

        int opcion = scanner.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1:

                    System.out.println("|[!] Bienvenidos a la nuestra agencia!");
                    System.out.println("");
                    System.out.println("|[?] Favor de llenar el formulario con las características del auto que depositará (Su auto será visible en nuestro catalógo). -");
                    System.out.println("");
                    System.out.println("|[+] Introduce numero de puertas:");
                    System.out.println("|[!] Recuerda que solo pueden depositarse autos que entren en el estandar automotriz internacional (2 a 5 puertas). -");
                    int numeroPuertas = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("");
                    System.out.println("|[+] Introduce el color: ");
                    System.out.println("|[?] Nuestra galería posee multiples colores (Azul, Rojo, Negro, Blanco y Plateado). -");
                    String color = scanner.nextLine();
                    System.out.println("");
                    System.out.println("|[+] Introduce el modelo (Año de fabricación de su Auto): ");
                    String modelo = scanner.nextLine();
                    System.out.println("");
                    System.out.println("|[+] Introduce la marca: ");
                    String marca = scanner.nextLine();
                    System.out.println("_________________________________________________________________________________________________________________");
                    System.out.println("v [!] ¡Se ha completado su registro con exito! (Su auto estará disponible en el catalógo)");
                    System.out.println("");
                    stockManager.addCarro(modelo, marca, numeroPuertas, color);

                    break;
                case 2:
                    System.out.println("_________________________________________________________________________________________________________________");
                    System.out.println("[@]                    !Bienvenidos al Catalógo¡ de +AAG+ (*Agencia Automotriz Generica*):");
                    System.out.println("[@] Por favor Echele un vistazo a nuestro catálogo en busqueda de un producto que le interese. -");
                    int auto = 1;
                    for (Carro carro : stockManager.getStock()) {

                        System.out.println("");
                        System.out.println("----------------------------");
                        System.out.println("Automovil Número "+auto+":");
                        System.out.println("Modelo del auto: "+carro.getModelo()+". -");
                        System.out.println("Color del auto: "+carro.getColor()+". -");
                        System.out.println("Numero de puertas: "+carro.getNumeroPuertas()+". -");
                        System.out.println("Marca: "+carro.getMarca()+". -");
                        auto++;
                    }
                    break;

                default:
                    System.out.println("¡Opción no valida!, intente otra opción. -");
            }

            mostrarMenu();
            opcion = scanner.nextInt();
        }
    }

    /**
     * @mostrarMenu El menú visual que se le mostrará al usuario
      */

    public static void mostrarMenu() {
        System.out.println("""
                _________________________________________________________________________________________________________________
                                          Bienvenidos al sistema de "AAG" (*Agencia Automotriz Generica*):
                -----------------------------------------------------------------------------------------------------------------
                                                              ¿Qué se le ofrece?
                -----------------------------------------------------------------------------------------------------------------
                    *|+|* 1. -Introducir un Auto al Catalógo
                    
                    *|@|* 2. -Ingresar al Catalógo
                -----------------------------------------------------------------------------------------------------------------
                                                                *-Opciones-*
                    *|x|* 3. -Retirarse de la Agencia
                _________________________________________________________________________________________________________________
                """);

    }
}

