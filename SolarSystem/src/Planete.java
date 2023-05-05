
import java.util.List;

public class Planete extends CorpsCeleste
{

    List<Satellite> satellites;

    public Planete(int id, String nom, int taille, int masse, int distanceDuSoleil, int tempsRevolution, int temperature,
                   String composition, Position position, double degreRevolution,
                   int orbiteAutour)

    {
        super(id, nom, taille, masse, distanceDuSoleil, tempsRevolution, temperature,
                composition, position, degreRevolution, orbiteAutour);
    }



}