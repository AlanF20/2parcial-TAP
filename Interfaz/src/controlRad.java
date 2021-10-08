
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class controlRad extends JFrame {

	private JPanel contentPane;
	static int[] miArreglo = new int[3]; 
	private JLabel lblQuestion;
	private JRadioButton radAnswer1;
	private JRadioButton radAnswer2;
	private JRadioButton radAnswer3;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnEvaluar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controlRad frame = new controlRad();
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
	public controlRad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		radAnswer1 = new JRadioButton("New radio button");
		radAnswer1.setBounds(25, 58, 109, 23);
		contentPane.add(radAnswer1);
		
		radAnswer2 = new JRadioButton("New radio button");
		radAnswer2.setBounds(25, 100, 109, 23);
		contentPane.add(radAnswer2);
		
		radAnswer3 = new JRadioButton("New radio button");
		radAnswer3.setBounds(25, 139, 109, 23);
		contentPane.add(radAnswer3);
		
		btnAnterior = new JButton("<");
		btnAnterior.setBounds(10, 227, 89, 23);
		contentPane.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i=0; miArreglo.length <= 4; i++) {
					if(miArreglo[0]==0) {
						lblQuestion.setText("Hola");
						radAnswer1.setText("Respuesta 1");
						radAnswer2.setText("Respuesta 2");
						radAnswer3.setText("Respuesta 3");
						
					}else {
						if(miArreglo[1]==1) {
							lblQuestion.setText("Hola 2");
							radAnswer1.setText("Respuesta 4");
							radAnswer2.setText("Respuesta 5");
							radAnswer3.setText("Respuesta 6");
							
						}else {
							if(miArreglo[2] == 2) {
								lblQuestion.setText("Hola 3");
								radAnswer1.setText("Respuesta 7");
								radAnswer2.setText("Respuesta 8");
								radAnswer3.setText("Respuesta 9");
								
							}else {
								if(miArreglo[3]==3) {
									lblQuestion.setText("Hola4");
									radAnswer1.setText("Respuesta 10");
									radAnswer2.setText("Respuesta 11");
									radAnswer3.setText("Respuesta 12");
									
								}
							}
						}
					}
				}
			}
		});
		btnSiguiente.setBounds(131, 227, 89, 23);
		contentPane.add(btnSiguiente);
		
		btnEvaluar = new JButton("Evaluar");
		btnEvaluar.setBounds(335, 227, 89, 23);
		contentPane.add(btnEvaluar);
		
		lblQuestion = new JLabel("New label");
		lblQuestion.setBounds(25, 25, 46, 14);
		contentPane.add(lblQuestion);
		
		
		
		
	}
}
