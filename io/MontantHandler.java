package dab.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MontantHandler {
    public static float execute(){
        Scanner scanner = new Scanner(System.in);
        float montant ;
        try {
            montant = scanner.nextFloat();
            if (montant <= 0) throw new InputMismatchException();

        }catch (InputMismatchException e){
            System.out.println("Montant invalide");
            montant = 0;
        }
        return montant;
    }
}
