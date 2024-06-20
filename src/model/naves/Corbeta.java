package model.naves;

import model.Puntaje;
import model.ataques.AtaqueCorbeta;
import model.escudos.Simple;

public class Corbeta extends Nave {

     public Corbeta() {
         this.escudo = new Simple(new Puntaje(20));
         this.ataque = new AtaqueCorbeta();
     }
}
