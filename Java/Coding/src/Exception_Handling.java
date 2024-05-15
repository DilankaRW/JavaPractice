import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        try{
            System.out.print("Enter first number : ");
            a = sc.nextInt();
            System.out.print("Enter second number : ");
            b = sc.nextInt();
            c = a/b;
            System.out.println("Answer is " + c);
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide by Zero");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter integer value");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Bye");
        }
    }
}
