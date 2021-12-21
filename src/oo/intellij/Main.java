package oo.intellij;
import java.util.Scanner;

public class Main {

      public static void main (String[] args) {
        int i = 0;
        int cont = 1;
        int acum = 0;
        int[] numsorte = new int[3];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Random Number ! \n-> Please, declare your favorite numbers between the range of 0 to 30<-");

        for(i = 0; i < 3; ++i) {
            System.out.print("Declare the " + cont + "° number: ");
            int vlr;
            for(vlr = entrada.nextInt(); vlr < 0 || vlr > 30; vlr = entrada.nextInt()) {
                System.out.println("Nor allowed value. \n Hint: The number must be the range of 0 to 30. \n Please, type again ... ");
                System.out.print("Declare the  " + cont + "º number: ");
            }
            ++cont;
            numsorte[i] = vlr;
        }

        for(i = 0; i < 3; ++i) {
            if (numsorte[i] % 4 == 0) {
                acum += numsorte[i];
            }
        }

        int quoc = acum / 3;
        if (quoc > 25) {
            System.out.println("Congratulations, you gain the award!");
        }

        if (quoc >= 20 && quoc <= 25) {
            System.out.println("Congratulations, you gain the gift!");
        } else {
            System.out.println("What a pity :( You didn't gain any award.\n Try again.");
        }

    }
}
