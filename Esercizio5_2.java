import java.util.Scanner;

public class Esercizio5_2 
{

   
    public static void saluta(String nome, int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Ciao " + nome);
        }
    }

    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Quante volte vuoi essere salutato? ");
        int n = scanner.nextInt();
        saluta(nome, n);
        scanner.close();
    }
}

