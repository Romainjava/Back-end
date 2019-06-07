package Controler;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import glossaire.Lexique;
import modele.ModeleLexique;

public class ControlUpdate {

	public static void updateMot(Lexique lexique, JFrame frame) {
		if(!lexique.getMot().isEmpty() && !lexique.getDefinition().isEmpty()) {
			boolean succes = ModeleLexique.update(lexique);
			if(succes == false) {
				JOptionPane.showMessageDialog(frame, "ceci n'est un pas dans la table", "champ", JOptionPane.ERROR_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(frame, "Bravo !", "succes",JOptionPane.INFORMATION_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(frame, "Ceci n'est pas valide", "Glossaire", JOptionPane.ERROR_MESSAGE);
		}
	}
}
