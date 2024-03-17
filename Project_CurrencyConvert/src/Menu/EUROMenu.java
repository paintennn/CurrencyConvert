package Menu;

import java.util.Scanner;
import Controller.EUROController;
import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class EUROMenu {
    private static String type = "EURO";
    private static DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
    public static void menu(Scanner sc){
        int choose;
        do {
            try {
                views.clearScreen();
                System.out.println("\t!!! Select type money to convert from " + type + " !!!");
                System.out.println("\t\t1.Convert to VND");
                System.out.println("\t\t2.Convert to CAD");
                System.out.println("\t\t3.Convert to AUD");
                System.out.println("\t\t4.Convert to SGD");
                System.out.println("\t\t5.Convert to HKD");
                System.out.println("\t\t6.Convert to CNY");
                System.out.println("\t\t7.Convert to USD");
                System.out.println("\t\t8.Convert to RUB");
                System.out.println("\t\t9.Convert to CHF");
                System.out.println("\t\t0.Back");
                System.out.print("\t ===> Choose: " );
                choose = Integer.parseInt(sc.nextLine());
                if(choose == 0) {       return; }  
                else if(choose == 1) {  EUROController.EUROConvertToVND(sc); }
                else if(choose == 2) {  EUROController.EUROConvertToCAD(sc); }
                else if(choose == 3) {  EUROController.EUROConvertToAUD(sc); }
                else if(choose == 4) {  EUROController.EUROConvertToSGD(sc); }
                else if(choose == 5) {  EUROController.EUROConvertToHKD(sc); }
                else if(choose == 6) {  EUROController.EUROConvertToCNY(sc); }
                else if(choose == 7) {  EUROController.EUROConvertToUSD(sc); }
                else if(choose == 8) {  EUROController.EUROConvertToRUB(sc); }
                else if(choose == 9) {  EUROController.EUROConvertToCHF(sc); }

                System.out.print("Do you want make new currency convert by " +  type +  "?(y/n):");
                char select = sc.next().charAt(0);
                if(select == 'y') {  
                    EUROController.EUROConvertMenu(sc);   
                }
                else if(select == 'n'){ 
                    return;     
                }
            } catch (NumberFormatException exception) {}
        } while (true);
    }
    public static void ToVND(Scanner sc){ // 1
        double EUROValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToEURO(1);;
        System.out.println("VND is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToVND(EUROValueToUSD)
        ));
    }
    public static void ToCAD(Scanner sc){ // 2
        double EUROValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToEURO(1);;
        System.out.println("CAD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(EUROValueToUSD)
        ));
    }
    public static void ToAUD(Scanner sc){ // 3
        double EUROValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToEURO(1);;
        System.out.println("AUD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(EUROValueToUSD)
        ));
    }
    public static void ToSGD(Scanner sc){ // 4
        double EUROValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToEURO(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToSGD(EUROValueToUSD)
        ));
    }
    public static void ToHKD(Scanner sc){ // 5
        double EUROValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToEURO(1);;
        System.out.println("HDK is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(EUROValueToUSD)
        ));
    }
    public static void ToCNY(Scanner sc){ // 6
        double EUROValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToEURO(1);;
        System.out.println("CNY is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(EUROValueToUSD)
        ));
    }
    public static void ToUSD(Scanner sc){
        double EUROValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToEURO(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToUSD(EUROValueToUSD)
        ));
    }
    public static void ToRUB(Scanner sc){
        double EUROValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToEURO(1);;
        System.out.println("RUB is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(EUROValueToUSD)
        ));
    }
    public static void ToCHF(Scanner sc){
        double EUROValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToEURO(1);;
        System.out.println("CHF is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(EUROValueToUSD)
        ));
    }
}
