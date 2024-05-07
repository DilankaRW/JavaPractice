//Logical Operators
//1. AND - &&
//2. OR - ||

public class Logical_Operators {
    public static void main(String[] args) {
        int x = 5;
        int y = 15;

//        AND Operator - &&

         if (x>10 && y>10){
             System.out.println("Positive");
         }else{
             System.out.println("Negative");
         }
         // Output is Negative


//        OR Operators - ||

        if (x>10 || y>10){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
        // Output is Positive
    }
}
