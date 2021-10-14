
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class controlRad extends JFrame {

	private JPanel contentPane;
	private JLabel lblQuestion;
	private JRadioButton radAnswer1;
	private JRadioButton radAnswer2;
	private JRadioButton radAnswer3;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnEvaluar;
	private  int iterador=0;
	private int Respuestas=0;
	
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
		setTitle("Quizz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		radAnswer1 = new JRadioButton("HyperText Markup Language");
		radAnswer1.setBounds(25, 58, 385, 23);
		contentPane.add(radAnswer1);
		
		radAnswer2 = new JRadioButton("HyperToken MarkupLanguage");
		radAnswer2.setBounds(25, 100, 385, 23);
		contentPane.add(radAnswer2);
		
		radAnswer3 = new JRadioButton("HyperText ModelingLanguage");
		radAnswer3.setBounds(25, 139, 385, 23);
		contentPane.add(radAnswer3);
		
		btnAnterior = new JButton("<");
		btnAnterior.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				iterador--;
				switch(iterador) {
				case 0:
					lblQuestion.setText("¿Qué significa HTML?");
					radAnswer1.setText("HyperText Markup Language");
					radAnswer2.setText("HyperToken MarkupLanguage");
					radAnswer3.setText("HyperText ModelingLanguage");
					break;
				case 1:
					lblQuestion.setText("¿Cual es el esqueleto/estructura basica de HTML?");
					radAnswer1.setText("section/article");
					radAnswer2.setText("title/p");
					radAnswer3.setText("head/body");
					break;
				case 2:
					lblQuestion.setText("¿Que lenguaje de programación es más recurrente ver en HTML?");
					radAnswer1.setText("Python");
					radAnswer2.setText("Javascript");
					radAnswer3.setText("C#");
				case 3:
					lblQuestion.setText("¿Qué significa CSS?");
					radAnswer1.setText("Cascading Style Sheet");
					radAnswer2.setText("Visual studio code");
					radAnswer3.setText("C#");
					break;
				case 4: 
					lblQuestion.setText("¿Con que lenguaje estilizamos nuestra estructura HTML?");
					radAnswer1.setText("C#");
					radAnswer2.setText("Visual studio code");
					radAnswer3.setText("Cascading Style Sheet");
					break;
				}
			}
		});
		btnAnterior.setBounds(10, 227, 89, 23);
		contentPane.add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				iterador++;
				switch(iterador) {
				case 0:
					lblQuestion.setText("¿Qué significa HTML?");
					radAnswer1.setText("HyperText Markup Language");
					radAnswer2.setText("HyperToken MarkupLanguage");
					radAnswer3.setText("HyperText ModelingLanguage");
					if(radAnswer1.isSelected()) {
						Respuestas++;
					}
					break;
				case 1:
					lblQuestion.setText("¿Cual es el esqueleto/estructura basica de HTML?");
					radAnswer1.setText("section/article");
					radAnswer2.setText("title/p");
					radAnswer3.setText("head/body");
					if(radAnswer3.isSelected()) {
						Respuestas++;
					}
					break;
				case 2:
					lblQuestion.setText("¿Que lenguaje de programación es más recurrente ver en HTML?");
					radAnswer1.setText("Python");
					radAnswer2.setText("Javascript");
					radAnswer3.setText("C#");
					if(radAnswer2.isSelected()) {
						Respuestas++;
					}
					break;
				case 3:
					lblQuestion.setText("¿Qué significa CSS?");
					radAnswer1.setText("Cascading Style Sheet");
					radAnswer2.setText("Visual studio code");
					radAnswer3.setText("C#");
					if(radAnswer1.isSelected()) {
						Respuestas++;
					}
					break;
				case 4: 
					lblQuestion.setText("¿Con que lenguaje estilizamos nuestra estructura HTML?");
					radAnswer1.setText("C#");
					radAnswer2.setText("Visual studio code");
					radAnswer3.setText("Cascading Style Sheet");
					if(radAnswer3.isSelected()) {
						Respuestas++;
					}
					break;
				}
			}
		});
		btnSiguiente.setBounds(131, 227, 89, 23);
		contentPane.add(btnSiguiente);
		
		btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(contentPane,"Sus aciertos fueron:  "+Respuestas);
			}
		});
		btnEvaluar.setBounds(335, 227, 89, 23);
		contentPane.add(btnEvaluar);
		
		lblQuestion = new JLabel("\u00BFQu\u00E9 significa HTML?");
		lblQuestion.setBounds(25, 25, 385, 14);
		contentPane.add(lblQuestion);
		
		
		
		
	}
}
