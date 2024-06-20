package model.ataques;

import model.Puntaje;
import model.naves.Nave;

public class AtaqueDestructor extends SistemaAtaque {

    private Misilera misilera;

    public AtaqueDestructor() {
        this.misilera = new Misilera(5);
    }

    @Override
    public void atacar(Nave nave) {
        this.misilera.atacar(nave);
    }

    @Override
    public Puntaje calcularPuntaje() {
        Puntaje puntaje = this.misilera.calcularPuntaje();

        if (this.misilera.llena()) {
            puntaje = puntaje.sumarseCon(new Puntaje(20));
        }

        return puntaje;
    }
}
