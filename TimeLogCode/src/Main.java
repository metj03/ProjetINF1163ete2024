import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner clavier = new Scanner(System.in);
		Employe a = new Employe("uriel", "upeti");
		
		
	System.out.println("entrer usager ou administrateur");
	String u= clavier.next();
	String uu = clavier.next();
	
	String ab= a.seConnecter(u, uu);
	
	if(ab=="1") {
		System.out.println("Voulez vous debutez une activité si oui tapez Y si non terminer une activité tapez N");
		
	String uuu=clavier.next();
	
	if(uuu.equals("Y")) {
		 Date date = new Date();
		    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		    String dateStr = sdf.format(date);
		System.out.println("c'est une notification du systeme vous avez debuté l'activité voici l'heure et la date que le systeme a enregistré : "+dateStr);
		
		a.debuterActivite();
	}
	else if(uuu.equals("N")) {
		Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    String dateStr = sdf.format(date);
	System.out.println("c'est une notification du systeme vous avez Terminé l'activité Merci!! voici l'heure et la date que le systeme a enregistré : "+dateStr);
	a.terminerActivite();
	
	System.out.println("Merci!!");
	}
	}
	else {
		System.err.println("password and id fail");
	}
		
	
	
	}
	

	

}
