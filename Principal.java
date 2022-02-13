   
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;

public class Principal
{
    // instance variables - replace the example below with your own
    public static String Palab;
    public String Palabra;
    public String codigo;
    /**
     * Constructor for objects of class Principal
     */
    public Principal(String Palab)
    {
        // initialise instance variables
        this.Palab = Palab;
    }
    
    public static void main(String[] args) {
        
        String Palab = JOptionPane.showInputDialog("Introduzca un número:");
        Principal P1 = new Principal(Palab);
        
        P1.getPalab(Palab);
        P1.elemCod();
        P1.cantLetras();
        P1.digPental();
            
            
        }
    
    /**
     * Método para ver palabra
     */
    
    public static String getPalab(String Palab)
    {
        
                       
        return Palab;
       
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static int elemCod()
    {
        // put your code here
         
         
         int elemCodigo = 0;
         
        
           
            for (int x = 0; x < Palab.length(); x++){ 
                char letraActual = Palab.charAt(x);
             int AsciiValue = letraActual;
             if ((AsciiValue >= 65 && AsciiValue <= 90) || (AsciiValue >= 48 && AsciiValue <= 57))
            { 
                ++elemCodigo; 
            } 
             
        }
        
                
        return elemCodigo;
        
        
    }
    
    /**
     * Indica la cantidad de letras
     
     */
    public int cantLetras()
    {
        // put your code here
         
         int CantidadDeLetras = 0;
        
       for (int x = 0; x < Palab.length(); x++){ 
                char letraActual = Palab.charAt(x);
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
    public static String digPental()
    {
        // put your code here
         String Pental = "";
         int CantidadDeLetras = 0;
        
        for (int x = 0; x < Palab.length(); x++){ 
                char letraActual = Palab.charAt(x);
             int AsciiValue = letraActual;
             if ((AsciiValue >= 48 && AsciiValue <= 52))
            { 
                Pental = Pental + letraActual; 
            } 
        }
                
        return Pental;
        
        
    }
  
}
