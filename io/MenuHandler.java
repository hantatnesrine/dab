package dab.io;

import dab.domain.MenuMode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuHandler {

    public static MenuMode execute() {
        displayChoix();
        Scanner scanner = new Scanner(System.in);
        MenuMode menuMode;
        try {
            int choix = scanner.nextInt();
            menuMode = MenuMode.values()[choix - 1];
        }catch (Exception e){
            menuMode = MenuMode.ERROR;
        }
        return menuMode;
    }

    private static void displayChoix() {
        System.out.println("Bonjour veuillez choisir une operation :");
        System.out.println("1 - Solde du compte");
        System.out.println("2 - Retrait");
        System.out.println("3 - Depot");
        System.out.println("4 - Liste des opérations effectuées");
        System.out.println("5 - Terminer");
    }
}
