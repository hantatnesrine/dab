package dab.domain;
import java.util.ArrayList;
import java.util.Date;

public class Compte {
    private float solde;
    private ArrayList<Operation> listOperations = new ArrayList<>();

    public ArrayList<Operation> getListOperations() {
        return listOperations;
    }

    public Compte(float solde) {
        this.solde = solde;
    }

    public void retrait(float montant){
        if (solde >= montant) {
            listOperations.add(new Operation(montant, OperationType.RETRAIT, new Date()));
            solde -= montant;
        }
        else System.out.println("Votre solde n'est pas suffisant");
    }

    public void depot(float montant){
        listOperations.add(new Operation(montant, OperationType.DEPOT, new Date()));
        solde += montant;
    }

    public void displaySolde(){
        System.out.println("Votre solde est : " + solde + " Euros");
    }

    public void displayOperations(){
        for (Operation op : listOperations){
            op.displayInfo();
        }
    }
}
