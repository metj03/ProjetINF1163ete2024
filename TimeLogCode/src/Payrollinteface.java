import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("5e83e041-4353-4924-ab2d-e33a35ebe79b")
public class Payrollinteface extends Employe {
   

	public Payrollinteface(String ID, String Nom) {
		super(ID, Nom);
		// TODO Auto-generated constructor stub
	}

	@objid ("709c8321-b418-4fea-a29b-f0495e792828")
    public String Nombre_d_heure_base;

    @objid ("d9969166-026e-45f4-8451-d5bbdac5b81d")
    public String Nombre_d_heure_supplementaire;

    @objid ("eff82dd2-2217-4bf0-90d5-49398bd81c9f")
    public String Taux_horaire_supplementaire;

    @objid ("4a9d0117-6e52-4618-9651-b35e59e3febb")
    public String Date_periode_de_paye;

    @objid ("4c502cfd-6e18-4a3e-a4f6-30d741478e0a")
    public void payInfo() {
    }

    @objid ("00ab4bb6-ef67-46f5-beda-2f7eb2a35327")
    public void netFromBrut() {
    }

    @objid ("1b3326c1-fd17-4ab0-b00a-17c8bbaa3ea5")
    public void deductionsReport() {
    }

    @objid ("04305fbf-c361-40b6-ad27-47b408c72c16")
    public void impressionChèques() {
    }

}
