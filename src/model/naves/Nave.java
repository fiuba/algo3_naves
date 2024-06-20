package model.naves;

import model.Atacable;
import model.Atacante;
import model.Puntaje;
import model.Puntuable;
import model.ataques.SistemaAtaque;
import model.escudos.Escudo;

public abstract class Nave implements Puntuable, Atacable, Atacante {

    Escudo escudo;
    SistemaAtaque ataque;

    public void recibirAtaque(Puntaje puntaje) {
        this.escudo.recibirAtaque(puntaje);
    }

    public Puntaje calcularPuntaje() {
        return escudo.calcularPuntaje().sumarseCon(ataque.calcularPuntaje());
    }

    public void atacar(Nave nave) {
        ataque.atacar(nave);
    }
}
