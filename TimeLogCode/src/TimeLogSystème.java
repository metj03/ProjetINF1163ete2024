import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("46da18a9-ef9e-40af-af0f-bed899ba5e37")
public class TimeLogSystème  {
    @objid ("2000626c-5fd4-4f77-9a75-239223e30f48")
    public String Nombre_d_heure_base;

    @objid ("655e25b9-a3ec-4cd3-9ffc-4a983ce4b3b7")
    public String Nombre_d_heure_supplementaire;

    @objid ("2e21deef-982d-4691-9e93-eaefc7f4137a")
    public String Taux_horaire_supplementaire;

    @objid ("381cdc3f-c9c0-4b78-9aa3-d2779b8fff8e")
    public String Date_periode_de_paye;

    @objid ("22ee2b23-8dea-4b14-ba9e-5966bf54beb0")
    public Payrollinteface Payrollinteface;

    @objid ("b28cc275-a526-480f-bbda-ac9183d3b6b2")
    public List<Rapport> Rapport = new ArrayList<Rapport> ();

    @objid ("0e227a73-6b65-4064-bd40-9ca1d4c0451e")
    public List<Projet>  Projet= new ArrayList<Projet> ();

    @objid ("f1e778d0-09cd-4eae-8d6f-6770397b2d8a")
    public List<Activite> Activite = new ArrayList<Activite> ();

    @objid ("e3f1cd80-beaf-4bbb-b812-a20f862d4d6f")
    public void calculSalaire() {
    }

    @objid ("e41a3a2b-b366-474a-a412-ba6c90f1ce9f")
    public void enregistrementDateHeure() {
    }

    @objid ("1ea7058c-2f2e-41a6-a165-2f8a5ec58cfe")
    public void notificationDebuterActivite() {
    }

    @objid ("6b8c3f1d-777f-415f-b13c-317d340f2413")
    public void notificationTerminerActivite() {
    }

}