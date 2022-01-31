package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Ejercicio7 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 frame = new Ejercicio7();
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
	public Ejercicio7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][135.00][][grow]", "[][][][][][60.00]"));
		
		JLabel lblNewLabel = new JLabel("Selecciona un color");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		contentPane.add(lblNewLabel, "cell 0 0 5 1");
		
		JRadioButton rdbtnAzul = new JRadioButton("Azul");
		buttonGroup.add(rdbtnAzul);
		rdbtnAzul.setSelected(true);
		rdbtnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorear(e);
			}
		});
		contentPane.add(rdbtnAzul, "cell 2 1");
		
		panel = new JPanel();
		contentPane.add(panel, "cell 3 1 2 5,grow");
		
		JRadioButton rdbtnRojo = new JRadioButton("Rojo");
		buttonGroup.add(rdbtnRojo);
		contentPane.add(rdbtnRojo, "cell 2 2");
		rdbtnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorear(e);
			}
		});
		
		JRadioButton rdbtnVerde = new JRadioButton("Verde");
		buttonGroup.add(rdbtnVerde);
		contentPane.add(rdbtnVerde, "cell 2 3");
		rdbtnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorear(e);
			}
		});
		
		JRadioButton rdbtnMagenta = new JRadioButton("Magenta");
		buttonGroup.add(rdbtnMagenta);
		contentPane.add(rdbtnMagenta, "cell 2 4");
		rdbtnMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				colorear(e);
			}
		});
	}
	
	public void colorear(ActionEvent e) {
		if (e.getActionCommand().equals("Rojo")) {
			panel.setBackground(Color.RED);
		} else if(e.getActionCommand().equals("Rojo")) {
			panel.setBackground(Color.RED);
		} else if(e.getActionCommand().equals("Verde")) {
			panel.setBackground(Color.GREEN);
		} else {
			panel.setBackground(Color.MAGENTA);
		}
	}

}
