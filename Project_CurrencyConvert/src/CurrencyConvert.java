import java.awt.Menu;
import java.util.Scanner;

import Util.MenuViews;
import ViewGeneral.views;
import Views.ViewsConvert;
import Views.ViewsIntro;

public class CurrencyConvert {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int choosefrom = 1;
        do {
            try {
                views.clearScreen();
                System.out.println("\t ==============================");
                System.out.println("\t === Select how to run code ===");
                System.out.println("\t === 1. Terminal.           ===");
                System.out.println("\t === 2. Java Swing.         ===");
                System.out.println("\t === 0. Exit program        ===");
                System.out.println("\t ==============================\n");
                System.out.print("\t ===>Enter select: ");
                choosefrom = Integer.parseInt(sc.nextLine());
                if(choosefrom == 1) { 
                    MenuViews.menu(sc);
                    choosefrom = 2;
                }
                else if(choosefrom == 2) {
                    new ViewsIntro();
                    choosefrom = 0;
                }
            } catch (NumberFormatException exception) {}
        } while (choosefrom != 0);

    }
}
