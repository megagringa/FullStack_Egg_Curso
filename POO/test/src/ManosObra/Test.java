
package ManosObra;



import Entidades.Persona;
import static Entidades.Persona.mostrarDatosPersona;

public class Test {

   

    public static void main(String[] args) {
        Persona obra = new Persona("Juan","Lopez",34);
        
      
        mostrarDatosPersona(obra); 
    }
}
