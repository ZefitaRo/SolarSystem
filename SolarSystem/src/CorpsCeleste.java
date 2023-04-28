

import java.util.List;

public class CorpsCeleste
{


    protected int id;

    protected String nom = "";

    protected int taille;

    protected int age;

    protected int masse;

    protected int distanceDuSoleil;

    protected int tempsRevolution;

    protected int temperature;

    protected String composition = "";

    protected Position position;

    protected double degreRevolution;

    protected int orbiteAutour;

    public CorpsCeleste(int id, String nom, int taille, int age, int masse, int distanceDuSoleil, int tempsRevolution,
                        int temperature, String composition, Position position, double degreRevolution,
                        int orbiteAutour)
    {
        this.id = id;
        this.nom = nom;
        this.taille = taille;
        this.age = age;
        this.masse = masse;
        this.distanceDuSoleil = distanceDuSoleil;
        this.tempsRevolution = tempsRevolution;
        this.temperature = temperature;
        this.composition = composition;
        this.position = position;
        this.degreRevolution = degreRevolution;
        this.orbiteAutour = orbiteAutour;
    }

    public CorpsCeleste() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMasse() {
        return masse;
    }

    public void setMasse(int masse) {
        this.masse = masse;
    }

    public int getDistanceDuSoleil() {
        return distanceDuSoleil;
    }

    public void setDistanceDuSoleil(int distanceDuSoleil) {
        this.distanceDuSoleil = distanceDuSoleil;
    }

    public int getTempsRevolution() {
        return tempsRevolution;
    }

    public void setTempsRevolution(int tempsRevolution) {
        this.tempsRevolution = tempsRevolution;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getDegreRevolution() {
        return degreRevolution;
    }

    public void setDegreRevolution(double degreRevolution) {
        this.degreRevolution = degreRevolution;
    }

    public int getOrbiteAutour() {
        return orbiteAutour;
    }

    public void setOrbiteAutour(int orbiteAutour) {
        this.orbiteAutour = orbiteAutour;
    }
}
