import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
   
     var scanner = new Scanner(System.in);
     
     
   //   System.out.print("Informe sua idade: ");
   //   var idade = scanner.nextInt();

   //   System.out.print("Você é emancipado(a)? (s/n) ");
   //   var isEmancipated = scanner.next().equalsIgnoreCase("s");

   //   if(idade >= 18){
   //    System.out.print("Você pode dirigir");
   //    System.exit(0);
   //   } else if( idade >= 16 && isEmancipated){
   //    System.out.printf("Mesmo tendo %s anos, você é emancipado(a) e pode dirigir.", idade);
   //   } else{
   //    System.out.print("Você não pode dirigir");
   //   }

   //  scanner.close();

   // System.out.print("Informe um número de 1 até 7: ");
   // var number = scanner.nextInt();

   // var message = switch(number){
   //    case 1, 7 -> {
   //        var day = number == 1 ? "Domingo" : "Sábado";
   //        yield String.format("Hoje é %s, fim de semana!!!", day);
   //    } 
   //    case 2 -> "Segunda";
   //    case 3 -> "Terça";
   //    case 4 -> "Quarta";
   //    case 5 -> "Quinta";
   //    case 6 -> "Sexta";
   //    default -> "Número inválido";
      
   // };

   // System.out.println(message);

      // for(var arg: args){
      //    System.out.println(arg);
      // }
      var i = 0;
     while(!args[i].equals("false")){
      System.out.println(args[i]);
      i += 1;
     }
   }

}
