// program to check if the given number is a prime number.
public class PrimeNumberCheck {
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= num / 2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 29;
        if (isPrime(number)){
            System.out.println(number + " is a prime number.");
        }else{
            System.out.println(number + " is not a prime number.");
        }
    }
}

// main method: The main method sets the number to be checked and calls the isPrime method.
// isPrime method:
// If the number is less than or equal to 1, it returns false since numbers less than or equal to 1 are not prime.
// It checks for divisibility from 2 up to num / 2. If any number in this range divides num without a remainder, num is not a prime number, so it returns false.
// If no such divisor is found, it returns true, indicating that the number is prime.