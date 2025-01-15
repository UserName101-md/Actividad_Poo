package org.daniel.alduenda.actividadez.Actividad1.user_int;

import java.util.Scanner;

public class CLI {
    public static void mostrarMenu() {
        System.out.println("1. Crear nueva espada");
        System.out.println("2. Listar espadas");
        System.out.println("3. Retirarse de la armería");
    }

    public void mostrarMensajes(String mensaje) {
        System.out.println(mensaje);

    }

    public void mostrarError(String mensaje) {
        System.out.println("Error: " + mensaje);

    }

    public void mostrarEstudiantes(String[] estudiantes) {
        for (String estudiante : estudiantes ) {
            System.out.println(estudiante);
        }

    }

    public static void launch () {
        mostrarMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        while (opcion !=3) {
            switch (opcion) {
                case 1:
                    System.out.println("crear un nuevo estudiante");
                    break;
                case 2:
                    System.out.println("listar estudiantes");
                    break;
                case 3:
                    System.out.println("opcion invalida");
                    break;



            }

            mostrarMenu();
            opcion = scanner.nextInt();
        }
    }


}
