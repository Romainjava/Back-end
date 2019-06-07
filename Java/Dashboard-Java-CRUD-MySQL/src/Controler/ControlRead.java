package Controler;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import glossaire.Lexique;
import modele.ModeleLexique;

public class ControlRead {

	public static void checkLexique(Lexique lexique, JFrame frame) {
		if(!lexique.getMot().isEmpty()) {
			boolean succes = ModeleLexique.read(lexique);
			if(succes == false) {
				JOptionPane.showMessageDialog(frame, "ceci est un pas dans la table", "champ", JOptionPane.ERROR_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(frame, "Bravo ceci est dans la table !", "succes",JOptionPane.INFORMATION_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(frame, "Ceci n'est pas valide", "Glossaire", JOptionPane.ERROR_MESSAGE);
		}
	}
}


