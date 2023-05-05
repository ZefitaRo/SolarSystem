

import java.util.List;

public class CorpsCeleste
{


    protected int id;

    protected String nom = "";

    protected int taille;

    protected int masse;

    protected int distanceDuSoleil;

    protected int tempsRevolution;

    protected int temperature;

    protected String composition = "";

    protected Position position;

    protected double degreRevolution;

    protected int orbiteAutour;

    public CorpsCeleste(int id, String nom, int taille, int masse, int distanceDuSoleil, int tempsRevolution,
                        int temperature, String composition, Position position, double degreRevolution,
                        int orbiteAutour)
    {
        this.id = id;
        this.nom = nom;
        this.taille = taille;
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


    public void setTaille(int taille) {
        this.taille = taille;
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

    public double calculerDistance(Position b)
    {
        double distance = Math.sqrt(Math.pow((b.getX() - position.getX()), 2) + Math.pow((b.getY() - position.getY()),
                2));
        return distance;
    }

    public double calculerDistParcourue(int nbrJour)
    {
         this.degreRevolution = (double)(nbrJour * 360) / this.tempsRevolution;
         return degreRevolution;
    }


}
