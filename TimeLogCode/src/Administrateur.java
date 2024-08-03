import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8461cb28-ed81-4beb-b2d0-39e24b0d2bfb")
public class Administrateur extends Employe {
    


	public Administrateur(String ID, String Nom) {
		super(ID, Nom);
		// TODO Auto-generated constructor stub
	}

	@objid ("a9eafdf2-2099-453d-9b9f-b2d4daaf82a7")
    public String Nom_d_usager;

    @objid ("21195d93-207e-4bd2-a819-b97eeaf372e2")
    public String Mots_de_passe;
    
    

    @objid ("3d7519ab-dfba-42a0-a8a3-52b9c896085b")
    public List<Projet> Projet = new ArrayList<Projet> ();

    @objid ("17670fae-8bd5-429d-997c-71d46d50261d")
    public TimeLogSystème  TimeLogSystem ;



    @objid ("1f843007-b74c-4c19-9cb1-685f9f2fde48")
    public void modifierParametres() {
    	
    }

    @objid ("eeafcdac-23db-42a4-9f93-47ad7d11296b")
    public void modifierProjets() {
    }

    @objid ("35ee025e-fab4-4068-9063-22f3762a99fe")
    public void modifierEmployes() {
    }

    @objid ("6e001478-a6c3-42ab-b858-ef49acbe8011")
    public void assignerProjets() {
    }

}