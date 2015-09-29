package mx.iteso.observer;

import sun.util.locale.StringTokenIterator;

public class Scorer {
    String name;
    int number;
    String position;
    String team;

    public Scorer(String name, String position, int number, String team){
        this.name = name;
        this.number = number;
        this.position = position;
        this.team = team;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Nombre: "+name+", Numero: "+number+", Posicion: "+position+", Equipo: "+team;
    }
}