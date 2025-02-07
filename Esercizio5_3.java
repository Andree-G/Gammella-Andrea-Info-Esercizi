public class Esercizio5_3
{

    public static boolean divisibile(int a, int b) 
    {
    
        if (b != 0 && a % b == 0) 
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) 
    {
        
        System.out.println("10 è divisibile per 2? " + divisibile(10, 2));  

        System.out.println("10 è divisibile per 3? " + divisibile(10, 3));  

        System.out.println("15 è divisibile per 5? " + divisibile(15, 5));  

        System.out.println("7 è divisibile per 0? " + divisibile(7, 0));  
    }
}
