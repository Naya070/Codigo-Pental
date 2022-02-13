
/**
 * Write a description of class Código here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Código
{
    // instance variables - replace the example below with your own
    public String Cod;

    /**
     * Constructor for objects of class Código
     */
    public Código(String Cod)
    {
        // initialise instance variables
        this.Cod = Cod;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int númeroDeElementos()
    {
        // put your code here
        MétodoHerramienta.CValidar(Cod);
        
        int elemCodigo = 0;
         
        
           
            for (int x = 0; x < Cod.length(); x++){ 
                char letraActual = Cod.charAt(x);
             int AsciiValue = letraActual;
             if ((AsciiValue >= 65 && AsciiValue <= 90) || (AsciiValue >= 48 && AsciiValue <= 57))
            { 
                ++elemCodigo; 
            } 
             
        }
        
                
        return elemCodigo;
    }
}
