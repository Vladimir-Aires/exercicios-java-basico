import java.util.Scanner;

public class DiferencaIdade {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Olá! Informe-nos a idade de duas pessoas e diremos a diferença de idade entre elas.");

        System.out.print("Nome da primeira pessoa: ");
        var nome1 = scanner.next();
        System.out.printf("Idade do(a) %s: ",nome1);
        var idade1 = scanner.nextInt();

        System.out.print("Nome da segunda pessoa: ");
        var nome2 = scanner.next();
        System.out.printf("Idade do(a) %s: ",nome2);
        var idade2 = scanner.nextInt();

        var diferenca = Math.abs(idade1 - idade2);
        

        System.out.printf("A diferença de idade entre %s e %s é: %s", nome1, nome2, diferenca );
    }
}
