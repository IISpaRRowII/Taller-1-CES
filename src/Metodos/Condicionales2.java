
package Metodos;

import javax.swing.JOptionPane;


public class Condicionales2 {
    
    private int num1;
    private int num2;

    public Condicionales2() {
    }
    
    public void num_Mayor(){
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if (num1 > num2){
            JOptionPane.showMessageDialog(null, "El numero mayor es " + num1);
        }
        else if ( num1 == num2){
            JOptionPane.showMessageDialog(null, "Los numeros ingreados son iguales");
        }
        else {
            JOptionPane.showMessageDialog(null, "El numero mayor es " + num2);
        }
    }
}//Fin clase
