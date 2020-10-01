package dab.service;

import dab.domain.Compte;
import dab.io.MontantHandler;

public class ServiceRetirer {
    public static void execute( Compte compte){
        System.out.println("Quel montant voulez vous retirer ?");
        float montant = MontantHandler.execute();
        compte.retrait(montant);



    }
}
