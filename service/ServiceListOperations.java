package dab.service;


import dab.domain.Compte;
import dab.io.MontantHandler;

public class ServiceListOperations {

    public static void execute( Compte compte){
        System.out.println("Vous avez effectué : " + compte.getListOperations().size() + " opération(s)");

        compte.displayOperations();

    }
}
