package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaDesplegable extends JFrame {

	private JPanel contentPane;
	private JComboBox comboIdioma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaDesplegable frame = new ListaDesplegable();
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
	public ListaDesplegable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow]", "[][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Idioma");
		contentPane.add(lblNewLabel, "cell 1 1");
		
		comboIdioma = new JComboBox();
		comboIdioma.setModel(new DefaultComboBoxModel(new String[] {"Seleccione el idioma", "Espa\u00F1ol", "Ingl\u00E9s", "Alem\u00E1n", "Franc\u00E9s"}));
		contentPane.add(comboIdioma, "cell 2 2,growx");
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboIdioma.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(null, "Debe seleccionar un idioma");
				} else {
					String resultado = (String) comboIdioma.getSelectedItem();
					JOptionPane.showMessageDialog(null,"Has seleccionado el idooma "+resultado);
				}
			}
		});
		contentPane.add(btnNewButton, "cell 0 4 3 1,alignx center,aligny center");
	}

}
