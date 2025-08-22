
import java.util.Scanner;

public class IMC {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var intro = " ======== Calculadora de IMC ==========";
        var imc = 0.0;
        var messageResult = "";

        System.out.println(intro);
        System.out.print("Informe sua altura: ");
        var heith = scanner.nextFloat();
        System.out.print("Informe seu peso: ");
        var weight = scanner.nextFloat();

        imc = weight / (heith * heith);

        if(imc <= 18.5){
            messageResult = "Abaixo do peso";
        }else if((imc > 18.6) && (imc < 24.9)){
            messageResult = "Peso ideal";
        } else if((imc > 25) && (imc < 29.9)){
            messageResult = "Levemente acima do peso";
        }else if((imc > 30) && (imc < 34.9)){   
            messageResult = "Obesidade Grau I";
        }else if((imc > 35) && (imc < 39.9)){
            messageResult = "Obesidade Grau II (Severa)";
        }else{
            messageResult = "Obesidade Grau III (Mórbida)";
        }

        System.out.printf("Seu IMC: %.1f | %s", imc, messageResult);
    }
}
