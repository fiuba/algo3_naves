package model.ataques;

import model.Puntaje;
import model.Puntuable;

public class BombaNeutrones implements Puntuable {
    @Override
    public Puntaje calcularPuntaje() {
        return new Puntaje(5);
    }
}
