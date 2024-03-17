package Menu;
import java.util.Scanner;
import Controller.AUDController;
import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class AUDMenu {
    private static String type = "AUD";
    private static DollarServiceImplement dollarServiceImplement = new DollarServiceImplement();
    public static void menu(Scanner sc){
        int choose;
        do {
            try {
                views.clearScreen();
                System.out.println("\t!!! Select type money to convert from " + type + " !!!");
                System.out.println("\t\t1.Convert to VND");
                System.out.println("\t\t2.Convert to CAD");
                System.out.println("\t\t3.Convert to USD");
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
                else if(choose == 1) {  AUDController.AUDConvertToVND(sc); }
                else if(choose == 2) {  AUDController.AUDConvertToCAD(sc); }
                else if(choose == 3) {  AUDController.AUDConvertToUSD(sc); }
                else if(choose == 4) {  AUDController.AUDConvertToSGD(sc); }
                else if(choose == 5) {  AUDController.AUDConvertToHKD(sc); }
                else if(choose == 6) {  AUDController.AUDConvertToCNY(sc); }
                else if(choose == 7) {  AUDController.AUDConvertToEURO(sc); }
                else if(choose == 8) {  AUDController.AUDConvertToRUB(sc); }
                else if(choose == 9) {  AUDController.AUDConvertToCHF(sc); }

                System.out.print("Do you want make new currency convert by " +  type +  "?(y/n):");
                char select = sc.next().charAt(0);
                if(select == 'y') {  
                    AUDController.AUDConvertMenu(sc);   
                }
                else if(select == 'n'){ 
                    return;     
                }
            } catch (NumberFormatException exception) {}
        } while (true);
    }
    public static void ToVND(Scanner sc){
        double AUDValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToAUD(1);;
        System.out.println("VND is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToVND(AUDValueToUSD)
        ));
    }
    public static void ToCAD(Scanner sc){
        double AUDValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToAUD(1);;
        System.out.println("AUD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(AUDValueToUSD)
        ));
    }
    public static void ToUSD(Scanner sc){
        double AUDValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToAUD(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToUSD(AUDValueToUSD)
        ));
    }
    public static void ToSGD(Scanner sc){
        double AUDValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToAUD(1);;
        System.out.println("SGD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToSGD(AUDValueToUSD)
        ));
    }
    public static void ToHKD(Scanner sc){
        double AUDValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToAUD(1);;
        System.out.println("HDK is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(AUDValueToUSD)
        ));
    }
    public static void ToCNY(Scanner sc){
        double AUDValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToAUD(1);;
        System.out.println("CNY is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(AUDValueToUSD)
        ));
    }
    public static void ToEURO(Scanner sc){
        double AUDValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToAUD(1);;
        System.out.println("EURO is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(AUDValueToUSD)
        ));
    }
    public static void ToRUB(Scanner sc){
        double AUDValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToAUD(1);;
        System.out.println("RUB is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(AUDValueToUSD)
        ));
    }
    public static void ToCHF(Scanner sc){
        double AUDValueToUSD = views.enterValue(sc, type) / new DollarServiceImplement().convertToAUD(1);;
        System.out.println("CHF is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(AUDValueToUSD)
        ));
    }
}
