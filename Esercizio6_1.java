import java.util.Scanner;

public class Esercizio6_1 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di famiglie (k): ");
        int k = scanner.nextInt();

        double[] redditi = new double[k];

        System.out.println("Inserisci i redditi delle famiglie:");
        for (int i = 0; i < k; i++) {
            System.out.print("Reddito della famiglia " + (i + 1) + ": ");
            redditi[i] = scanner.nextDouble();
        }

        double redditoMassimo = redditi[0];
        for (int i = 1; i < k; i++) 
        {
            if (redditi[i] > redditoMassimo) 
            {
                redditoMassimo = redditi[i];
            }
        }

        double soglia = redditoMassimo - (redditoMassimo * 0.10);

        int famiglieSottoSoglia = 0;
        System.out.println("Famiglie con reddito inferiore al 10% del reddito massimo (" + soglia + "):");
        for (int i = 0; i < k; i++) 
        {
            if (redditi[i] < soglia) 
            {
                famiglieSottoSoglia++;
                System.out.println("Famiglia " + (i + 1) + ": " + redditi[i]);
            }
        }

        System.out.println("Numero di famiglie con reddito inferiore alla soglia: " + famiglieSottoSoglia);

        scanner.close();
    }
}
