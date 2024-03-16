package taller1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana1 extends JFrame {

    //Atributos
    private JPanel Fondo;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel lblEdad;
    private JTextField txtEdad;
    private JButton btnSiguiente;

    public Ventana1() {
        propiedades();
        init();
    }

    //--- Método para definir las propiedades de la ventana ---
    public void propiedades() {
        this.setVisible(true);
        this.setSize(400, 400);
        this.setTitle("Taller 1");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    // --- Método Para inciar lso componentes dentro de la ventana ---  
    public void init() {
        /* Se inician los componentes y se definen 
        las propiedades de cada elemento*/

        Fondo = new JPanel();
        Fondo.setLayout(null);//Se desactiva el diseño por defecto que trae el panel 
        Fondo.setBackground(Color.gray);//establecemos un color al panel(fondo)
        this.getContentPane().add(Fondo);//le establecemos un fondo (plantilla) de tipo panel a la ventana JFrame

        // --- Agregamos los componentes al panel(fondo) ---
        lblNombre = new JLabel("Ingresé su nombre");//instanciamos el objeto y le agregamos un texto
        lblNombre.setBounds(15, 15, 150, 20);//Definimos la ubicacion y el tamaña con pixeles
        Fondo.add(lblNombre);//adicionamos el elemento en el panel(fondo)

        txtEdad = new JTextField();
        txtEdad.setBounds(15, 45, 150, 20);
        Fondo.add(txtEdad);

        lblEdad = new JLabel("Ingresé su edad");
        lblEdad.setBounds(15, 90, 150, 20);
        Fondo.add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(15, 120, 150, 20);
        Fondo.add(txtEdad);

        btnSiguiente = new JButton("Siguiente");
        btnSiguiente.setBounds(110, 200, 150, 20);
        //funcionalidad del botón

        Fondo.add(btnSiguiente);
    }

}//FIN CLASS
