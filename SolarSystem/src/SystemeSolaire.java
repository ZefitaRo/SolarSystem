
import java.util.ArrayList;
import java.util.List;

public class SystemeSolaire
{
    private List<Planete> planetes = new ArrayList<>();


    private List<Satellite> satellites = new ArrayList<>();

    private Etoile soleil;



    public SystemeSolaire(List<Planete> planetes, List<Satellite> satellites, Etoile soleil) {
        this.planetes = planetes;
        this.satellites = satellites;
        this.soleil = soleil;
    }

    public SystemeSolaire(Etoile soleil) {

    }

    public List<Planete> getPlanetes() {
        return planetes;
    }

    public void setPlanetes(List<Planete> planetes) {
        this.planetes = planetes;
    }

    public List<Satellite> getSatellites() {
        return satellites;
    }

    public void setSatellites(List<Satellite> satellites) {
        this.satellites = satellites;
    }

    public Etoile getSoleil() {
        return soleil;
    }

    public void setSoleil(Etoile soleil) {
        this.soleil = soleil;
    }


    public void ajouterPlanete(Planete planete) {
        planetes.add(planete);
    }

    public void ajouterSatellite(Satellite satellite) {
        satellites.add(satellite);
    }




}
