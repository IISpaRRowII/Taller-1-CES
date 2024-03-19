package view;

import Metodos.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana2 extends JFrame {

    public JPanel fondo;
    public JLabel saludo;
    public JButton btnOperacionesMat;
    public JButton btnCondicionales1;
    public JButton btnCondicionales2;
    public JButton btnCiclos1;
    public JButton btnCiclos2;
    public JButton btnArrys1;
    public JButton btnArrys2;
    public JButton btnArrys3;
    public JButton btnPromedio;
    public JButton btnDivisible;
    public JButton btnJugar;

    Ventana1 ventana1;// instancio la ventana1 para poder extraer los valores que tengo en ella 

    public Ventana2() {
        propiedades();
        elementos();
    }

    public void propiedades() {
        this.setSize(600, 600);
        this.setTitle("Taller 1");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void elementos() {
        /* Se inician los componentes y se definen 
        las propiedades de cada elemento*/
        fondo = new JPanel();//iniciamos el panel
        fondo.setBounds(0, 0, getWidth(), getHeight());//establecemos las dimensiones
        fondo.setLayout(null);//quitamos el diseño por defecto
        fondo.setBackground(Color.gray);//establecemos un color
        this.getContentPane().add(fondo);//agregamos el panel a la ventana principal

        saludo = new JLabel("Bienvenid@ " + ventana1.nombre + ", " + ventana1.edad + " años");//se inicia el label con los parametros de la vetana 1
        saludo.setBounds(90, 20, 400, 50);
        saludo.setFont(new Font("Arial", 1, 20));
        fondo.add(saludo);

        /*
        Los botones se estan agregando al panel por columnas, ejemplo se esta
        agregando primero el botón calculadora en las pocision [1][1], el siguiente botón
        se esta añadiendo en la pocision [1][2] y asi suceviamente con los demas botones.
         */
        btnOperacionesMat = new JButton("CALCULADORA");
        btnOperacionesMat.setBounds(20, 100, 150, 80);
        fondo.add(btnOperacionesMat);

        //funcionalidad del botón calculadora
        btnOperacionesMat.addActionListener((ActionEvent e) -> {
            btnOperacionesMatActionPerformed(e);
        });

        btnCiclos1 = new JButton("CICLO FOR");
        btnCiclos1.setBounds(20, 220, 150, 80);
        fondo.add(btnCiclos1);

        //Funcionalidad del botón cicloFor 
        btnCiclos1.addActionListener((ActionEvent e) -> {
            btnCiclos1ActionPerformed(e);
        });

        btnArrys2 = new JButton("VECTOR");
        btnArrys2.setBounds(20, 340, 150, 80);
        fondo.add(btnArrys2);

        //Funcionalidades del botón Vectores
        btnArrys2.addActionListener((ActionEvent e) -> {
            btnArrays2ActionPerformed(e);
        });

        btnDivisible = new JButton("DIVISIBLE");
        btnDivisible.setBounds(20, 460, 150, 80);
        fondo.add(btnDivisible);

        btnCondicionales1 = new JButton("CONDICIONALES 1");
        btnCondicionales1.setBounds(200, 100, 150, 80);
        fondo.add(btnCondicionales1);

        //Funcionalidades del botón condicioanales 1
        btnCondicionales1.addActionListener((ActionEvent e) -> {
            btnCondicionales1ActionPerformed(e);
        });

        btnCiclos2 = new JButton("CICLO WHILE");
        btnCiclos2.setBounds(200, 220, 150, 80);
        fondo.add(btnCiclos2);

        //Funcionalidad boton ciclo2
        btnCiclos2.addActionListener((ActionEvent e) -> {
            btnCiclos2ActionPerformed(e);
        });

        btnArrys3 = new JButton("MATRIZ");
        btnArrys3.setBounds(200, 340, 150, 80);
        fondo.add(btnArrys3);

        //Funcionalidad boton ciclo2
        btnArrys3.addActionListener((ActionEvent e) -> {
            btnArrays3ActionPerformed(e);
        });

        btnJugar = new JButton("JUGAR");
        btnJugar.setBounds(200, 460, 150, 80);
        fondo.add(btnJugar);

        btnCondicionales2 = new JButton("CONDICIONALES 2");
        btnCondicionales2.setBounds(380, 100, 150, 80);
        fondo.add(btnCondicionales2);

        //Funcionalidad del boton condicioanales2
        btnCondicionales2.addActionListener((ActionEvent e) -> {
            btnCondicionales2ActionPerformed(e);
        });

        btnArrys1 = new JButton("VARIABLE");
        btnArrys1.setBounds(380, 220, 150, 80);
        fondo.add(btnArrys1);

        //Funcionalidad del boton condicioanales2
        btnArrys1.addActionListener((ActionEvent e) -> {
            btnArrays1ActionPerformed(e);
        });

        btnPromedio = new JButton("PROMEDIO");
        btnPromedio.setBounds(380, 340, 150, 80);
        fondo.add(btnPromedio);

    }

    // ---- Metodos de los botones ----
    public void btnOperacionesMatActionPerformed(ActionEvent e) {
        var openCalculadora = new Calculadora();
        openCalculadora.caculadora();

    }

    public void btnCondicionales1ActionPerformed(ActionEvent e) {
        var openCondicionales1 = new Condicionales1();
        openCondicionales1.positivo_negativo();

    }

    public void btnCondicionales2ActionPerformed(ActionEvent e) {
        var openCondicioanles2 = new Condicionales2();
        openCondicioanles2.num_Mayor();
    }

    public void btnCiclos1ActionPerformed(ActionEvent e) {
        var openCicloFor = new CicloFor();
        openCicloFor.contar_diez();
    }

    public void btnCiclos2ActionPerformed(ActionEvent e) {
        var openCicloWhile = new CicloWhile();
        openCicloWhile.numero_Par();
    }

    public void btnArrays1ActionPerformed(ActionEvent e) {
        var openVariables = new Variables();
        openVariables.Obtener_Nombre();
    }

    public void btnArrays2ActionPerformed(ActionEvent e) {
        var openVectores = new Vectores();
        openVectores.llenar_Edades();
        openVectores.Imprimir();
    }

    public void btnArrays3ActionPerformed(ActionEvent e) {
        var openMatrices = new Matrices();
        openMatrices.Llenar_matriz();
        openMatrices.imprimir();
    }

}//Fin class
