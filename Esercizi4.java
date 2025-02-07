import java.util.Scanner;
public class Esercizi4
{
    public static void main(String[] args) 
    {
    // ESERCIZIO 01
        Scanner scanner = new Scanner(System.in);
        String parola;

        do 
        {
            System.out.println("Inserisci una parola (digita 'fine' per terminare): ");
            parola = scanner.nextLine();

            if (!parola.equalsIgnoreCase("fine"))
            {
                if (parola.charAt(0) == parola.charAt(parola.length() - 1)) 
                {
                    System.out.println("La parola " + parola + " ha la lettera iniziale uguale a quella finale. ");
                }
                else 
                {
                    System.out.println("La parola " + parola + " ha la lettera iniziale diversa da quella finale. ");
                }
                
            }
        
        } 
        while (!parola.equalsIgnoreCase("fine"));

        System.out.println("Fine.");

    // ESERCIZIO 02
        double saldo = 1000.00;
        double interessi = 5.0;
        int mesi = 12;
        double interessiMese = interessi / 12 / 100; //qua ho dovuto dividere ancora per 100 perche sennò il valore usciva troppo grande
        
        for (int mese = 1; mese <= mesi; mese++) 
        {   
            double INTERESSI = saldo * interessiMese;
            saldo += INTERESSI;
            System.err.println("Questo è il mese numero: "+ mese + " e questo è il tuo saldo dopo gli interessi: "+ saldo );
        
            System.out.println("Inserisci l'importo della transazione: ");
            double transazione = scanner.nextDouble();
            saldo += transazione;
            System.out.println("Questo è il tuo saldo attuale: "+ saldo);
        }
        System.out.println("A fine anno questo è il tuo saldo: "+saldo);

    //ESERCIZIO 03
        int codiceSegreto = 53840;
        int tentativiMassimi = 5;

        for (int tentativo = 1; tentativo <= tentativiMassimi; tentativo++) 
        {
            System.out.println("Tentativo numero: "+ tentativo + " SU "+ tentativiMassimi + " Inserisci un codice a 5 cifre. ");
            int tentativoUtente = scanner.nextInt();

            if (tentativoUtente < 10000 || tentativoUtente > 99999)
            {
                System.out.println("Deve essere un codice formato da 5 numeri. ");
                tentativo --;
            }
            
            int numeriGiusti = 0;
            int sommaNumeriGiusti = 0;

            for (int i = 0; i < 5; i++) 
            {
    
                int cifraCodice = codiceSegreto % 10; // ho messo questo % in modo da prendere soltanto l'ultima cifra del codice segreto
                int cifraTentativo = tentativoUtente % 10; // mentre invece qua in modo da prendere l'ultima cifra del tentativo
           
                if (cifraCodice == cifraTentativo) 
                {
                    numeriGiusti++;
                    sommaNumeriGiusti += numeriGiusti;
                }
                
                codiceSegreto /= 10; //ora questo serve per prendere la penultima cifra del codice segreto, facendo questo procedimento il programma riesce a controllare tutte e 5 le cifre
                tentativoUtente /= 10; //questo invece serve per prendere la penultima cifra del codice dell'utente, serve per mettere a confronto i due codici. :=)
            
                System.out.println("Cifre corrette al posto giusto: " + numeriGiusti);
                System.out.println("Somma delle cifre corrette: " + sommaNumeriGiusti);

                if (numeriGiusti == 5) 
                {
                    System.out.println("Congratulazioni, Hai indovinato il codice. ");
                    break;
                }

                if (tentativo == tentativiMassimi) 
                {
                    System.out.println("Hai esaurito i tentativi! Il codice segreto era: " + codiceSegreto);
                }
                
            }


        }
        scanner.close();
    
    }
}
