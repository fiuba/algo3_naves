package test;

import model.*;
import model.naves.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasosDeUsoTest {

    @Test
    void casoDeUso1Test() {

        Nave corbeta =  new Corbeta();
        Nave acorazado = new Acorazado();
        acorazado.atacar(corbeta);
        acorazado.atacar(corbeta);

        // Ataque
        // 8 bombas restantes * 5 puntos cada una = 40
        // 2 bombas gastadas * -10 puntos cada una = -20
        // Puntaje ataque => 20
        // Puntaje defensa => 20 * 2 => 40
        // Puntaje final = 20 + 40
        Puntaje puntajeEsperado = new Puntaje(60);

        assertEquals(puntajeEsperado, acorazado.calcularPuntaje());
    }

    @Test
    void casoDeUso2Test() {

        Puntuable corbeta =  new Corbeta();
        Puntuable destructor = new Destructor();
        Puntuable acorazado = new Acorazado();

        Flota flota = new Flota();
        flota.agregarNave(corbeta);
        flota.agregarNave(destructor);
        flota.agregarNave(acorazado);

        // 50 de la Corbeta (30 + 20)
        // 120 del Destructor (50 + 20 + 50)
        // 450 del Acorazado (50 + 100 + 150*2)
        Puntaje puntajeEsperado = new Puntaje(620);

        assertEquals(puntajeEsperado, flota.calcularPuntaje());
    }
}