package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblBoton1;
	private JLabel lblBoton2;
	private int contador=0;
	private int contador2 = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bot\u00F3n 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(39, 24, 80, 14);
		contentPane.add(lblNewLabel);
		
		lblBoton1 = new JLabel("");
		lblBoton1.setBounds(108, 26, 49, 14);
		contentPane.add(lblBoton1);
		
		lblBoton2 = new JLabel("");
		lblBoton2.setBounds(339, 24, 49, 14);
		contentPane.add(lblBoton2);
		
		JLabel lblNewLabel_1 = new JLabel("Bot\u00F3n 2:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(270, 22, 80, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnBoton2 = new JButton("Bot\u00F3n 1");
		btnBoton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBoton1();
			}
		});
		btnBoton2.setBounds(74, 83, 89, 23);
		contentPane.add(btnBoton2);
		
		JButton btnBoton1 = new JButton("Bot\u00F3n 2");
		btnBoton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accionBoton2();
			}
		});
		btnBoton1.setBounds(261, 83, 89, 23);
		contentPane.add(btnBoton1);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciarContadores();
			}
		});
		btnNewButton.setBounds(164, 150, 89, 23);
		contentPane.add(btnNewButton);
	}
	
	public void accionBoton1() {
		contador++;
		lblBoton1.setText(contador+" veces");
	}

	public void accionBoton2() {
		contador2 ++;
		lblBoton2.setText(contador2+" veces");
	}
	public void reiniciarContadores() {
		contador=contador2=0;
		lblBoton1.setText(null);
		lblBoton2.setText(null);
	}
}
