package org.daniel.alduenda.actividadez.actividad2.process;
import static org.daniel.alduenda.actividadez.actividad2.models.Names.nombres;
public class NameValidator {

    public static boolean validateName(String name){
    boolean valid = false;
    int index = 0;
        while(!valid && index<nombres.length){
            if(nombres[index].equals(name)){
                valid = true;
            }
            index++;
        }
        return valid;
    }
}
