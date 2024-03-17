package Menu;
import java.util.Scanner;
import Controller.HKDController;
import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class HKDMenu {
    private static String type = "HKD";
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
                System.out.println("\t\t5.Convert to USD");
                System.out.println("\t\t6.Convert to CNY");
                System.out.println("\t\t7.Convert to EURO");
                System.out.println("\t\t8.Convert to RUB");
                System.out.println("\t\t9.Convert to CHF");
                System.out.println("\t\t0.Back");
                System.out.print("\t ===> Choose: " );
                choose = Integer.parseInt(sc.nextLine());
                if(choose == 0) {       return; }  
                else if(choose == 1) {  HKDController.HKDConvertToVND(sc); }
                else if(choose == 2) {  HKDController.HKDConvertToCAD(sc); }
                else if(choose == 3) {  HKDController.HKDConvertToAUD(sc); }
                else if(choose == 4) {  HKDController.HKDConvertToSGD(sc); }
                else if(choose == 5) {  HKDController.HKDConvertToUSD(sc); }
                else if(choose == 6) {  HKDController.HKDConvertToCNY(sc); }
                else if(choose == 7) {  HKDController.HKDConvertToEURO(sc); }
                else if(choose == 8) {  HKDController.HKDConvertToRUB(sc); }
                else if(choose == 9) {  HKDController.HKDConvertToCHF(sc); }

                System.out.print("Do you want make new currency convert by " +  type +  "?(y/n):");
                char select = sc.next().charAt(0);
                if(select == 'y') {  
                    HKDController.HKDConvertMenu(sc);   
                }
                else if(select == 'n'){ 
                    return;     
                }
            } catch (NumberFormatException exception) {}
        } while (true);
    }
    public static void ToVND(Scanner sc){
        double HKDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToHKD(1);;
        System.out.println("VND is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToVND(HKDValueToUSD)
        ));
    }
    public static void ToCAD(Scanner sc){
        double HKDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToHKD(1);;
        System.out.println("CAD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(HKDValueToUSD)
        ));
    }
    public static void ToAUD(Scanner sc){
        double HKDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToHKD(1);;
        System.out.println("AUD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(HKDValueToUSD)
        ));
    }
    public static void ToSGD(Scanner sc){
        double HKDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToHKD(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToSGD(HKDValueToUSD)
        ));
    }
    public static void ToUSD(Scanner sc){
        double HKDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToHKD(1);;
        System.out.println("HDK is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToUSD(HKDValueToUSD)
        ));
    }
    public static void ToCNY(Scanner sc){
        double HKDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToHKD(1);;
        System.out.println("CNY is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(HKDValueToUSD)
        ));
    }
    public static void ToEURO(Scanner sc){
        double HKDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToHKD(1);;
        System.out.println("EURO is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(HKDValueToUSD)
        ));
    }
    public static void ToRUB(Scanner sc){
        double HKDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToHKD(1);;
        System.out.println("RUB is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(HKDValueToUSD)
        ));
    }
    public static void ToCHF(Scanner sc){
        double HKDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToHKD(1);;
        System.out.println("CHF is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(HKDValueToUSD)
        ));
    }
}
