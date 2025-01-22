package org.daniel.alduenda.actividadez.actividad2.user_int;

import org.daniel.alduenda.actividadez.actividad2.process.NameValidator;
import java.util.Scanner;

public class CLI {

    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1.- Validador de Nombres");
    }

    public static void runApp(){
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();scanner.nextLine();
        while (opcion!= 3){
            switch (opcion){
                case 1:
                    System.out.println("Introduce un nombre: ");
                    String name = scanner.nextLine();
                    if(NameValidator.validateName(name)){
                        System.out.println("Valido");
                    }else{
                        System.out.println("No Valido");
                    }
                    break;
                default:
            }
            showMenu();
            opcion = scanner.nextInt();scanner.nextLine();

        }


    }

}
