import java.util.Scanner;

public class ParInpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        float numero = scanner.nextFloat();
        
        if (numero % 2 == 0) {
            System.out.println("Tu numero es par");
        }else{
            System.out.println("Tu numero es impar");
        }
        scanner.close();
    }
}
