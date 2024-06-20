package model.escudos;

import model.Puntaje;
import model.Puntuable;

public class Ionico extends Escudo {

    private Puntuable sistemaDeAtaque;

    public Ionico(Puntuable sistemaDeAtaque) {
        this.sistemaDeAtaque = sistemaDeAtaque;
    }

    @Override
    public Puntaje calcularPuntaje() {
        return this.sistemaDeAtaque.calcularPuntaje().sumarseCon(this.sistemaDeAtaque.calcularPuntaje());
    }

    public void recibirAtaque(Puntaje puntajeDelAtaque) {}
}
