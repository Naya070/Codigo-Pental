
/**
 * Write a description of class CODIGO_PENTAL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CODIGO_PENTAL extends Código
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CODIGO_PENTAL
     */
    public CODIGO_PENTAL(String Cod)
    {
        // initialise instance variables
        super(Cod);
    }

    /**
     * Indica la cantidad de letras
     
     */
    public int cantLetras()
    {
        // put your code here
         
        MétodoHerramienta.CValidar(Cod); 
        
        int CantidadDeLetras = 0;
        
       for (int x = 0; x < Cod.length(); x++){ 
                char letraActual = Cod.charAt(x);
             int AsciiValue = letraActual;
             if ((AsciiValue >= 65 && AsciiValue <= 90))
            { 
                ++CantidadDeLetras; 
            } 
        
        }   
        return CantidadDeLetras;
        
        
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String digPental()
    {
        // put your code here
        MétodoHerramienta.CValidar(Cod); 
        
        String Pental = "";
         int CantidadDeLetras = 0;
        
        for (int x = 0; x < Cod.length(); x++){ 
                char letraActual = Cod.charAt(x);
             int AsciiValue = letraActual;
             if ((AsciiValue >= 48 && AsciiValue <= 52))
            { 
                Pental = Pental + letraActual; 
            } 
        }
                
        return Pental;
        
        
    }
}
