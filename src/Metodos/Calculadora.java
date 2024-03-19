package Metodos;

import javax.swing.JOptionPane;

public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora() {
    }

    /*
    Creo un metodo el cual me llamara un menu de opciones para realizar las
    diferentes operaciones matematicas
     */
    public void caculadora() {
        int op = 0;
        while (op != 5) {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Suma"
                    + "\n" + "2. Resta"
                    + "\n" + "3. Multiplicación"
                    + "\n" + "4. División"
                    + "\n" + "5. Salir",
                    "Menú matemático", JOptionPane.QUESTION_MESSAGE));

            switch (op) {
                case 1:
                    capturarDatos2();
                    suma(num1, num2);
                    break;

                case 2:
                    capturarDatos2();
                    resta(num1, num2);
                    break;

                case 3:
                    capturarDatos2();
                    multiplicacion(num1, num2);
                    break;

                case 4:
                    capturarDatos2();
                    division(num1, num2);
                    break;

                case 5:
                    break;

            }
        }
    }

    private void capturarDatos2() {
        /*
        El valor de las variables num1 y num2 las vamos a llenar usando una ventana
        emergente de tipo JOptionPane
         */
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor numerico ",
                 JOptionPane.QUESTION_MESSAGE));

        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor numerico ",
                 JOptionPane.QUESTION_MESSAGE));

    }

    /*
    Se crean los metodos para realizar las operaciones matematicas
    donde los valores que asignamos en la ventana de diagalo se estableceran en los
    parametros X y Y respectivamente, despues realizaran la operación correspondiente
    y en una ventana emergente de tipo mensaje nos mostrara el resultado de la operacion realizada
     */
    private void suma(int x, int y) {

        int suma = 0;
        suma = x + y;
        JOptionPane.showMessageDialog(null, "la suma es: " + suma,
                "Suma ", JOptionPane.INFORMATION_MESSAGE);
    }

    private void resta(int x, int y) {

        int resta = 0;
        resta = x - y;
        JOptionPane.showMessageDialog(null, "la suma es: " + resta,
                "Resta ", JOptionPane.INFORMATION_MESSAGE);
    }

    public void multiplicacion(int x, int y) {
        int multiplicacion = 0;
        multiplicacion = x * y;
        JOptionPane.showMessageDialog(null, "la suma es: " + multiplicacion,
                "Multiplicación ", JOptionPane.INFORMATION_MESSAGE);
    }

    private void division(int x, int y) {
        double division = 0, auxX, auxY;
        auxX = (double) (x);
        auxY = (double) (y);
        division = x / y;
        JOptionPane.showMessageDialog(null, "la suma es: " + division,
                "División ", JOptionPane.INFORMATION_MESSAGE);
    }
}//Fin class
