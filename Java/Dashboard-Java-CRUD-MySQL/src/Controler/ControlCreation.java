package Controler;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import glossaire.Lexique;
import modele.ModeleLexique;

public class ControlCreation {

	public static void cInsertion(Lexique lexique, JFrame frame) {
		if(!lexique.getMot().isEmpty() && !lexique.getDefinition().isEmpty()) {
			boolean succes = ModeleLexique.ajouterGlossaire(lexique);
			if(succes == false) {
				JOptionPane.showMessageDialog(frame, "ceci est un doublon", "Doublon", JOptionPane.ERROR_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(frame, "Bravo ceci est crée !", "succes",JOptionPane.INFORMATION_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(frame, "Ceci n'est pas valide", "Glossaire", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
}
