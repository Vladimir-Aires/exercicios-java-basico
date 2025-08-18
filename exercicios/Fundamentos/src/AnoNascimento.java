import java.time.OffsetDateTime;
import java.util.Scanner;

public class AnoNascimento {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        var anoBase = OffsetDateTime.now().getYear();

        System.out.print("Seja bem vindo(a)! \nInforme-nos o seu nome: ");
        var nome = scanner.next();

        System.out.print("Agora, nos informe o seu ano de nascimento: ");
        var anoNasc = scanner.nextInt();

        var idade = anoBase - anoNasc;

        System.out.printf("Muito prazer %s! Você tem ou vai fazer %s anos.", nome, idade);
    }
}
