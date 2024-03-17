package Menu;

import java.util.Scanner;

import Controller.DollarController;
import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class DollarMenu {
    public static String type = "USD";
    public static DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
    public static void menu(Scanner sc){
        int choose;
        do {
            try {
                views.clearScreen();
                System.out.println("\t!!! Select type money to convert from Dollar !!!");
                System.out.println("\t\t1.Convert to VND");
                System.out.println("\t\t2.Convert to CAD");
                System.out.println("\t\t3.Convert to AUD");
                System.out.println("\t\t4.Convert to SGD");
                System.out.println("\t\t5.Convert to HKD");
                System.out.println("\t\t6.Convert to CNY");
                System.out.println("\t\t7.Convert to EURO");
                System.out.println("\t\t8.Convert to RUB");
                System.out.println("\t\t9.Convert to CHF");
                System.out.println("\t\t0.Back");
                System.out.print("\t ===> Choose: " );
                choose = Integer.parseInt(sc.nextLine());
                if(choose == 0){        return; }
                if(choose == 1) {       DollarController.DollarConvertToVND(sc); }
                else if(choose == 2) {  DollarController.DollarConvertToCAD(sc); }
                else if(choose == 3) {  DollarController.DollarConvertToAUD(sc); }
                else if(choose == 4) {  DollarController.DollarConvertToSGD(sc); }
                else if(choose == 5) {  DollarController.DollarConvertToHKD(sc); }
                else if(choose == 6) {  DollarController.DollarConvertToCNY(sc); }
                else if(choose == 7) {  DollarController.DollarConvertToEURO(sc); }
                else if(choose == 8) {  DollarController.DollarConvertToRUB(sc); }
                else if(choose == 9) {  DollarController.DollarConvertToCHF(sc); }
                System.out.print("Do you want make new currency convert by " +  type +  "?(y/n):");
                char select = sc.next().charAt(0);
                if(select == 'y') {  DollarController.DollarConvertMenu(sc);   }
                else if(select == 'n'){ return;     }
            } catch (Exception exception) {}
        } while (true);
    }

    public static void ToVND(Scanner sc){
        double value = views.enterValue(sc, type);
        System.out.println("VND is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToVND(value)
        ));
    }
    public static void ToCAD(Scanner sc){
        double value = views.enterValue(sc, type);
        System.out.println("CAD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(value)
        ));
    }
    public static void ToAUD(Scanner sc){
        double value = views.enterValue(sc, type);
        System.out.println("AUD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(value)
        ));
    }
    public static void ToSGD(Scanner sc){
        double value = views.enterValue(sc, type);
        System.out.println("SGD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToSGD(value)
        ));
    }
    public static void ToHKD(Scanner sc){
        double value = views.enterValue(sc, type);
        System.out.println("HKD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(value)
        ));
    }
    public static void ToCNY(Scanner sc){
        double value = views.enterValue(sc, type);
        System.out.println("CNY is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(value)
        ));
    }
    public static void ToEURO(Scanner sc){
        double value = views.enterValue(sc, type);
        System.out.println("EURO is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(value)
        ));
    }
    public static void ToRUB(Scanner sc){
        double value = views.enterValue(sc, type);
        System.out.println("RUB is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(value)
        ));
    }
    public static void ToCHF(Scanner sc){
        double value = views.enterValue(sc, type);
        System.out.println("CHF is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(value)
        ));
    }
}
