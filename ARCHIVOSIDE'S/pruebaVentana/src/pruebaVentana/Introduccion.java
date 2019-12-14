package pruebaVentana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Introduccion {

	private JFrame frame;
	private JTextField txtPablo;
	private JTextField txtArinoMunoz;
	private JTextField txtPabarinogmailcom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Introduccion window = new Introduccion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Introduccion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIntroduccionDeClientes = new JLabel("INTRODUCCION DE CLIENTES");
		lblIntroduccionDeClientes.setBounds(12, 13, 228, 16);
		frame.getContentPane().add(lblIntroduccionDeClientes);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(57, 71, 56, 16);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(57, 111, 56, 16);
		frame.getContentPane().add(lblApellidos);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(57, 152, 56, 16);
		frame.getContentPane().add(lblEmail);
		
		txtPablo = new JTextField();
		txtPablo.setText("Pablo");
		txtPablo.setBounds(139, 68, 198, 22);
		frame.getContentPane().add(txtPablo);
		txtPablo.setColumns(10);
		
		txtArinoMunoz = new JTextField();
		txtArinoMunoz.setText("Arino Munoz");
		txtArinoMunoz.setBounds(139, 108, 198, 22);
		frame.getContentPane().add(txtArinoMunoz);
		txtArinoMunoz.setColumns(10);
		
		txtPabarinogmailcom = new JTextField();
		txtPabarinogmailcom.setText("pabarino@gmail.com");
		txtPabarinogmailcom.setBounds(139, 149, 198, 22);
		frame.getContentPane().add(txtPabarinogmailcom);
		txtPabarinogmailcom.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(256, 215, 97, 25);
		frame.getContentPane().add(btnEnviar);
	}
}
