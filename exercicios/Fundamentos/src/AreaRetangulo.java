import java.util.Scanner;

public class AreaRetangulo {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Olá! Informe-nos valores para a base e para a altura de um retângulo e diremos o valor de sua área.");
        System.out.print("Valor da base (cm): ");
        var baseRetangulo = scanner.nextFloat();
        System.out.print("Valor da altura (cm): ");
        var alturaRetangulo = scanner.nextFloat();

        var areaRetangulo = baseRetangulo * alturaRetangulo;

        System.out.printf("A área do retângulo é: %s cm²", areaRetangulo);
    }
}
