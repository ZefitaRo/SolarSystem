import org.json.JSONObject;

public class FCorpsCeleste
{
    public static CorpsCeleste makeCorpsCeleste(ETypeCorpsCeleste type, JSONObject o) {
        int id = o.getInt("id");
        String nom = o.getString("nom");
        int taille = o.getInt("taille");
        int masse = o.getInt("masse");
        int distanceSoleil = o.getInt("distancesoleil");
        int tempsRevolution = o.getInt("tempsRevolution");
        int temperature = o.getInt("temperature");
        String composition = o.getString("composition");

        JSONObject jsonPosition = o.getJSONObject("position");
        Position position = new Position(jsonPosition.getDouble("x"), jsonPosition.getDouble("y"));
        double degreRevolution = o.getInt("degreRevolution");

        int orbiteAutour = o.getInt("orbiteAutour");

        switch (type) {
            case ETOILE -> {
                String typeEtoile = o.getString("typeEtoile");
                return new Etoile(id,  nom,  taille, masse,  distanceSoleil,  tempsRevolution,  temperature,
                 composition,  position,  degreRevolution,  orbiteAutour);
            }

            case PLANETE -> {
                return new Planete(id, nom, taille, masse, distanceSoleil, tempsRevolution,
                        temperature, composition, position, degreRevolution, orbiteAutour);
            }

            case SATELLITE -> {
                return new Satellite(id, nom, taille, masse, distanceSoleil, tempsRevolution,
                        temperature, composition, position, degreRevolution, orbiteAutour);
            }

            default -> {
                return null;

            }

        }

    }

}
