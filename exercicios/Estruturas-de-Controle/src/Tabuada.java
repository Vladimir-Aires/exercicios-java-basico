import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args)  {
        var scanner = new Scanner(System.in);

        System.out.print("Informe um número e montaremos a tabuada dele: ");
        var num = scanner.nextInt();

        for(var i = 1; i <= 10; i++){
            var multiplicacao = i * num;
            System.out.println(i+ " x "+ num+" = "+multiplicacao);
        }
    }
}
