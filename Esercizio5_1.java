public class Esercizio5_1
{

    // ESERCIZIO 01
    public static int confronta(int a, int b) 
    {
        if (a > b) {
            return a - b;  
        } else {
            return b - a;  
        }
    }

    public static void main(String[] args) 
    {
    
        int risultato1 = confronta(10, 5);
        System.out.println("Risultato 1 (10, 5): " + risultato1);

        
        int risultato2 = confronta(3, 8);
        System.out.println("Risultato 2 (3, 8): " + risultato2);  

        
        int risultato3 = confronta(7, 7);
        System.out.println("Risultato 3 (7, 7): " + risultato3); 
    }

}
