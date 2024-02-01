package Carrera;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Participante participante = new Participante(
            1, 
            "1000066567", 
            "Andrés Madera", 
            22, "3023451122", 
            "3216549870", 
            "A-"
        );

        Inscripcion inscripcion = new Inscripcion(1, "Circuito medio", participante);

        ArrayList<Object> participantes = new ArrayList<>();
        participantes.add(participante);

    }
}
