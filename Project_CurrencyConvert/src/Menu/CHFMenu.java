package Menu;

import java.util.Scanner;

import Controller.CHFController;
import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class CHFMenu {
    private static String type = "CHF";
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
                System.out.println("\t\t7.Convert to EURO");
                System.out.println("\t\t8.Convert to RUB");
                System.out.println("\t\t9.Convert to USD");
                System.out.println("\t\t0.Back");
                System.out.print("\t ===> Choose: " );
                choose = Integer.parseInt(sc.nextLine());
                if(choose == 0) {       return; }  
                else if(choose == 1) {  CHFController.CHFConvertToVND(sc); }
                else if(choose == 2) {  CHFController.CHFConvertToCAD(sc); }
                else if(choose == 3) {  CHFController.CHFConvertToAUD(sc); }
                else if(choose == 4) {  CHFController.CHFConvertToSGD(sc); }
                else if(choose == 5) {  CHFController.CHFConvertToHKD(sc); }
                else if(choose == 6) {  CHFController.CHFConvertToCNY(sc); }
                else if(choose == 7) {  CHFController.CHFConvertToEURO(sc); }
                else if(choose == 8) {  CHFController.CHFConvertToRUB(sc); }
                else if(choose == 9) {  CHFController.CHFConvertToUSD(sc); }

                System.out.print("Do you want make new currency convert by " +  type +  "?(y/n):");
                char select = sc.next().charAt(0);
                if(select == 'y') {  
                    CHFController.CHFConvertMenu(sc);   
                }
                else if(select == 'n'){ 
                    return;     
                }
            } catch (NumberFormatException exception) {}
        } while (true);
    }
    public static void ToVND(Scanner sc){ // 1
        double CHFValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCHF(1);;
        System.out.println("VND is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToVND(CHFValueToUSD)
        ));
    }
    public static void ToCAD(Scanner sc){ // 2
        double CHFValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCHF(1);;
        System.out.println("CAD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(CHFValueToUSD)
        ));
    }
    public static void ToAUD(Scanner sc){ // 3
        double CHFValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCHF(1);;
        System.out.println("AUD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(CHFValueToUSD)
        ));
    }
    public static void ToSGD(Scanner sc){ // 4
        double CHFValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCHF(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToSGD(CHFValueToUSD)
        ));
    }
    public static void ToHKD(Scanner sc){ // 5
        double CHFValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCHF(1);;
        System.out.println("HDK is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(CHFValueToUSD)
        ));
    }
    public static void ToCNY(Scanner sc){ // 6
        double CHFValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCHF(1);;
        System.out.println("CNY is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(CHFValueToUSD)
        ));
    }
    public static void ToEURO(Scanner sc){ // 7
        double CHFValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCHF(1);;
        System.out.println("EURO is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(CHFValueToUSD)
        ));
    }
    public static void ToRUB(Scanner sc){ // 8
        double CHFValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCHF(1);;
        System.out.println("RUB is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(CHFValueToUSD)
        ));
    }
    public static void ToUSD(Scanner sc){ // 9
        double CHFValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCHF(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToUSD(CHFValueToUSD)
        ));
    }
}
