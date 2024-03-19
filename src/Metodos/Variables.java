
package Metodos;

import javax.swing.JOptionPane;

public class Variables {

    private String nombre;

    public Variables() {
    }
    
    public void Obtener_Nombre(){
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: " + nombre);
        
        JOptionPane.showMessageDialog(null, "El nombre que ingreso fue: " + nombre);
    }
    

}//Fin clase 

