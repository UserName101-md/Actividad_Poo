package org.daniel.alduenda.actividadez.actividad2.process;
import static org.daniel.alduenda.actividadez.actividad2.models.Names.names;
public class NameValidator {
    /**
     * @param name el nombre que ingresa el usuario
     * @return es la comparación entre la palabra del usuario y las palabras registradas puede ser valido o no valido
     */
    public static boolean validateName(String name){
    boolean valid = false;
    int index = 0;
        while(!valid && index< names.length){
            if(names[index].equals(name)){
                valid = true;
            }
            index++;
        }
        return valid;
    }
}
