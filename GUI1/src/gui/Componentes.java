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
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Componentes extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup sexoGroup = new ButtonGroup();
	private final ButtonGroup idiomaGroup = new ButtonGroup();
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnFrances;
	private JRadioButton rdbtnEspañol;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnIngles;
	private JRadioButton rdbtnAleman;
	private JRadioButton rdbtnPrefiero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Componentes frame = new Componentes();
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
	public Componentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][]", "[][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Sexo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 1 1");
		
		JLabel lblNewLabel_1 = new JLabel("Idioma");
		contentPane.add(lblNewLabel_1, "cell 4 1");
		
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setSelected(true);
		sexoGroup.add(rdbtnHombre);
		contentPane.add(rdbtnHombre, "cell 2 2");
		
		rdbtnEspañol = new JRadioButton("Espa\u00F1ol");
		rdbtnEspañol.setSelected(true);
		idiomaGroup.add(rdbtnEspañol);
		contentPane.add(rdbtnEspañol, "cell 5 2");
		
		rdbtnFrances = new JRadioButton("Franc\u00E9s");
		idiomaGroup.add(rdbtnFrances);
		contentPane.add(rdbtnFrances, "cell 6 2");
		
		rdbtnMujer = new JRadioButton("Mujer");
		sexoGroup.add(rdbtnMujer);
		contentPane.add(rdbtnMujer, "cell 2 3");
		
		rdbtnIngles = new JRadioButton("Ingl\u00E9s");
		idiomaGroup.add(rdbtnIngles);
		contentPane.add(rdbtnIngles, "cell 5 3");
		
		rdbtnAleman = new JRadioButton("Alem\u00E1n");
		idiomaGroup.add(rdbtnAleman);
		contentPane.add(rdbtnAleman, "cell 6 3");
		
		rdbtnPrefiero = new JRadioButton("Prefiero no decirlo");
		sexoGroup.add(rdbtnPrefiero);
		contentPane.add(rdbtnPrefiero, "cell 2 4");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sexo=null;
				String idioma=null;
				if (rdbtnHombre.isSelected()) {
					sexo="Hombre";
				} else if (rdbtnMujer.isSelected()) {
					sexo="Mujer";
				} else if (rdbtnPrefiero.isSelected()) {
					sexo="Prefiero no decirlo";
				}
				
				if (rdbtnEspañol.isSelected()) {
					idioma="Español";
				} else if (rdbtnIngles.isSelected()) {
					idioma="Inglés";
				} else if (rdbtnFrances.isSelected()) {
					idioma="Francés";
				} else if (rdbtnAleman.isSelected()) {
					idioma = "Alemán";
				}
				
				JOptionPane.showMessageDialog(null, "Has seleccionado el sexo "+sexo+ " y el idioma "+idioma);
			}
		});
		contentPane.add(btnAceptar, "cell 2 8 4 1,alignx center");
	}

}
