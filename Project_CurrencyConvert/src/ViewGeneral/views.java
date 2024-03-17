package ViewGeneral;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class views {
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");  // clear console
    }
    public static String simplifyAFraction(double d) {
        BigDecimal value = new BigDecimal((double) Math.floor(d * 10) / 10);
        String valueFormat = String.valueOf(formatValue(value));
        return valueFormat;
    }
    public static double enterValue(Scanner sc, String type){
        System.out.print("Enter value of " + type + " to convert: ");
        double value = sc.nextDouble();
        return value;
    }
    public static String formatValue(BigDecimal value){
        DecimalFormat format = new DecimalFormat("#,##0.0");
        return format.format(value);
    }
}
