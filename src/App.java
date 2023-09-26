import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Suma de dos numeros
       /*  Scanner scanner = new Scanner(System.in);
         System.out.println("Introduce el primer numero para sumar");
        int numberOne = scanner.nextInt();
        System.out.println("Introduce el segundo numero para sumar");
        int numberTwo = scanner.nextInt();
        System.out.println(numberOne + numberTwo);
        scanner.close(); */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer numero para sumar");
        float numberOne = scanner.nextFloat();
        System.out.println("Introduce el segundo numero para sumar");
        float numberTwo = scanner.nextFloat();
        System.out.println("Suma: "+(numberOne + numberTwo));
        System.out.println("Resta: "+(numberOne-numberTwo));
        System.out.println("Multiplicacion: "+(numberOne*numberTwo));
        System.out.println("Divsion: "+(numberOne/numberTwo));
        scanner.close();
 

    }
}
