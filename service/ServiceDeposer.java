package dab.service;

import dab.domain.Compte;
import dab.io.MontantHandler;

public class ServiceDeposer {

    public static void execute( Compte compte){
        System.out.println("Quel montant voulez vous deposer ?");
        float montant = MontantHandler.execute();
        compte.depot(montant);

    }
}
