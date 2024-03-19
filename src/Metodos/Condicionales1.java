package Metodos;

import javax.swing.JOptionPane;

public class Condicionales1 {

    private int num1;
    private int num2;

    public Condicionales1() {
    }
    
    public void positivo_negativo(){
        
        num2 = 0;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, "El numero ingresado es positivo");
        }
        else if(num1 < num2){
            JOptionPane.showMessageDialog(null, "El numero ingresado es negativo");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero ingresado es " + num2);
        }
    }
}//Fin class 
