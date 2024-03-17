package Menu;

import java.util.Scanner;

import Controller.RUBController;
import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class RUBMenu {
    private static String type = "RUB";
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
                System.out.println("\t\t8.Convert to USD");
                System.out.println("\t\t9.Convert to CHF");
                System.out.println("\t\t0.Back");
                System.out.print("\t ===> Choose: " );
                choose = Integer.parseInt(sc.nextLine());
                if(choose == 0) {       return; }  
                else if(choose == 1) {  RUBController.RUBConvertToVND(sc); }
                else if(choose == 2) {  RUBController.RUBConvertToCAD(sc); }
                else if(choose == 3) {  RUBController.RUBConvertToAUD(sc); }
                else if(choose == 4) {  RUBController.RUBConvertToSGD(sc); }
                else if(choose == 5) {  RUBController.RUBConvertToHKD(sc); }
                else if(choose == 6) {  RUBController.RUBConvertToCNY(sc); }
                else if(choose == 7) {  RUBController.RUBConvertToEURO(sc); }
                else if(choose == 8) {  RUBController.RUBConvertToUSD(sc); }
                else if(choose == 9) {  RUBController.RUBConvertToCHF(sc); }

                System.out.print("Do you want make new currency convert by " +  type +  "?(y/n):");
                char select = sc.next().charAt(0);
                if(select == 'y') {  
                    RUBController.RUBConvertMenu(sc);   
                }
                else if(select == 'n'){ 
                    return;     
                }
            } catch (NumberFormatException exception) {}
        } while (true);
    }
    public static void ToVND(Scanner sc){ // 1
        double RUBValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToRUB(1);;
        System.out.println("VND is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToVND(RUBValueToUSD)
        ));
    }
    public static void ToCAD(Scanner sc){ // 2
        double RUBValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToRUB(1);;
        System.out.println("CAD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(RUBValueToUSD)
        ));
    }
    public static void ToAUD(Scanner sc){ // 3
        double RUBValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToRUB(1);;
        System.out.println("AUD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(RUBValueToUSD)
        ));
    }
    public static void ToSGD(Scanner sc){ // 4
        double RUBValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToRUB(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToSGD(RUBValueToUSD)
        ));
    }
    public static void ToHKD(Scanner sc){ // 5
        double RUBValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToRUB(1);;
        System.out.println("HDK is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(RUBValueToUSD)
        ));
    }
    public static void ToCNY(Scanner sc){ // 6
        double RUBValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToRUB(1);;
        System.out.println("CNY is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(RUBValueToUSD)
        ));
    }
    public static void ToEURO(Scanner sc){ // 7
        double RUBValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToRUB(1);;
        System.out.println("EURO is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(RUBValueToUSD)
        ));
    }
    public static void ToUSD(Scanner sc){ // 8
        double RUBValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToRUB(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToUSD(RUBValueToUSD)
        ));
    }
    public static void ToCHF(Scanner sc){ // 9
        double RUBValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToRUB(1);;
        System.out.println("CHF is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(RUBValueToUSD)
        ));
    }
}
