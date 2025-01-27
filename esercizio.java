public class esercizio 
{

    public static boolean strettamenteCrescente(double[] in) 
    {
        if (in == null || in.length < 2) 
        {
            return false; 
        }

     
        for (int i = 1; i < in.length; i++) 
        {
            if (in[i] <= in[i - 1]) 
            {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
      
        double[] array1 = {1.0, 2.5, 3.6, 4.8};  
        double[] array2 = {1.0, 3.0, 2.0, 4.5};  
        double[] array3 = {5.0, 5.0, 5.0};       
        
        System.out.println(strettamenteCrescente(array1)); 
        System.out.println(strettamenteCrescente(array2)); 
        System.out.println(strettamenteCrescente(array3)); 
    }
}
