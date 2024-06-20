package model.escudos;

import model.Atacable;
import model.Puntaje;
import model.Puntuable;

public class Fenix extends Escudo {

    Simple original;
    Simple resucitado;
    Simple activo;

    public Fenix() {
        this.original = new Simple(new Puntaje(50));
        this.resucitado = new Simple(new Puntaje(30));
        this.activo = original;
    }

    @Override
    public Puntaje calcularPuntaje() {
        return this.activo.calcularPuntaje();
    }

    public void recibirAtaque(Puntaje puntajeDelAtaque) {
        this.activo.recibirAtaque(puntajeDelAtaque);
        if (this.activo.calcularPuntaje().menorOIgualQue(new Puntaje(0))) {
            this.activo = resucitado;
        }
    }
}
