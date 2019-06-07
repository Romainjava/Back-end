package Controler;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import glossaire.Lexique;
import modele.ModeleLexique;

public class ControlDelete {

	public static void deleteMot(Lexique lexique, JFrame frame) {
		if(!lexique.getMot().isEmpty() && !lexique.getDefinition().isEmpty()) {
			boolean succes = ModeleLexique.delete(lexique);
			if(succes == false) {
				JOptionPane.showMessageDialog(frame, "ceci n'est un pas dans la table, ou déjà supprimer", "champ", JOptionPane.ERROR_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(frame, "Bravo ceci est Delete !", "succes",JOptionPane.INFORMATION_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(frame, "Ceci n'est pas une action valide", "Glossaire", JOptionPane.ERROR_MESSAGE);
		}
	}
}
