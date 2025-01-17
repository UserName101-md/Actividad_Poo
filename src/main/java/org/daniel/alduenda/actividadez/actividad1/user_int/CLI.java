package org.daniel.alduenda.actividadez.actividad1.user_int;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu() {
        System.out.println("""
                |Menú:
                |1. Crear Auto
                |2. Listar Autos
                |3. Retirarse de la Agencia
                """);

    }

    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        mostrarMenu();
        int opcion = scanner.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    System.out.println("Introduce numero de puertas");
                    int numeroPuertas = scanner.nextInt(); scanner.nextLine();
                    System.out.println("Introduce el color");
                    String color = scanner.nextLine();
                    System.out.println("Introduce el modelo");
                    String modelo = scanner.nextLine();
                    System.out.println("Introduce la marca");
                    String marca = scanner.nextLine();

                    break;
                case 2:
                    System.out.println("El catalogo es el siguiente:");
                    break;
                default:
                    System.out.println("opcion no valida");

            }

            mostrarMenu();
            opcion = scanner.nextInt();
        }
    }
}

