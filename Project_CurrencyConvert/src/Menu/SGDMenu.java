package Menu;
import java.util.Scanner;
import Controller.SGDController;
import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class SGDMenu {
    private static String type = "SGD";
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
                System.out.println("\t\t4.Convert to USD");
                System.out.println("\t\t5.Convert to HKD");
                System.out.println("\t\t6.Convert to CNY");
                System.out.println("\t\t7.Convert to EURO");
                System.out.println("\t\t8.Convert to RUB");
                System.out.println("\t\t9.Convert to CHF");
                System.out.println("\t\t0.Back");
                System.out.print("\t ===> Choose: " );
                choose = Integer.parseInt(sc.nextLine());
                if(choose == 0) {       return; }  
                else if(choose == 1) {  SGDController.SGDConvertToVND(sc); }
                else if(choose == 2) {  SGDController.SGDConvertToCAD(sc); }
                else if(choose == 3) {  SGDController.SGDConvertToAUD(sc); }
                else if(choose == 4) {  SGDController.SGDConvertToUSD(sc); }
                else if(choose == 5) {  SGDController.SGDConvertToHKD(sc); }
                else if(choose == 6) {  SGDController.SGDConvertToCNY(sc); }
                else if(choose == 7) {  SGDController.SGDConvertToEURO(sc); }
                else if(choose == 8) {  SGDController.SGDConvertToRUB(sc); }
                else if(choose == 9) {  SGDController.SGDConvertToCHF(sc); }

                System.out.print("Do you want make new currency convert by " +  type +  "?(y/n):");
                char select = sc.next().charAt(0);
                if(select == 'y') {  
                    SGDController.SGDConvertMenu(sc);   
                }
                else if(select == 'n'){ 
                    return;     
                }
            } catch (NumberFormatException exception) {}
        } while (true);
    }
    public static void ToVND(Scanner sc){
        double SGDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToSGD(1);;
        System.out.println("VND is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToVND(SGDValueToUSD)
        ));
    }
    public static void ToCAD(Scanner sc){
        double SGDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToSGD(1);;
        System.out.println("CAD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCAD(SGDValueToUSD)
        ));
    }
    public static void ToAUD(Scanner sc){
        double SGDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToSGD(1);;
        System.out.println("AUD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToAUD(SGDValueToUSD)
        ));
    }
    public static void ToUSD(Scanner sc){
        double SGDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToSGD(1);;
        System.out.println("USD is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToUSD(SGDValueToUSD)
        ));
    }
    public static void ToHKD(Scanner sc){
        double SGDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToSGD(1);;
        System.out.println("HDK is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToHKD(SGDValueToUSD)
        ));
    }
    public static void ToCNY(Scanner sc){
        double SGDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToSGD(1);;
        System.out.println("CNY is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCNY(SGDValueToUSD)
        ));
    }
    public static void ToEURO(Scanner sc){
        double SGDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToSGD(1);;
        System.out.println("EURO is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToEURO(SGDValueToUSD)
        ));
    }
    public static void ToRUB(Scanner sc){
        double SGDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToSGD(1);;
        System.out.println("RUB is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToRUB(SGDValueToUSD)
        ));
    }
    public static void ToCHF(Scanner sc){
        double SGDValueToUSD = views.enterValue(sc, type) / dollarServiceImplement.convertToSGD(1);;
        System.out.println("CHF is :" + views.simplifyAFraction(
            dollarServiceImplement.convertToCHF(SGDValueToUSD)
        ));
    }
}
