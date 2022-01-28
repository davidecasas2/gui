package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio5 extends JFrame {

	private JPanel contentPane;
	private JButton btnDerecho;
	private JButton btnCentral;
	private JButton btnIzquierdo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 frame = new Ejercicio5();
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
	public Ejercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnIzquierdo = new JButton("Deshabilitar Central");
		btnIzquierdo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deshabilitar();
			}
		});
		contentPane.add(btnIzquierdo);
		
		btnCentral = new JButton("Central");
		contentPane.add(btnCentral);
		
		btnDerecho = new JButton("Habilitar central");
		btnDerecho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				habilitar();
			}
		});
		btnDerecho.setEnabled(false);
		contentPane.add(btnDerecho);
	}
	public void deshabilitar() {
		btnCentral.setEnabled(false);
		btnDerecho.setEnabled(true);
		btnIzquierdo.setEnabled(false);
	}
	
	public void habilitar() {
		btnCentral.setEnabled(true);
		btnDerecho.setEnabled(false);
		btnIzquierdo.setEnabled(true);
	}

}
