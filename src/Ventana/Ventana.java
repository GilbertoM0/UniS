package Ventana;
//https://github.com/GilbertoM0/UniS.git
//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
// Modificacion hecha desde mi  Pad
//Hola, como estas, bien y tu, bien correcto
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame
{

    public Ventana ()
    {
        //Crear ventana

        //this.setSize(500, 500);
        //Centrar ventana
        //this.setLocationRelativeTo(null);
        //Cerrar y dejar de ejecutar
        this.setDefaultCloseOperation (EXIT_ON_CLOSE);

        //Agregar titulo a la ventana
        this.setTitle ("Mi primera vez con Java y Netbeans");

        //this.setVisible(true);
        //mover ventana a un lugar especifico
        //this.setBounds(100, 200, 500, 500);
        //Bloquear ventana en tamano
        //this.setResizable(false);
        //Maximizar ventana
        this.setExtendedState (MAXIMIZED_BOTH);

        //Pintar ventana
        //this.getContentPane().setBackground(Color.blue);
        //Llamar al metodo para inicializar los componentes
        iniciarComponentes ();
    }

    private void iniciarComponentes ()
    {
        //Crear un panel
        JPanel panel = new JPanel ();
        panel.setBackground (Color.blue);
        this.getContentPane ().add (panel);
        panel.setLayout(null); //Para quitar
        

        //Etiquedas
        
        JLabel titulo = new JLabel ("Java y Netbeans");
        titulo.setFont (new Font ("tipoLetra", Font.BOLD, 18));
        titulo.setBounds (550, 20, 300, 40);
        //nombre.setForeground(Color.green);
        panel.add ( titulo);
        
        JLabel nombre = new JLabel ("Nombre");
        nombre.setFont (new Font ("tipoLetra", Font.BOLD, 18));
        nombre.setBounds (100, 100, 150, 20);
       //nombre.setForeground(Color.green);
       panel.add (nombre);
        
        //Cuadro de texto
        JTextField txtNombre= new JTextField("Digita tu nombre");
        txtNombre.setBounds(210,100,200,20);
        panel.add(txtNombre);
        
        JLabel Contrasena = new JLabel ("Contrasena:");
        Contrasena.setFont (new Font ("tipoLetra", Font.BOLD, 18));
        Contrasena.setBounds (100, 130, 150, 20);
       //nombre.setForeground(Color.green);
       panel.add (Contrasena);
        
        //Cuadro de texto
        JTextField txtContrasena= new JTextField("Digita tu Contrasena");
        txtContrasena.setBounds(210,130,200,20);
        panel.add(txtContrasena);
        //BOTON DE ACEPTAR
        
        JButton btnValidar =new JButton("Validar");
        btnValidar.setBounds(310,160,100,25);
        panel.add(btnValidar);

  
    }

}

/*             //CODIGO EXTRA
        // Crear dos JTextFields para ingresar los números
        JTextField num1 = new JTextField ();
        num1.setBounds (100, 100, 150, 20);
        num1.setColumns (10);
        panel.add (num1);

        JTextField num2 = new JTextField ();
        num2.setBounds (250, 100, 150, 20);
        num2.setColumns (10);
        panel.add (num2);

// Crear un JButton para realizar la suma
        JButton btnSumar = new JButton ("Sumar");
        btnSumar.setBounds (150, 150, 100, 20);
        panel.add (btnSumar);

// Crear un JLabel para mostrar el resultado de la suma
        JLabel resultado = new JLabel ();
        resultado.setBounds (300, 100, 50, 20);
        panel.add (resultado);

// Añadir un evento al botón de suma
        btnSumar.addActionListener (new ActionListener ()
        {
            @Override
            public void actionPerformed (ActionEvent e)
            {
                int n1 = Integer.parseInt (num1.getText ());
                int n2 = Integer.parseInt (num2.getText ());
                int suma = n1 + n2;
                resultado.setText (String.valueOf (suma));
            }
        });
*/
