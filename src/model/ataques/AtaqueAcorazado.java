package model.ataques;

import model.Puntaje;
import model.Puntuable;
import model.naves.Nave;

import java.util.ArrayList;
import java.util.Collection;

public class AtaqueAcorazado extends SistemaAtaque {

    private static final int CAPACIDAD_MAXIMA_BOMBAS = 10;

    private Collection<Puntuable> bombas = new ArrayList<Puntuable>();

    public AtaqueAcorazado() {
        for(int i = 0; i < CAPACIDAD_MAXIMA_BOMBAS; i++) {
            this.bombas.add(new BombaNeutrones());
        }
    }

    @Override
    public void atacar(Nave nave) {
        if (!this.bombas.isEmpty()) {
            Puntuable bomba = this.bombas.iterator().next();
            nave.recibirAtaque(bomba.calcularPuntaje());
            this.bombas.remove(bomba);
        }
    }

    @Override
    public Puntaje calcularPuntaje() {
        Puntaje puntaje = new Puntaje(0);

        for (Puntuable bomba : bombas) {
            puntaje = puntaje.sumarseCon(bomba.calcularPuntaje());
        }

        int cantidadBombasDisparadas = CAPACIDAD_MAXIMA_BOMBAS - this.bombas.size();

        if (cantidadBombasDisparadas == 0) {
            return puntaje.sumarseCon(new Puntaje(100));
        }

        return puntaje.descontar(new Puntaje(cantidadBombasDisparadas*10));
    }
}
