import java.util.Scanner;

public class Operadores {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Quanto é 5 + 5 ?");

        var result = scanner.nextInt();
        var isRight = result == 10;
        System.out.printf("O resultado é 10. Você acertou? (%s)", isRight);
    }
}
