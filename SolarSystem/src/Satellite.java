public class Satellite extends CorpsCeleste
{

    public Satellite(int id, String nom, int taille, int age, int masse, int distanceDuSoleil, int tempsRevolution,
                     int temperature, String composition, Position position, double degreRevolution, int orbiteAutour)
    {
        super(id, nom, taille, age, masse, distanceDuSoleil, tempsRevolution, temperature, composition, position, degreRevolution, orbiteAutour);
    }


    public Satellite(int id, String nom, int taille, int masse, int distanceSoleil, int tempsRevolution, int temperature,
                     String composition, Position position, double degreRevolution, int orbiteAutour)
    {
    }
}
