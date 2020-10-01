package dab.service;

import dab.domain.Compte;
import dab.domain.MenuMode;

public class MenuDispatcher {
    public static boolean execute(MenuMode menuMode, Compte compte) {
        switch (menuMode) {
            case SOLDE -> compte.displaySolde();
            case RETRAIT -> {
                ServiceRetirer.execute(compte);
                compte.displaySolde();
            }
            case DEPOT -> {
                ServiceDeposer.execute(compte);
                compte.displaySolde();
            }
            case OPERATIONS -> ServiceListOperations.execute(compte);
            case TERMINER -> {
                System.out.println("Bye Merci d'avoir choisi notre banque");
                return false;
            }
            default -> System.out.println("Illegal operation");
        }
        return true;
    }
}
