package Menu;
import java.util.Scanner;
import Controller.VNDController;
import ServiceImplement.DollarServiceImplement;
import ViewGeneral.views;

public class VNDMenu {
    private static String type = new String("VND");

    public static void menu(Scanner sc){
        int choose;
        do {
            try {
                views.clearScreen();
                System.out.println("\t!!! Select type money to convert from " + type + " !!!");
                System.out.println("\t\t1.Convert to USA");
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
                if(choose == 0) {       return; }
                else if(choose == 1) {  VNDController.VNDConvertToUSD(sc); }
                else if(choose == 2) {  VNDController.VNDConvertToCAD(sc); }
                else if(choose == 3) {  VNDController.VNDConvertToAUD(sc); }
                else if(choose == 4) {  VNDController.VNDConvertToSGD(sc); }
                else if(choose == 5) {  VNDController.VNDConvertToHKD(sc); }
                else if(choose == 6) {  VNDController.VNDConvertToCNY(sc); }
                else if(choose == 7) {  VNDController.VNDConvertToEURO(sc); }
                else if(choose == 8) {  VNDController.VNDConvertToRUB(sc); }
                else if(choose == 9) {  VNDController.VNDConvertToCHF(sc); }
                System.out.print("Do you want make new currency convert by " +  type +  "?(y/n):");
                char select = sc.next().charAt(0);
                if(select == 'y') {  VNDController.VNDConvertMenu(sc);   }
                else if(select == 'n'){ return;     }
            } catch (Exception exception) {}
        } while (true);
    }
    public static void ToUSD(Scanner sc){
        double value = views.enterValue(sc, type);
        System.out.println("USD is :" + views.simplifyAFraction(value / new DollarServiceImplement().convertToVND(1)));
    }
    public static void ToCAD(Scanner sc){
        double value = views.enterValue(sc, type);
        double valueVNDToUSD = value / new DollarServiceImplement().convertToVND(1);
        System.out.println("CAD is :" + views.simplifyAFraction(new DollarServiceImplement().convertToCAD(valueVNDToUSD)));
    }
    public static void ToAUD(Scanner sc){
        double value = views.enterValue(sc, type);
        double valueVNDToUSD = value / new DollarServiceImplement().convertToVND(1);
        System.out.println("AUD is :" + views.simplifyAFraction(new DollarServiceImplement().convertToAUD(valueVNDToUSD)));
    }
    public static void ToSGD(Scanner sc){
        double value = views.enterValue(sc, type);
        double valueVNDToUSD = value / new DollarServiceImplement().convertToVND(1);
        System.out.println("SGD is :" + views.simplifyAFraction(new DollarServiceImplement().convertToSGD(valueVNDToUSD)));
    }
    public static void ToHKD(Scanner sc){
        double value = views.enterValue(sc, type);
        double valueVNDToUSD = value / new DollarServiceImplement().convertToVND(1);
        System.out.println("HKD is :" + views.simplifyAFraction(new DollarServiceImplement().convertToHKD(valueVNDToUSD)));
    }
    public static void ToCNY(Scanner sc){
        double value = views.enterValue(sc, type);
        double valueVNDToUSD = value / new DollarServiceImplement().convertToVND(1);
        System.out.println("CNY is :" + views.simplifyAFraction(new DollarServiceImplement().convertToCNY(valueVNDToUSD)));
    }
    public static void ToEURO(Scanner sc){
        double value = views.enterValue(sc, type);
        double valueVNDToUSD = value / new DollarServiceImplement().convertToVND(1);
        System.out.println("EURO is :" + views.simplifyAFraction(new DollarServiceImplement().convertToEURO(valueVNDToUSD)));
    }
    public static void ToRUB(Scanner sc){
        double value = views.enterValue(sc, type);
        double valueVNDToUSD = value / new DollarServiceImplement().convertToVND(1);
        System.out.println("RUB is :" + views.simplifyAFraction(new DollarServiceImplement().convertToRUB(valueVNDToUSD)));
    }
    public static void ToCHF(Scanner sc){
        double value = views.enterValue(sc, type);
        double valueVNDToUSD = value / new DollarServiceImplement().convertToVND(1);
        System.out.println("CHF is :" + views.simplifyAFraction(new DollarServiceImplement().convertToCHF(valueVNDToUSD)));
    }
}
