package Util;
import java.util.Scanner;
import Controller.AUDController;
import Controller.CADController;
import Controller.CHFController;
import Controller.CNYController;
import Controller.DollarController;
import Controller.EUROController;
import Controller.HKDController;
import Controller.RUBController;
import Controller.SGDController;
import Controller.VNDController;
import ViewGeneral.views;

public class MenuViews {
    
    public static void menu(Scanner sc){
        int choose;
        do {
            try {
                views.clearScreen();
                System.out.println("\t=== Select type money to convert ===");
                System.out.println("\t\t1.Convert from USD");
                System.out.println("\t\t2.Convert from VND");
                System.out.println("\t\t3.Convert from CAD");
                System.out.println("\t\t4.Convert from AUD");
                System.out.println("\t\t5.Convert from SGD");
                System.out.println("\t\t6.Convert from HKD");
                System.out.println("\t\t7.Convert from CNY");
                System.out.println("\t\t8.Convert from EURO");
                System.out.println("\t\t9.Convert from RUB");
                System.out.println("\t\t10.Convert from CHF");
                System.out.println("\t\t0.Exit");
                System.out.print("\t ===> Choose: " );
                choose = Integer.parseInt(sc.nextLine());
                if(choose == 0) return;
                else if(choose == 1){    DollarController.DollarConvertMenu(sc);    }
                else if(choose == 2){    VNDController.VNDConvertMenu(sc);          }
                else if(choose == 3){    CADController.CADConvertMenu(sc);          }
                else if(choose == 4){    AUDController.AUDConvertMenu(sc);          }
                else if(choose == 5){    SGDController.SGDConvertMenu(sc);          }
                else if(choose == 6){    HKDController.HKDConvertMenu(sc);          }
                else if(choose == 7){    CNYController.CNYConvertMenu(sc);          }
                else if(choose == 8){    EUROController.EUROConvertMenu(sc);        }
                else if(choose == 9){    RUBController.RUBConvertMenu(sc);          }
                else if(choose == 10){   CHFController.CHFConvertMenu(sc);          }
            } catch (NumberFormatException exception) {}
        } while (true);
    }
    
}
