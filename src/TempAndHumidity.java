import java.util.Scanner;

public class TempAndHumidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter temperature (or 'X' to exit): ");
            String tempInput = scanner.next();

            if (tempInput.equalsIgnoreCase("X")) {
                System.out.println("Exiting program.");
                break;
            }

                System.out.print("Enter humidity (or 'X' to exit): ");
                String humInput = scanner.next();

           if (humInput.equalsIgnoreCase("X")) {
               System.out.println("Exiting program.");
               break;
           }
           try {
               double temp = Double.parseDouble(tempInput);
               double hum = Double.parseDouble(humInput);

               if (temp > 85) {
                   throw new TooHotException("Temperature is " + temp + " F. No Golf allowed: Too hot!");
               }

               if (hum > 90) {
                   throw new TooHumidException("Humidity is " + hum + " . No Golf allowed: Too humid!");
               }

               System.out.println("Weather conditions perfect for Golf today.");
           } catch (TooHotException e){
               System.out.println("Exception Caught: " + e.getMessage());
           } catch (TooHumidException e){
               System.out.println("Exception Caught: " + e.getMessage());
           } catch (NumberFormatException e) {
               System.out.println("Invalid numeric input. Please enter valid numbers or 'X'' ");
           }

            System.out.println();
        }
        scanner.close();
    }
}