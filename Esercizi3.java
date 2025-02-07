import java.util.Scanner;
public class Esercizi3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		// ESERCIZIO 01
			System.out.println("Inserisci un numero. ");
			int punteggio = scanner.nextInt();;

        	if (punteggio >= 0 && punteggio <= 100) 
			{
        		System.out.println("Il punteggio è valido.");
        	}       
			else 
			{
    			System.out.println("Il punteggio non è valido.");
			}

		// ESERCIZIO 02
			System.out.println("Inserisci un numero. ");
			int x = scanner.nextInt();
			
			if (x % 2 == 0)
			{
				x = x / 2;
				System.out.println("Il numero finale è: " + x);
			}
			else
			{
				x = x * 3 - 1;
				System.out.println("Il numero finale è: " + x);
			}

		// ESERCIZIO 03
			System.out.println("Rispondi con 'si' o 'no': ");
        	String risposta = scanner.nextLine();

			boolean accettato;
			
			if (risposta.equalsIgnoreCase("si")|| risposta.equalsIgnoreCase("s"))
			{
				accettato = true;
				System.out.println("Risposta accettata: "+ accettato);
			}
			else if (risposta.equalsIgnoreCase("no")|| risposta.equalsIgnoreCase("n"))
			{
				accettato = false;
				System.out.println("Risposta rifiutata: "+ accettato);
			}
			scanner.close();
			
		}
}

