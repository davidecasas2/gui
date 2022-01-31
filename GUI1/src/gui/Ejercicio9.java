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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio9 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio9 frame = new Ejercicio9();
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
	public Ejercicio9() {
		setTitle("Pel\u00EDculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][10px,grow 50][grow]", "[][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Escribe el t\u00EDtulo de la pel\u00EDcula:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 1 1");
		
		JLabel lblNewLabel_1 = new JLabel("Pel\u00EDculas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 3 1");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 2,growx");
		textField.setColumns(10);
		
		comboBox = new JComboBox();
		contentPane.add(comboBox, "cell 3 2,growx");
		
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadirALista();
			}
		});
		contentPane.add(btnNewButton, "cell 1 4,alignx center");
		getRootPane().setDefaultButton(btnNewButton);
	}
	
	public void añadirALista() {
		if (textField.getText()==null || textField.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Debe introducir el título de la película");
		} else {
			comboBox.addItem(textField.getText());
			textField.setText("");
		}
	}

}
