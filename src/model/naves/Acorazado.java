package model.naves;

import model.ataques.AtaqueAcorazado;
import model.escudos.Ionico;

public class Acorazado extends Nave {

    public Acorazado() {
        this.ataque = new AtaqueAcorazado();
        this.escudo = new Ionico(this.ataque);
    }

}
