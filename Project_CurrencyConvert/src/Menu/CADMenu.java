package Menu;

import java.util.Scanner;

import Controller.CADController;
import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class CADMenu {
    private static String type = "CAD";
    private static DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
    public static void menu(Scanner sc){
        int choose;
        do {
            try {
                views.clearScreen();
                System.out.println("\t!!! Select type money to convert from " + type + " !!!");
                System.out.println("\t\t1.Convert to VND");
                System.out.println("\t\t2.Convert to USD");
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
                if(choose == 0) {       return; }
                else if(choose == 1) {  CADController.CADConvertToVND(sc); }
                else if(choose == 2) {  CADController.CADConvertToUSD(sc); }
                else if(choose == 3) {  CADController.CADConvertToAUD(sc); }
                else if(choose == 4) {  CADController.CADConvertToSGD(sc); }
                else if(choose == 5) {  CADController.CADConvertToHKD(sc); }
                else if(choose == 6) {  CADController.CADConvertToCNY(sc); }
                else if(choose == 7) {  CADController.CADConvertToEURO(sc); }
                else if(choose == 8) {  CADController.CADConvertToRUB(sc); }
                else if(choose == 9) {  CADController.CADConvertToCHF(sc); }

                System.out.print("Do you want make new currency convert by " +  type +  "?(y/n):");
                char select = sc.next().charAt(0);
                if(select == 'y') {  
                    CADController.CADConvertMenu(sc);   
                }
                else if(select == 'n'){ 
                    return;     
                }
            } catch (NumberFormatException exception) {}
        } while (true);
    }
    public static void ToVND(Scanner sc){
        double CADValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToCAD(1);;
        System.out.println("VND is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToVND(CADValueToUSD)
        ));
    }
    public static void ToUSD(Scanner sc){
        double CADValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToCAD(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToUSD(CADValueToUSD)
        ));
    }
    public static void ToAUD(Scanner sc){
        double CADValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToCAD(1);;
        System.out.println("AUD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(CADValueToUSD)
        ));
    }
    public static void ToSGD(Scanner sc){
        double CADValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToCAD(1);;
        System.out.println("SGD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToSGD(CADValueToUSD)
        ));
    }
    public static void ToHKD(Scanner sc){
        double CADValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToCAD(1);;
        System.out.println("HDK is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(CADValueToUSD)
        ));
    }
    public static void ToCNY(Scanner sc){
        double CADValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToCAD(1);;
        System.out.println("CNY is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(CADValueToUSD)
        ));
    }
    public static void ToEURO(Scanner sc){
        double CADValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToCAD(1);;
        System.out.println("EURO is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(CADValueToUSD)
        ));
    }
    public static void ToRUB(Scanner sc){
        double CADValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToCAD(1);;
        System.out.println("RUB is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(CADValueToUSD)
        ));
    }
    public static void ToCHF(Scanner sc){
        double CADValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToCAD(1);;
        System.out.println("CHF is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(CADValueToUSD)
        ));
    }
}
