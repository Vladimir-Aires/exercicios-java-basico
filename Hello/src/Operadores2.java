import java.util.Scanner;

public class Operadores2 {


    public static void main(String[] args) {
      
        var num1 = 6;
        var binario1 = Integer.toBinaryString(num1);

        var num2 = 7;
        var binario2 = Integer.toBinaryString(num2);
      
        var result = num1 & num2;
        var binarioResult = Integer.toBinaryString(result);
      
        var num3 = 7;
        var binario3 = Integer.toBinaryString(num3);
        var binaryComplement = Integer.toBinaryString(~num3);

        System.out.printf("Binário de %s: %s \n", num1, binario1);
        System.out.printf("Binário de %s: %s \n", num2, binario2);
        System.out.printf("Resultado: %s \n Resultado binário: %s \n",result, binarioResult);
        System.out.printf("Complemento binário de %s (%s): %s", num3, binario3, binaryComplement);
    }
}
