package model.ataques;

import model.Puntaje;
import model.Puntuable;

public class Misil implements Puntuable {
    @Override
    public Puntaje calcularPuntaje() {
        return new Puntaje(10);
    }
}
