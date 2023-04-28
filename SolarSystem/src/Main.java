import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        JSONObject soleilJson = Outils.jsonFileToJsonObject("soleil.json");
        //JSONObject terreJson = Outils.jsonFileToJsonObject("terre.json");
        //JSONObject luneJson = Outils.jsonFileToJsonObject("lune.json");

        Etoile soleil = (Etoile) FCorpsCeleste.makeCorpsCeleste(ETypeCorpsCeleste.ETOILE, soleilJson);
        //Planete terre = (Planete) FCorpsCeleste.makeCorpsCeleste(ETypeCorpsCeleste.PLANETE, terreJson);
        //Satellite lune = (Satellite)  FCorpsCeleste.makeCorpsCeleste(ETypeCorpsCeleste.SATELLITE, luneJson);

        SystemeSolaire system = new SystemeSolaire(soleil);

        //system.ajouterPlanete(terre);

        //system.ajouterSatellite(lune);

        //system.ajouterPlanete();



    }
}