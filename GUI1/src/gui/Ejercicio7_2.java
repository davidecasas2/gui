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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ejercicio7_2 extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7_2 frame = new Ejercicio7_2();
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
	public Ejercicio7_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][135.00,grow][][grow]", "[][][][][][60.00]"));
		
		JLabel lblNewLabel = new JLabel("Selecciona un color");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 20));
		contentPane.add(lblNewLabel, "cell 0 0 5 1");
		
		JLabel lblNewLabel_1 = new JLabel("Selecciona un Color:");
		contentPane.add(lblNewLabel_1, "cell 2 1");
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				colorear();
			}
			
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Rojo", "Verde", "Magenta"}));
		contentPane.add(comboBox, "cell 2 2 3 1,growx");
		
		panel = new JPanel();
		contentPane.add(panel, "cell 2 3 3 3,grow");
	}
	
	public void colorear() {
		String color = (String) comboBox.getSelectedItem();
		if (color.equals("Rojo")) {
			panel.setBackground(Color.RED);
		} else if(color.equals("Azul")) {
			panel.setBackground(Color.BLUE);
		} else if(color.equals("Verde")) {
			panel.setBackground(Color.GREEN);
		} else {
			panel.setBackground(Color.MAGENTA);
		}
	}

}
