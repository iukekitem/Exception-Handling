import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    try { // handle errors that may occur while the program runs
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int x = scan.nextInt();
        ;
        System.out.println("Enter another integer: ");
        int y = scan.nextInt();
        int div = x / y;
        System.out.println("x/y= " + div);
        }  catch(ArithmeticException e){ //checks if is div by 0
        System.out.println(e);
        }  catch(InputMismatchException ime){ //checks the type of input
        System.out.println(ime);
        }  catch (Exception ALL){
        ALL.printStackTrace(); // catches all
        }  finally { //optional
        System.out.println("This is the finally block!");
        }
    }
}
