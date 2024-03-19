package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana1 extends JFrame {

    //Atributos
    public JPanel Fondo;
    public JLabel lblBienvenida;
    public JLabel lblNombre;
    public JTextField txtNombre;
    public JLabel lblEdad;
    public JTextField txtEdad;
    public JButton btnContinuar;

    //variables para guardar lo que escribimos en el campo de texto 
    public static String nombre;
    public static String edad;

    public Ventana1() {//Contructor de la ventana principal
        propiedades();
        Elementos();
    }

    //--- Método para definir las propiedades de la ventana ---
    public void propiedades() {

        //propiedades de la ventana pricipal 
        this.setSize(400, 400);
        this.setTitle("Taller 1");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }

    // --- Método Para inciar los componentes dentro del fondo ---  
    public void Elementos() {
        /* Se inician los componentes y se definen 
        las propiedades de cada elemento*/

        Fondo = new JPanel();
        Fondo.setBounds(0, 0, getWidth(), getHeight());// se establecen las dimensiones iguales a las ventana
        Fondo.setLayout(null);//Se desactiva el diseño por defecto que trae el panel 
        Fondo.setBackground(Color.gray);//establecemos un color al panel(fondo)
        this.getContentPane().add(Fondo);//le establecemos un fondo (plantilla) de tipo panel a la ventana JFrame

        // --- Agregamos los componentes al panel(fondo) ---
        lblBienvenida = new JLabel("Bienvenid@"
                + "\n Ingrese sus datos");//instanciamos el objeto y le agregamos un texto
        lblBienvenida.setBounds(100, 15, 180, 80);//Definimos la ubicacion y el tamaña con pixeles
        Fondo.add(lblBienvenida);//adicionamos el elemento en el panel(fondo)

        lblNombre = new JLabel("Ingresé su nombre");
        lblNombre.setBounds(140, 130, 150, 20);
        Fondo.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(110, 160, 150, 20);
        Fondo.add(txtNombre);

        lblEdad = new JLabel("Ingresé su edad");
        lblEdad.setBounds(140, 200, 150, 20);
        Fondo.add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(110, 230, 150, 20);
        Fondo.add(txtEdad);

        btnContinuar = new JButton("Contiuar");
        btnContinuar.setBounds(110, 300, 150, 40);
        Fondo.add(btnContinuar);

        //funcionalidad del botón
        btnContinuar.addActionListener((ActionEvent e) -> {
            btnContinuarActionPerformed(e);
        });

    }//FinElementos

    public void btnContinuarActionPerformed(ActionEvent e) {
        nombre = txtNombre.getText();
        edad = txtEdad.getText();

        var openVent = new Ventana2();
        openVent.setVisible(true);
        this.setVisible(false);

    }//Fin Action

}//FIN CLASS
