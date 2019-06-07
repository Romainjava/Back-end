package vueBDD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import modele.Modele;
import modele.ModeleLexique;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

import Controler.ControlCreation;
import Controler.ControlDelete;
import Controler.ControlRead;
import Controler.ControlUpdate;
import glossaire.Lexique;

public class VueGlossaire {

	private JFrame frame;
	JPanel Create = new JPanel();
	JPanel Read = new JPanel();
	JPanel Update = new JPanel();
	JPanel Delete = new JPanel();
	Modele model = new Modele();
	JTextPane textPane = new JTextPane();
	JLabel lblDefinition = new JLabel("Definition");
	Lexique lexique = new Lexique();
	


	private JTextField textField;
	private JTextField textField_1;
	private final JButton btnOk = new JButton("OK");
	private JTextField textFieldSetMot;
	private JTextField textFieldMotSearch;
	private JTextField textFieldDeleteMot;
	private JTextField textFieldDeleteAfficheMot;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueGlossaire window = new VueGlossaire();
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
	public VueGlossaire() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 0, 800, 600);
		frame.getContentPane().add(tabbedPane);
		
		/*********** ONGLET 1 ***************/
		tabbedPane.addTab("Create", null, Create, null);


		JButton btnConnexion = new JButton("OK");
		btnConnexion.setBounds(378, 499, 117, 25);
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lexique.setMot(textField.getText()); // récup du champ mot
				lexique.setDefinition(textPane.getText());//recup info 
				ControlCreation.cInsertion(lexique, frame);
			}
		});
		Create.setLayout(null);
		Create.add(btnConnexion);

		textField = new JTextField();
		textField.setBounds(294, 142, 240, 65);
		Create.add(textField);

		textField.setColumns(10);

		JLabel lblMot = new JLabel("Mot");
		lblMot.setBounds(379, 115, 70, 15);
		Create.add(lblMot);


		textPane.setBounds(216, 292, 440, 180);
		Create.add(textPane);


		lblDefinition.setBounds(352, 238, 155, 42);
		Create.add(lblDefinition);
		tabbedPane.addTab("Read", null, Read, null);
		Read.setLayout(null);

		textField_1 = new JTextField();
		textField_1.setBounds(245, 127, 232, 89);
		Read.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel = new JLabel("Recherche");
		lblNewLabel.setBounds(305, 85, 148, 30);
		Read.add(lblNewLabel);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(149, 277, 489, 238);
		Read.add(textPane_1);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lexique.setMot(textField_1.getText());
				// donc je set la valeur de textfield par ex: SQL_BETWEEN pour pouvoir rechercher
				ControlRead.checkLexique(lexique, frame);
				// J'appel ma methode read qui gere ma requête sql
				textPane_1.setText(lexique.getDefinition());
				//Je set dans textpane1 la definition du mot récupéré

			}
		});
		btnOk.setBounds(305, 228, 117, 25);
		Read.add(btnOk);
		
		/*********** ONGLET 3 ***************/
		tabbedPane.addTab("Update", null, Update, null);
		Update.setLayout(null);
		
		JTextPane textPaneSetDefinition = new JTextPane();
		
		textFieldMotSearch = new JTextField();
		textFieldMotSearch.setText("SQL_BETWEEN");
		textFieldMotSearch.setBounds(303, 91, 114, 19);
		Update.add(textFieldMotSearch);
		textFieldMotSearch.setColumns(10);
		
		JLabel lblUpdate = new JLabel("Mot à modifier");
		lblUpdate.setBounds(303, 43, 105, 36);
		Update.add(lblUpdate);
		
		JLabel lblMotModifier = new JLabel("modifier");
		lblMotModifier.setBounds(294, 173, 147, 40);
		Update.add(lblMotModifier);
		
		JButton btnOk_1 = new JButton("OK");
		btnOk_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lexique.setMot(textFieldMotSearch.getText());
				ControlRead.checkLexique(lexique, frame);
				System.out.println(lexique);
				textFieldSetMot.setText(lexique.getMot());
				textPaneSetDefinition.setText(lexique.getDefinition());
				
			}
		});
		btnOk_1.setBounds(291, 139, 117, 25);
		Update.add(btnOk_1);
		
		textFieldSetMot = new JTextField();
		textFieldSetMot.setBounds(281, 225, 147, 25);
		Update.add(textFieldSetMot);
		textFieldSetMot.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(294, 262, 129, 38);
		Update.add(lblDescription);
		
		
		textPaneSetDefinition.setBounds(245, 326, 246, 93);
		Update.add(textPaneSetDefinition);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lexique.setMot(textFieldSetMot.getText()); // nouveau mot a changer
				lexique.setDefinition(textPaneSetDefinition.getText());
				ControlUpdate.updateMot(lexique, frame);
				//textFieldSetMot.setText(lexique.getMot());
				//textPaneSetDefinition.setText(lexique.getDefinition());
				
			}
		});
		btnValider.setBounds(294, 475, 117, 25);
		Update.add(btnValider);
		
		
		/*********** ONGLET 4 ***************/
		JTextPane textPaneDeleteDefinition = new JTextPane();
		
		tabbedPane.addTab("Delete", null, Delete, null);
		Delete.setLayout(null);
		
		textFieldDeleteMot = new JTextField();
		textFieldDeleteMot.setBounds(320, 110, 175, 25);
		Delete.add(textFieldDeleteMot);
		textFieldDeleteMot.setColumns(10);
		
		JLabel lblMotDelete = new JLabel("Mot à DELETE");
		lblMotDelete.setBounds(348, 67, 122, 37);
		Delete.add(lblMotDelete);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lexique.setMot(textFieldDeleteMot.getText());
				//PERMET DE METTRE EN INFORMATION DANS LEXIQUE LE MOT DE LA BASE DE DONNE
				ControlRead.checkLexique(lexique, frame);
				textFieldDeleteAfficheMot.setText(lexique.getMot());
				textPaneDeleteDefinition.setText(lexique.getDefinition());
				// JE SET LES INFORMATION RECUPERER EN AMONT PAR LEXIQUE DANS 
				// TEXTFIELD ET TEXTPANE (sachant que le mot est lié à sa définition dans le ModelLexique)
			}
		});
		btnSearch.setBounds(348, 150, 117, 25);
		Delete.add(btnSearch);
		
		textFieldDeleteAfficheMot = new JTextField();
		textFieldDeleteAfficheMot.setBounds(320, 195, 175, 30);
		Delete.add(textFieldDeleteAfficheMot);
		textFieldDeleteAfficheMot.setColumns(10);
		
		
		textPaneDeleteDefinition.setBounds(233, 259, 382, 148);
		Delete.add(textPaneDeleteDefinition);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lexique.setMot(textFieldDeleteAfficheMot.getText());
				//lexique.setDefinition(textPaneDeleteDefinition.getText());
				ControlDelete.deleteMot(lexique, frame);
			}
		});
		btnDelete.setBounds(348, 455, 117, 25);
		Delete.add(btnDelete);
	}
}
