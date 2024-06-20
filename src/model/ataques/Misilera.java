package model.ataques;

import model.Atacante;
import model.Puntaje;
import model.Puntuable;
import model.naves.Nave;

import java.util.ArrayList;
import java.util.Collection;

public class Misilera implements Puntuable, Atacante {

    private Collection<Puntuable> misiles = new ArrayList<Puntuable>();
    private int capacidad;

    public Misilera(int capacidad) {
        this.capacidad = capacidad;
        for(int i = 0; i < capacidad; i++) {
            this.misiles.add(new Misil());
        }
    }

    public boolean llena() {
        return this.misiles.size() == this.capacidad;
    }


    @Override
    public Puntaje calcularPuntaje() {
        Puntaje puntaje = new Puntaje(0);

        for (Puntuable misil : misiles) {
            puntaje = puntaje.sumarseCon(misil.calcularPuntaje());
        }

        return puntaje;
    }

    @Override
    public void atacar(Nave nave) {
        if (!this.misiles.isEmpty()) {
            Puntuable misil = this.misiles.iterator().next();
            nave.recibirAtaque(misil.calcularPuntaje());
            this.misiles.remove(misil);
        }
    }
}
