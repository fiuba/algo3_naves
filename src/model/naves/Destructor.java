package model.naves;

import model.ataques.AtaqueDestructor;
import model.escudos.Fenix;

public class Destructor extends Nave {

    public Destructor() {
        this.escudo = new Fenix();
        this.ataque = new AtaqueDestructor();
    }

}
