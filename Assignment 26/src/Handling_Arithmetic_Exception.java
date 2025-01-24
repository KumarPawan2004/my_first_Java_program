public class Handling_Arithmetic_Exception {
    public static void main(String[] args) {
        try{
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }catch (ArithmeticException exception) {
            System.out.println("Error: Division by zero is not allowed.");
        }

    }
}
