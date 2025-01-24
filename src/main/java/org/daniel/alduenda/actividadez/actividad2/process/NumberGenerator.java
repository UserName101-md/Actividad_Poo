package org.daniel.alduenda.actividadez.actividad2.process;

import java.util.ArrayList;
import java.util.List;
/**
 * Listas de numeros generados
 */
public class NumberGenerator {
    private List<Integer> numerosGenerados;

    public NumberGenerator() {
        this.numerosGenerados = new ArrayList<>();
    }

    /**
     * Agregamos números Pares
     */
    public void generadorNumeros() {
        for (int i = 0; i <= 100; i += 2) {
            numerosGenerados.add(i);
        }
    }

    /**
     * @return regresa la lista de numeros generados
     */
    public String numerosGeneradosTexto() {
        return numerosGenerados.toString();
    }

    }