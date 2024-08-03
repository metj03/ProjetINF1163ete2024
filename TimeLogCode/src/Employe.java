import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import java.io.FileWriter;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

@objid ("01605b9d-d95e-4d0e-bce8-ed1e8dbf0375")
public class Employe {
    @objid ("55ea909b-fd7b-4c00-8727-93faaffe2e4b")
    public String ID;
    
    @objid ("4fdde900-1af1-44c5-abba-0e18af04fca0")
    public String Nom;
    
 public Employe(String ID, String Nom) {
    	this.ID =ID;
    	this.Nom = Nom;
    }

    @objid ("e35b434e-3ab8-4fe6-9d48-610619554984")
    public String Date_d_embauche;

    @objid ("726161fd-3ff0-4114-b88b-e402150d9133")
    public String Date;

    @objid ("fee90307-8a38-46bf-9aae-a1d99c1e1a3a")
    public String Taux_horaire;

    @objid ("39f4721a-a90c-4c17-88e5-d78d00effda9")
    public String Historique_de_taux_horaire ;

  @objid ("7b6d0f68-55e4-44f0-a193-b8d461752c36")
    public List<Activite>  activite= new ArrayList<Activite> ();

  @objid ("2a13f055-9a73-4266-a63e-5ed16484c7d2")
    public List<Projet>  projet = new ArrayList<Projet> ();

  @objid ("73dc125f-2915-48da-a851-1e3fb4ad3def")
   public TimeLogSystème TimeLogSysteme ;

   @objid ("77446f00-20dc-4667-8a5e-7f114b88945b")
    public String seConnecter(String idSaisi, String nomSaisi) {
	   String a="";
	   if (ID.equals(idSaisi) && Nom.equals(nomSaisi)) {
           System.out.println("Authentification réussie usager");
           a="1";
           return a;
       }else if(idSaisi.equals("admin") && nomSaisi.equals("admin")){
    	   
           System.out.println("Authentification réussie admin");
           a="1";
           return a;
       }else {
	   System.out.println("L'utilisateur n'existe pas");
	   a="0";
       return a;
       }
    }

    @objid ("9850cc12-7dc7-48fe-8e38-219a81181e55")
    public void debuterActivite() {
    	
    
        Activite nouvelleActivite = new Activite();
        activite.add(nouvelleActivite);

       
        Gson gson = new Gson();
        String jsonActivites = gson.toJson(activite);

        try (FileWriter file = new FileWriter("activites.json")) {
            file.write(jsonActivites);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void terminerActivite() {
      
        Gson gson = new Gson();
        String jsonActivites = gson.toJson(activite);

       
        try (FileWriter file = new FileWriter("activites.json")) {
            file.write(jsonActivites);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}