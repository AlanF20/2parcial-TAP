import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class VentanaSerie extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumUno;
	private JTextField txtNumDos;
	private JTextField txtIteraciones;
	private JTextArea varSerie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSerie frame = new VentanaSerie();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaSerie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumUno = new JTextField();
		txtNumUno.setBounds(115, 25, 178, 20);
		contentPane.add(txtNumUno);
		txtNumUno.setColumns(10);
		
		txtNumDos = new JTextField();
		txtNumDos.setBounds(115, 56, 178, 20);
		contentPane.add(txtNumDos);
		txtNumDos.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero uno:");
		lblNewLabel.setBounds(26, 28, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNmeroDos = new JLabel("N\u00FAmero dos:");
		lblNmeroDos.setBounds(26, 59, 79, 14);
		contentPane.add(lblNmeroDos);
		
		JLabel lblIteraciones = new JLabel("Iteraciones:");
		lblIteraciones.setBounds(26, 90, 79, 14);
		contentPane.add(lblIteraciones);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setColumns(10);
		txtIteraciones.setBounds(115, 87, 178, 20);
		contentPane.add(txtIteraciones);
		
		varSerie = new JTextArea();
		varSerie.setBounds(44, 169, 340, 64);
		contentPane.add(varSerie);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=0, s=0;
				int varNum1 = Integer.parseInt(txtNumUno.getText());
				int varNum2 = Integer.parseInt(txtNumDos.getText());
				int varItera = Integer.parseInt(txtIteraciones.getText());
				String cadena = "";

				while(i<=varItera){
					s=varNum1+varNum2;
					cadena += " "+String.valueOf(s);
					varNum1=varNum2;
					varNum2=s;
					i++;
				}
				varSerie.setText(cadena);
			}
		});
		
		btnGenerar.setBounds(115, 135, 89, 23);
		contentPane.add(btnGenerar);
		
		
	}
}
