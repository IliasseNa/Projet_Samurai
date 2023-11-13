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
	     switch(randomClan) {
	     case 0 : 
	    	 return clansNinja[0];
	     case 1 : 
	    	 return clansNinja[1];
	     case 2 : 
	    	 return clansNinja[2];
	     case 3 : 
	    	 return clansNinja[3];
	     case 4 : 
	    	 return clansNinja[4];
	    default : 
	    	return "";
	     }

	}
	
	@Override
	public void direBonjour() {
		 super.direBonjour();
		 parler(" : (mon clan secret est "+this.getClan()+" " + genererClan() +" et maintenant"
		 		+ " que tu le sais, je vais devoir te tuer)");

	}

}
