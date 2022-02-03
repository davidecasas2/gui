package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import modelo.Contacto;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agenda extends JFrame {

	private JPanel contentPane;
	private JTable tablaContactos;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private ArrayList<Contacto> listaContactos;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
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
	public Agenda() {
		listaContactos = new ArrayList<Contacto>();
		setTitle("Agenda de contactos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[285.00,grow][grow][grow]", "[][grow][][grow][][grow][][grow][][grow][]"));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 0 1 11,grow");
		
		tablaContactos = new JTable();
		scrollPane.setViewportView(tablaContactos);
		tablaContactos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Tel\u00E9fono"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		contentPane.add(lblNewLabel, "cell 1 2,alignx trailing");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 2 2,growx");
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tel\u00E9fono: ");
		contentPane.add(lblNewLabel_1, "cell 1 4,alignx trailing");
		
		txtTelefono = new JTextField();
		contentPane.add(txtTelefono, "cell 2 4,growx");
		txtTelefono.setColumns(10);
		
		JButton btnNewButton = new JButton("A\u00F1adir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertarContacto();
				limpiarCampos();
				mostrarDatos();
			}
		});
		contentPane.add(btnNewButton, "cell 2 6,alignx center,aligny center");
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarContacto();
			}
		});
		contentPane.add(btnNewButton_1, "cell 2 8,alignx center,aligny center");
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnNewButton_2, "cell 2 10,alignx center,aligny center");
	}

	protected void eliminarContacto() {
		int indice = tablaContactos.getSelectedRow();
		modelo = (DefaultTableModel) tablaContactos.getModel();
		modelo.removeRow(indice);
		listaContactos.remove(indice);
	}

	protected void insertarContacto() {
		/*Contacto c = new Contacto();
		
		c.setNombre(txtNombre.getText());
		c.setTelefono(txtTelefono.getText());*/
		
		Contacto c = new Contacto(txtNombre.getText(),txtTelefono.getText());
		
		if (!listaContactos.contains(c))
			listaContactos.add(c);
		else 
			JOptionPane.showMessageDialog(null, "YA existe un contacto con ese telefono");
		
		
	}
	
	protected void mostrarDatos() {
		modelo = (DefaultTableModel) tablaContactos.getModel();
		
		modelo.setRowCount(0);
		for (Contacto contacto : listaContactos) {
			Object fila [] = {
					contacto.getNombre(),
					contacto.getTelefono()
			};
			modelo.addRow(fila);
		}
	}
	
	protected void limpiarCampos() {
		txtNombre.setText(null);
		txtTelefono.setText(null);
	}

}
