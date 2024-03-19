package Metodos;

import javax.swing.JOptionPane;

public class Vectores {

    private int edades[];
    private int i;

    public Vectores() {
    }

    public void llenar_Edades() {
        edades = new int[5];
        //se llena el vector 
        for (i = 0; i < 5; i++) {
            edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Escriba una edad: " + i));

        }
        
        
    }
    
    public void Imprimir(){
        //se imprimen los valores guardados en el vector
        for (int i = 0; i < 5; i++) {

            JOptionPane.showMessageDialog(null, (i + 1) + ". Edad: " + edades[i]);
        }
    }

}//Fin class

