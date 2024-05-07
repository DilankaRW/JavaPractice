import java.util.Scanner;
public class Getting_User_Input {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String name = x.nextLine();
        System.out.println("Hello " + name);

        Scanner A = new Scanner(System.in);
        int age = A.nextInt();
        System.out.println("Age is " + age);

        Scanner B = new Scanner(System.in);
        double Price = B.nextDouble();
        System.out.println("Price is " + Price);
    }

}
