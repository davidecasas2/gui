package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Ejercicio6_2 extends JFrame {

	private JPanel contentPane;
	private final JCheckBox cbxCocina = new JCheckBox("Cocina");
	private JTextArea txtResultado;
	private JCheckBox cbxTecnologia;
	private JCheckBox cbxDeportes;
	private JCheckBox cbxJuegos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio6_2 frame = new Ejercicio6_2();
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
	public Ejercicio6_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[25.00][][][][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Hobbies:");
		contentPane.add(lblNewLabel, "cell 0 1");
		
		JLabel lblNewLabel_1 = new JLabel("Has seleccionado:");
		contentPane.add(lblNewLabel_1, "cell 3 1 2 1");
		
		cbxDeportes = new JCheckBox("Deportes");
		cbxDeportes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				rellenarTexto();
			}
		});
		contentPane.add(cbxDeportes, "cell 1 2");
		
		txtResultado = new JTextArea();
		txtResultado.setEditable(false);
		contentPane.add(txtResultado, "cell 4 2 1 4,grow");
		
		cbxTecnologia = new JCheckBox("Tecnolog\u00EDa");
		cbxTecnologia.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				rellenarTexto();
			}
		});
		contentPane.add(cbxTecnologia, "cell 1 3");
		
		cbxJuegos = new JCheckBox("Juegos");
		cbxJuegos.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				rellenarTexto();
			}
		});
		cbxCocina.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				rellenarTexto();
			}
		});
		contentPane.add(cbxJuegos, "cell 1 4");
		contentPane.add(cbxCocina, "cell 1 5");
	}
	public void rellenarTexto() {
		txtResultado.setText(null);
		if (cbxDeportes.isSelected()) {
			txtResultado.setText(txtResultado.getText()+ cbxDeportes.getActionCommand()+System.lineSeparator());
		}
		if (cbxTecnologia.isSelected()) {
			txtResultado.setText(txtResultado.getText()+ cbxTecnologia.getActionCommand()+"\n");
		}
		if (cbxJuegos.isSelected()) {
			txtResultado.setText(txtResultado.getText()+cbxJuegos.getActionCommand()+ "\n");
		}
		if (cbxCocina.isSelected()) {
			txtResultado.setText(txtResultado.getText()+ cbxCocina.getActionCommand()+"\n");
		}
	}

}
