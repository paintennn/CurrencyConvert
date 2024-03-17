package Controller;
import java.util.Scanner;
import Menu.CADMenu;

public class CADController {
    public static void CADConvertMenu(Scanner sc){      CADMenu.menu(sc);    } //
    public static void CADConvertToVND(Scanner sc){     CADMenu.ToVND(sc);   } //
    public static void CADConvertToUSD(Scanner sc){     CADMenu.ToUSD(sc);   } //
    public static void CADConvertToAUD(Scanner sc){     CADMenu.ToAUD(sc);   } //
    public static void CADConvertToSGD(Scanner sc){     CADMenu.ToSGD(sc);   } //
    public static void CADConvertToHKD(Scanner sc){     CADMenu.ToHKD(sc);   } //
    public static void CADConvertToCNY(Scanner sc){     CADMenu.ToCNY(sc);   } //
    public static void CADConvertToEURO(Scanner sc){    CADMenu.ToEURO(sc);  } //
    public static void CADConvertToRUB(Scanner sc){     CADMenu.ToRUB(sc);   } //
    public static void CADConvertToCHF(Scanner sc){     CADMenu.ToCHF(sc);   } //
}
