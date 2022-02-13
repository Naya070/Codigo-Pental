
import javax.swing.JOptionPane;

public class MétodoHerramienta
{
    // instance variables - replace the example below with your own
    public static boolean PValidar(String Palab){
      
     
      try {
        
          for (int x = 0; x < Palab.length(); x++){ 
                char letraActual = Palab.charAt(x);
             int AsciiValue = letraActual;
          if ((AsciiValue >= 65 && AsciiValue <= 90) || (AsciiValue >= 48 && AsciiValue <= 57))
            { 
                return true;
            } 
            else {JOptionPane.showMessageDialog(null, "Texto Inválido, por favor inserte números o letras mayúsculas unicamente.");}
        }
        
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Texto Inválido, por favor inserte números o letras mayúsculas unicamente.");
            return false; 
            
        }  
       return true;
    }
    
    public static boolean CValidar(String Cod){
      
     
      try {
        
          for (int x = 0; x < Cod.length(); x++){ 
                char letraActual = Cod.charAt(x);
             int AsciiValue = letraActual;
          if ((AsciiValue >= 65 && AsciiValue <= 90) || (AsciiValue >= 48 && AsciiValue <= 57))
            { 
                return true;
            }
            else {JOptionPane.showMessageDialog(null, "Texto Inválido, por favor inserte números o letras mayúsculas unicamente.");}
        }
        
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Texto Inválido, por favor inserte números o letras mayúsculas unicamente.");
            return false; 
            
        } 
      return true;
    }
} 