package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JLabel lblPromedio;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
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
	public Ejercicio4() {
		setTitle("C\u00E1lculo de Promedio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("CALCULAR PROMEDIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[69.00][grow][52.00][80.00,grow][40][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("Nombre: ");
		panel.add(lblNewLabel_1, "cell 0 0,alignx trailing");
		
		txtNombre = new JTextField();
		panel.add(txtNombre, "cell 1 0 5 1,growx");
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 1:");
		panel.add(lblNewLabel_2, "cell 0 1,alignx trailing");
		
		txtNota1 = new JTextField();
		panel.add(txtNota1, "cell 1 1,growx");
		txtNota1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 2:");
		panel.add(lblNewLabel_3, "cell 2 1,alignx trailing");
		
		txtNota2 = new JTextField();
		panel.add(txtNota2, "cell 3 1,growx");
		txtNota2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nota 3:");
		panel.add(lblNewLabel_4, "cell 4 1,alignx trailing");
		
		txtNota3 = new JTextField();
		panel.add(txtNota3, "cell 5 1,growx");
		txtNota3.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		panel.add(btnCalcular, "cell 4 3");
		
		JLabel lblNewLabel_5 = new JLabel("Promedio: ");
		panel.add(lblNewLabel_5, "cell 0 6");
		
		lblPromedio = new JLabel("");
		panel.add(lblPromedio, "cell 1 6 5 1");
		
		JLabel lblNewLabel_6 = new JLabel("Resultado:");
		panel.add(lblNewLabel_6, "cell 0 7");
		
		lblResultado = new JLabel("");
		panel.add(lblResultado, "cell 1 7 5 1");
	}
	
	public void calcular () {
		String nombre = txtNombre.getText();
		if (txtNota1.getText()==null || txtNota1.getText().equals("") ||
			txtNota2.getText()==null || txtNota2.getText().equals("") ||
			txtNota3.getText()==null || txtNota3.getText().equals("") ) {
			JOptionPane.showMessageDialog(null, "Debes rellenar todas las notas");
		} else {
			double nota1 = Double.parseDouble(txtNota1.getText());
			double nota2 = Double.parseDouble(txtNota2.getText());
			double nota3 = Double.parseDouble(txtNota3.getText());
			
			double media = (nota1+nota2+nota3)/3;
			lblPromedio.setText( String.format("%.2f",media) );
			
			if (media>=5) {
				lblResultado.setText(nombre + " ha superado la asignatura");
			} else {
				lblResultado.setText(nombre + ", toca recuperar");
			}
		}
		
		
		
	}

}
