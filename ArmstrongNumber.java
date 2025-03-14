public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;  // The number you want to check
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();
        
       
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        
       
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
