package sip.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTable;

public class systemaAdmin {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					systemaAdmin window = new systemaAdmin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public systemaAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton btnNewButton_2 = new JButton("Logística");
		panel.add(btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon(systemaAdmin.class.getResource("/sun/print/resources/oneside.png")));
		btnNewButton_2.setToolTipText("Acesso a tela de logística");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frame.getContentPane(), panel, btnNewButton_2, btnNewButton_1, btnNewButton, btnClientes}));
		
		JButton btnNewButton_1 = new JButton("Tecnica");
		btnNewButton_1.setToolTipText("Acesso a tela de recursos tecnicos");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Testes");
		btnNewButton.setToolTipText("Acesso a tela de recursos de testes");
		panel.add(btnNewButton);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.setToolTipText("Acesso a tela de gerenciamento de clientes");
		panel.add(btnClientes);
		
		table = new JTable();
		frame.getContentPane().add(table, BorderLayout.CENTER);
	}

}
