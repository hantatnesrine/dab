package dab;

import dab.domain.Compte;
import dab.domain.MenuMode;
import dab.io.MenuHandler;
import dab.service.MenuDispatcher;

public class Main {
    public static void main(String[] args) {
        Compte compte = new Compte(10000f);
        boolean flag;
        do {
            MenuMode menuMode = MenuHandler.execute();
            flag = MenuDispatcher.execute(menuMode, compte);
        } while (flag);
    }
}

