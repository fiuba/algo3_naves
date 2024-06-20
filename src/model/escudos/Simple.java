package model.escudos;

import model.Atacable;
import model.Puntaje;
import model.Puntuable;

public class Simple extends Escudo {

    Puntaje vida;

    public Simple(Puntaje vida) {
        this.vida = vida;
    }

    @Override
    public Puntaje calcularPuntaje() {
        return this.vida;
    }

    public void recibirAtaque(Puntaje puntajeDelAtaque) {
        this.vida = this.vida.descontar(puntajeDelAtaque);
    }
}
