package Personnages.secondaires;

import java.util.Random;

import Personnages.Humain;
import Personnages.principaux.Commerçant;
import Personnages.principaux.Ronin;
import Personnages.principaux.Samurai;

public class GrandMere extends Humain{

	private Humain [] memoire ;
	
	public GrandMere(String nom, int argent) {
		super(nom, argent, "Tisane");
		this.memoire = new Humain[30] ;
		
	}
	
	private String humainHasard() {
		Random random = new Random();
		int choix = random.nextInt(3) ;
		
		switch(choix) {
		case 0 : 
			return "Commerçant";
		case 1 : 
			return "Ronin";
		case 2 : 
			return "Samurai";
		 default:
            return  "Inconnu";
		}
	}
	
	public void faireConnaissanceAvec(Humain h ) {
		for(int i = 0 ; i < memoire.length; i++) {
			if(memoire[i]== null) {
				memoire[i] = h ;
				parler(" : J'ai fais connaissance avec : " + h.getNom());
				return;
			}
		}
		parler(" : Ma mémoire est pleine");
	}
	
	public void ragoter() {
		for(Humain h : memoire) {
			if (h instanceof Traitre) {
				parler(" : Je sais que " + h.getNom() + " est un : Traitre");
			}
			else 
				if ((h instanceof Commerçant) 
				 ||(h instanceof Ronin) 
				 ||(h instanceof Samurai)) {
					parler(" : Je crois que " + h.getNom() + 
						   " est un : " + humainHasard());
			}
		}
	}
}
