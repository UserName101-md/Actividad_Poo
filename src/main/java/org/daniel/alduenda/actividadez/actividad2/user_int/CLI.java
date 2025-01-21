package org.daniel.alduenda.actividadez.actividad2.user_int;

import org.daniel.alduenda.actividadez.actividad2.process.NameCheck;
import java.util.Scanner;

public class CLI {

    public static void showMenu(){

    }

    public static void runApp() {

        /**
         * @scanner capaz de leer las respuestas del usuario en 3 opciones principales y un default para que no coloquen valores erroneos
         */

        Scanner scanner = new Scanner(System.in);
        NameCheck nameCheck = new NameCheck();
        int opcion = scanner.nextInt();

        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    System.out.println("Introduce Nombre");
                    break;
                case 2:
                    System.out.println("Introduce Nombre");
                    break;
            }
            break;

        }

    }
}
