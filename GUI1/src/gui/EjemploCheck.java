package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjemploCheck extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxSQL;
	private JCheckBox chckbxJava;
	private JCheckBox chckbxC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploCheck frame = new EjemploCheck();
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
	public EjemploCheck() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[41.00][]", "[][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Selecciona los lenguajes de programacion que conozcas");
		contentPane.add(lblNewLabel, "cell 0 1 2 1");
		
		chckbxSQL = new JCheckBox("SQL");
		contentPane.add(chckbxSQL, "cell 1 2");
		
		chckbxJava = new JCheckBox("Java");
		contentPane.add(chckbxJava, "cell 1 3");
		
		chckbxC = new JCheckBox("C++");
		contentPane.add(chckbxC, "cell 1 4");
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje="Has seleccioando: ";
				if (chckbxSQL.isSelected()) {
					mensaje = mensaje + " SQL";
				} 
				if (chckbxJava.isSelected()) {
					mensaje = mensaje + " Java";
				} 
				if (chckbxC.isSelected()) {
					mensaje = mensaje + " C++";
				} 
				JOptionPane.showMessageDialog(null, mensaje);
			}
		});
		contentPane.add(btnNewButton, "cell 1 5,alignx center");
	}

}
