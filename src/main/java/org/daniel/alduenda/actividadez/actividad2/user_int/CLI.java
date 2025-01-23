package org.daniel.alduenda.actividadez.actividad2.user_int;

import org.daniel.alduenda.actividadez.actividad2.process.NameValidator;
import org.daniel.alduenda.actividadez.actividad2.process.NumberGenerator;

import java.util.Scanner;

public class CLI {
    /**
     * Interfaz Visual del Menú
     */
    public static void showMenu(){
        System.out.println("""
    _________________________________________________________________________________________________________________
                                                        ¡Bienvenidos a la Actividad 2!
                -----------------------------------------------------------------------------------------------------
                                                              ¿Qué se le ofrece?
                -----------------------------------------------------------------------------------------------------
                    *|+|* 1. -Introducir Contraseña
                    
                    *|@|* 2. -Mostrar Números Pares
                -----------------------------------------------------------------------------------------------------
                                                                *-Opciones-*
                    *|x|* 3. -Salir
                _____________________________________________________________________________________________________
    """);

    }

    public static void runApp(){
        showMenu();
        /**
         * @scanner nos permite leer la información que escribe el usuario
         */
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();scanner.nextLine();
        while (opcion!= 3){
            switch (opcion) {
                case 1:
                    System.out.println("[?] Introduce un nombre: ");
                    System.out.println("");
                    String name = scanner.nextLine();
                    if (NameValidator.validateName(name)) {
                        System.out.println("[!] "+name+" Es un nombre valido");
                    } else {
                        System.out.println("");
                        System.out.println("[!] No Valido");
                        System.out.println("");
                    }
                    break;
                case 2:
                    /**
                     * Traemos a NumberGenerator a CLI
                     */
                    NumberGenerator generator = new NumberGenerator();
                    generator.generadorNumeros();
                    /**
                     * Trayendo los numeros generados como texto
                     */
                    String numbers = generator.numeroGeneradosTexto();
                    System.out.println("[@] Lista de Numeros (Pares): ");
                    System.out.println(numbers);
                    System.out.println("");
                    break;
                default:
                    System.out.println("[!] ¡Opción no valida!, intente otra opción. -");
            }
            showMenu();
            opcion = scanner.nextInt();scanner.nextLine();

        }


    }

}
