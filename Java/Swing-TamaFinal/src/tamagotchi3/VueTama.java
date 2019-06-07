package tamagotchi3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JToggleButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextArea;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VueTama {
	JLabel labelImage = new JLabel("");
	JLabel labelNom = new JLabel("...");
	JTextArea textArea = new JTextArea();
	JPanel gameOverWindows = new JPanel();
	JButton btnDmarerLeJeux = new JButton("Démarer le jeux");
	
	private JFrame frame;
	
	public void cacherPane() {
		gameOverWindows.setVisible(false);
		btnDmarerLeJeux.setVisible(true);
	}

	//Methode game over//
	public void gameOver() {
		tama.checkStatus();
		if(tama.isVie() == false) {			
			cacherPane();
			textArea.setText("La mort");
			JOptionPane.showMessageDialog(frame, "mort", "La Mort", JOptionPane.ERROR_MESSAGE);
		}
	
	}
	//methode pour afficher les images
	public  ImageIcon image(String name) {		
		ImageIcon regis = new ImageIcon(getClass().getResource("/tamagotchi3/"+name+".gif"));
		System.out.println(regis);
		return regis;
	}

	Tamagotchi tama = new Tamagotchi(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueTama window = new VueTama();
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
	public VueTama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JInternalFrame jframeStatus = new JInternalFrame("Status ");
		jframeStatus.setAutoscrolls(true);
		
	
		
		
		/******************/
		/*****Bouton*******/
		/******************/
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Status");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tglbtnNewToggleButton.isSelected()) {
					jframeStatus.setVisible(true);
					/****** permet d'ajouter et de mettre a jour ***
					 ***  toString grace à setText ********/
					textArea.setText(tama.toString());
				}else {
					jframeStatus.setVisible(false);
				}
			
			}
		});
		tglbtnNewToggleButton.setBounds(12, 456, 105, 102);
		
		frame.getContentPane().add(tglbtnNewToggleButton);
		jframeStatus.setBounds(125, 456, 663, 102);
		frame.getContentPane().add(jframeStatus);
		jframeStatus.getContentPane().setLayout(null);
		
		textArea.addContainerListener(new ContainerAdapter() {
		});
		textArea.setBounds(0, 0, 666, 70);
		jframeStatus.getContentPane().add(textArea);
		
	
		
		
		
		btnDmarerLeJeux.addActionListener(new ActionListener() {
			
			/**********METHOD DE LANCEMENT ***************/
			/********************************************/
			public void actionPerformed(ActionEvent e) {
				String nom =JOptionPane.showInputDialog(frame, "Comment il s'appelle", "Eclosion", JOptionPane.QUESTION_MESSAGE);
				tama.eclosion();
				gameOverWindows.setVisible(true);
				tama.setNom(nom);
				labelNom.setText(nom);
				labelImage.setIcon(image("eclore"));
				textArea.setText(tama.toString());
				btnDmarerLeJeux.setVisible(false);
				tama.checkStatus();
				
			
			}
		});
		btnDmarerLeJeux.setBounds(167, 0, 465, 38);
		
		/******************/
		/*******END********/
		/******************/
		
		
		labelImage.setBounds(135, 39, 478, 433);
		frame.getContentPane().add(labelImage);
		frame.getContentPane().add(btnDmarerLeJeux);
		labelNom.setBounds(650, 12, 70, 15);
		frame.getContentPane().add(labelNom);
		
		
		gameOverWindows.setAutoscrolls(true);
		gameOverWindows.setBounds(671, 60, 136, 188);
		frame.getContentPane().add(gameOverWindows);
		gameOverWindows.setLayout(null);
		JButton manger = new JButton("Manger");
		manger.setBounds(0, 15, 112, 25);
		gameOverWindows.add(manger);
		JButton dormir = new JButton("Dormir");
		dormir.setBounds(0, 52, 112, 25);
		gameOverWindows.add(dormir);
		
			JButton jeux = new JButton("Jeux");
			jeux.setBounds(0, 89, 112, 25);
			gameOverWindows.add(jeux);
			JButton douche = new JButton("Douche");
			douche.setBounds(0, 126, 111, 25);
			gameOverWindows.add(douche);
			JButton sport = new JButton("Sport");
			sport.setBounds(0, 163, 112, 25);
			gameOverWindows.add(sport);
			
			/**********METHOD ACTIVITE ************/
			/**********SPORT *********************/
			sport.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tama.activiteSportive();
					textArea.setText(tama.toString());
					tama.checkStatus();
					
					
				}
			});
			/**********METHOD ACTIVITE ************/
			/**********DOUCHE *********************/
			douche.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tama.douche();
					textArea.setText(tama.toString());
				}
			});
			/**********METHOD ACTIVITE ************/
			/**********JEUX *********************/
			jeux.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tama.jeux();
					textArea.setText(tama.toString());
				}
			});
			/**********METHOD ACTIVITE ************/
			/**********DORMIR *********************/
			
		dormir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tama.dormir();
				textArea.setText(tama.toString());
			}
		});
		/**********METHOD ACTIVITE ************/
		/**********MANGER *********************/
		manger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameOver();
				tama.manger();
				textArea.setText(tama.toString());
				
			}
		});
		
		jframeStatus.setVisible(false);
	}
	
	/***************************************/
	/*******JE SAIS PAS CE QUE C'EST********/
	/***************************************/
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
