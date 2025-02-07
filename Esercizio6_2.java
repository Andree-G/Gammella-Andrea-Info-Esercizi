import java.util.Scanner;

public class Esercizio6_2 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        double[] temperature = new double[10];
        
        double somma = 0;
        
        System.out.println("Inserisci 10 temperature:");
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Temperatura del giorno " + (i + 1) + ": ");
            temperature[i] = scanner.nextDouble();
            somma += temperature[i];  
        }
        
        double media = somma / 10;
        System.out.println("Temperatura media: " + media);
        
        int giorniSottoMedia = 0;
        for (int i = 0; i < 10; i++) 
        {
            if (temperature[i] < media) 
            {
                giorniSottoMedia++;
            }
        }
        
        System.out.println("Numero di giorni in cui la temperatura è al di sotto della media: " + giorniSottoMedia);
        
        scanner.close();
    }
}
