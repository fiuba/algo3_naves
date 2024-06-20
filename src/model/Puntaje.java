package model;

import java.util.Objects;

public class Puntaje {

    private int valor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puntaje puntaje = (Puntaje) o;
        return valor == puntaje.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    public Puntaje(int valor) {
        this.valor = valor;
    }

    public Puntaje sumarseCon(Puntaje otroPuntaje) {
        return new Puntaje(this.valor + otroPuntaje.valorNumerico());
    }

    public Puntaje descontar(Puntaje otroPuntaje) {
        return new Puntaje(this.valor - otroPuntaje.valorNumerico());
    }

    public boolean menorOIgualQue(Puntaje otroPuntaje) {
        return this.valor <= otroPuntaje.valorNumerico();
    }

    public int valorNumerico() {
        return this.valor;
    }

}
