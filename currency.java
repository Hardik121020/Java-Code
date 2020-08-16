import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale chinese = new Locale("zh","CN");
        NumberFormat china = NumberFormat.getCurrencyInstance(chinese);

        Locale USA = new Locale("en","US");
        NumberFormat us = NumberFormat.getCurrencyInstance(USA);
        
        Locale indian = new Locale("en","IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indian);

        Locale french = new Locale("fr","FR");
        NumberFormat france = NumberFormat.getCurrencyInstance(french);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
