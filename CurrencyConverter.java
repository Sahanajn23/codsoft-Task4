import java.util.Scanner;

class ExchangeRateApi {
    
    public static double getExchangeRate(String baseCurrency, String targetCurrency) {
        
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85;  
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.18;  
        } else {
            
            return 1.0;
        }
    }
}

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the base currency code (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency code (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        
        double exchangeRate = ExchangeRateApi.getExchangeRate(baseCurrency, targetCurrency);

        
        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        
        double convertedAmount = amountToConvert * exchangeRate;

        
        System.out.printf("%.2f %s is equal to %.2f %s\n",
                amountToConvert, baseCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }
}
