package model.ataques;

import model.Puntaje;
import model.naves.Nave;

public class AtaqueCorbeta extends SistemaAtaque {

    private Misilera misilera;

    public AtaqueCorbeta() {
        this.misilera = new Misilera(3);
    }

    @Override
    public void atacar(Nave nave) {
        this.misilera.atacar(nave);
    }

    @Override
    public Puntaje calcularPuntaje() {
        return this.misilera.calcularPuntaje();
    }
}
