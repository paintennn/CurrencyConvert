package Menu;

import java.util.Scanner;

import Controller.CNYController;
import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class CNYMenu {
    private static String type = "CNY";
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
                System.out.println("\t\t6.Convert to USD");
                System.out.println("\t\t7.Convert to EURO");
                System.out.println("\t\t8.Convert to RUB");
                System.out.println("\t\t9.Convert to CHF");
                System.out.println("\t\t0.Back");
                System.out.print("\t ===> Choose: " );
                choose = Integer.parseInt(sc.nextLine());
                if(choose == 0) {       return; }  
                else if(choose == 1) {  CNYController.CNYConvertToVND(sc); }
                else if(choose == 2) {  CNYController.CNYConvertToCAD(sc); }
                else if(choose == 3) {  CNYController.CNYConvertToAUD(sc); }
                else if(choose == 4) {  CNYController.CNYConvertToSGD(sc); }
                else if(choose == 5) {  CNYController.CNYConvertToHKD(sc); }
                else if(choose == 6) {  CNYController.CNYConvertToUSD(sc); }
                else if(choose == 7) {  CNYController.CNYConvertToEURO(sc); }
                else if(choose == 8) {  CNYController.CNYConvertToRUB(sc); }
                else if(choose == 9) {  CNYController.CNYConvertToCHF(sc); }

                System.out.print("Do you want make new currency convert by " +  type +  "?(y/n):");
                char select = sc.next().charAt(0);
                if(select == 'y') {  
                    CNYController.CNYConvertMenu(sc);   
                }
                else if(select == 'n'){ 
                    return;     
                }
            } catch (NumberFormatException exception) {}
        } while (true);
    }
    public static void ToVND(Scanner sc){
        double CNYValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCNY(1);;
        System.out.println("VND is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToVND(CNYValueToUSD)
        ));
    }
    public static void ToCAD(Scanner sc){
        double CNYValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCNY(1);;
        System.out.println("CAD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(CNYValueToUSD)
        ));
    }
    public static void ToAUD(Scanner sc){
        double CNYValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCNY(1);;
        System.out.println("AUD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(CNYValueToUSD)
        ));
    }
    public static void ToSGD(Scanner sc){
        double CNYValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCNY(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToSGD(CNYValueToUSD)
        ));
    }
    public static void ToHKD(Scanner sc){
        double CNYValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCNY(1);;
        System.out.println("HDK is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(CNYValueToUSD)
        ));
    }
    public static void ToUSD(Scanner sc){
        double CNYValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCNY(1);;
        System.out.println("CNY is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToUSD(CNYValueToUSD)
        ));
    }
    public static void ToEURO(Scanner sc){
        double CNYValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCNY(1);;
        System.out.println("EURO is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(CNYValueToUSD)
        ));
    }
    public static void ToRUB(Scanner sc){
        double CNYValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCNY(1);;
        System.out.println("RUB is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(CNYValueToUSD)
        ));
    }
    public static void ToCHF(Scanner sc){
        double CNYValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToCNY(1);;
        System.out.println("CHF is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(CNYValueToUSD)
        ));
    }
}
