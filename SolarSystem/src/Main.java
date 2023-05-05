import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        JSONObject soleilJson = Outils.jsonFileToJsonObject("SolarSystem/soleil.json");
        JSONObject terreJson = Outils.jsonFileToJsonObject("SolarSystem/terre.json");
        JSONObject luneJson = Outils.jsonFileToJsonObject("SolarSystem/lune.json");

        Etoile soleil = (Etoile) FCorpsCeleste.makeCorpsCeleste(ETypeCorpsCeleste.ETOILE, soleilJson);
        Planete terre = (Planete) FCorpsCeleste.makeCorpsCeleste(ETypeCorpsCeleste.PLANETE, terreJson);
        Satellite lune = (Satellite)  FCorpsCeleste.makeCorpsCeleste(ETypeCorpsCeleste.SATELLITE, luneJson);

        SystemeSolaire system = new SystemeSolaire(soleil);

        system.ajouterPlanete(terre);

        system.ajouterSatellite(lune);

        //system.ajouterPlanete();


        //System.out.println(soleil.calculerDistance(terre.getPosition()));
        double rad = Math.toRadians(terre.calculerDistParcourue(200));
        terre.setPosition(new Position(Math.cos(rad), Math.sin(rad)));


        System.out.println(terre.getPosition().toString());


    }
}