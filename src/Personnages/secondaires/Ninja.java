package Personnages.secondaires;

import java.util.Random;

import Personnages.principaux.Yakusa;

public class Ninja extends Yakusa {
	
     private String clanSecret;
	 private static final String[] clansNinja = 
		{"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};
	
	public Ninja(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson, clan);
        this.clanSecret = genererClan();
	}
	
	private String genererClan() {
		
		 Random random = new Random();
	     int randomClan = random.nextInt(clansNinja.length);
	     return clansNinja[randomClan];
	}
	
	@Override
	public void direBonjour() {
		 super.direBonjour();
		 parler(" : Je fais partie du " + this.getClan());
		 parler(" : ( mon clan secret est "+this.getClan() +" et maintenant"
		 		+ " que tu le sais, je vais devoir te tuer)");

	}

}
