//Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados

import java.util.Scanner;

public class Divisor {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);


        System.out.print("Informe um número: ");
        int num1 = scanner.nextInt();

        int num2;

        do {
            
            System.out.print("Informe outro número: ");
            num2 = scanner.nextInt();

            if(num2 < num1){
                System.out.print("O segundo número precisa ser maior que o primeiro. Informe outro número: ");
                num2 = scanner.nextInt();
            }
            

        } while (num2 % num1 == 0);


        System.out.print("Fim da execução");
    }
}
