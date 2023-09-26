import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Introduce el primer numero para sumar");
        int numberOne = scanner.nextInt();
        System.out.println("Introduce el segundo numero para sumar");
        int numberTwo = scanner.nextInt();
        System.out.println(numberOne + numberTwo);
        scanner.close();
    }
}
