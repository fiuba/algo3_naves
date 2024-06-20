package model.naves;

import java.util.ArrayList;
import java.util.Collection;

import model.Puntaje;
import model.Puntuable;

public class Flota implements Puntuable {

    private Collection<Puntuable> naves = new ArrayList<>();

    public void agregarNave(Puntuable nave) {
        this.naves.add(nave);
    }

    @Override
    public Puntaje calcularPuntaje() {
        Puntaje puntaje = new Puntaje(0);
        for (Puntuable nave : naves) {
            puntaje = puntaje.sumarseCon(nave.calcularPuntaje());
        }
        return puntaje;
    }
}
