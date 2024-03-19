package Metodos;

import javax.swing.JOptionPane;

public class Matrices {

    private float temperatura[][];
    private int i;
    private int j;

    public void Llenar_matriz() {

        temperatura = new float[7][1];
        //Llenar la matriz
        for (i = 0; i < 7; i++) {
            for (j = 0; i < 1; i++) {

            }
            temperatura[i][j] = Float.parseFloat(JOptionPane.showInputDialog("La temperatura del dia " + i + " fue: "));
        }
    }

    public void imprimir() {
        //Imprimir la matriz
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 1; i++) {

                JOptionPane.showMessageDialog(null, (i + 1) + "Dia. Temperatura: " + temperatura[i][j]);

            }
        }
    }
}//Fin class 
