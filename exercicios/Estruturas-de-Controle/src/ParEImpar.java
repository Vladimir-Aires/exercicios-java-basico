//Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;



//Melhorias 
/*
 * Fazer uma validação do segundo número ser maior que o primeiro
 * Guardar todos os números pares/ímpares em um array e exibir esse array no final
* Retornar para a seleção, caso dê uma opção inválida.
 */


import java.util.Scanner;

public class ParEImpar {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        var num1 = scanner.nextInt();

        System.out.print("Informe outro número: ");
        var num2 = scanner.nextInt();

        System.out.print("Escolha entre: \n [1] - Números Ímpares \n [2] - Números Pares: ");
        var opt = scanner.nextInt();

        switch (opt) {
            case 1:
                for ( var i = num2; i >= num1; i--){
                    var isOdd = i % 2 != 0;
                    if(isOdd){
                        System.out.println("Número ímpar: " + i);
                    } 
                    
                }
                break;
            case 2:
                for ( var i = num2; i >= num1; i--){
                    var isEven = i % 2 == 0;
                    if(isEven){
                        System.out.println("Número par: " + i);
                    }
                }
                break;
            default:
                System.out.print("Opção Inválida.");

                break;
        }
    }
}
