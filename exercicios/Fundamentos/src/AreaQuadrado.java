import java.util.Scanner;

public class AreaQuadrado {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do lado do quadrado (cm): ");
        var valorLadoQuadrado = scanner.nextFloat();

        var areaQuadrado = valorLadoQuadrado * valorLadoQuadrado;

        System.out.printf("A área do quadrado é: %s cm²", areaQuadrado);
    }
}
