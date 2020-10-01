package dab.domain;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Operation {

    private final float montant;
    private final OperationType typeOperations;
    private final Date date;

    public Operation(float montant, OperationType typeOperations, Date date) {
        this.montant = montant;
        this.typeOperations = typeOperations;
        this.date = date;
    }

    public void displayInfo() {
        DateFormat dff = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        System.out.println("Le "+ dff.format(date) + " vous avez effectué un " + typeOperations + " de " + montant + " Euros");

    }
}
