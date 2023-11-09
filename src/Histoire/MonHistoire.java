package Histoire;

import Personnages.Humain;
import Personnages.principaux.Commerçant;
import Personnages.principaux.Ronin;
import Personnages.principaux.Yakusa;

public class MonHistoire {

	public static void main(String[] args) {

		  Humain humain = new Humain("Prof", 10, "Porto");
		  humain.direBonjour();
		  humain.boire();
		  Commerçant commercant = new Commerçant("Marchand", 35);
		  commercant.direBonjour();
		 
		  Yakusa yakusa = new Yakusa("Yaku␣le␣noir", 42,
		                             "biere", "WarSong \n");
		  yakusa.direBonjour();
		  yakusa.extorquer(commercant);
		  Ronin ronin = new Ronin("Roro", 61, "sake \n");
		  ronin.donner( commercant , 10);
		  ronin.provoquer(yakusa);
		  ronin.direBonjour();

	}

}
