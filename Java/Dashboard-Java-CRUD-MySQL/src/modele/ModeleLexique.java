package modele;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import glossaire.Lexique;

public class ModeleLexique extends Modele {

	public static boolean update(Lexique lexique) {
		boolean succes = false;
		try {
			Connection connexion = startConnection();
			String query = "UPDATE lexique SET mot=?, definition=? WHERE id=?";
			PreparedStatement declaration = (PreparedStatement) connexion.prepareStatement(query);
			//OBJET POUR SE SIMPLIFIER LA TACHE SUR LES REQUETES 
			declaration.setString(1, lexique.getMot());
			declaration.setString(2, lexique.getDefinition());
			declaration.setInt(3, lexique.getId());
//			String query = "UPDATE lexique SET mot= "+'"'+lexique.getMot()+'"'+ ", definition= "+'"'+ lexique.getDefinition() +'"'
//					+"  WHERE id =  " + lexique.getId() ;
//			System.out.println(lexique.getId());
			//ADIEU LES LIGNES CHIANTES COMME CA
			int resultat = declaration.executeUpdate();
			succes =  (resultat == 1);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return succes;
	}
	
	public static boolean delete(Lexique lexique) {
		boolean succes = false;
		try {
		Connection connexion = startConnection();
		String query = "DELETE FROM lexique WHERE id =?" ;
		PreparedStatement declaration = (PreparedStatement) connexion.prepareStatement(query);
		declaration.setInt(1, lexique.getId());
		
		int resultat = declaration.executeUpdate();
		succes = (resultat == 1);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return succes;
	}
	
	public static boolean read(Lexique lexique) {
		boolean succes = false;
		try {
			Connection connexion = startConnection();

			Statement declaration = (Statement) connexion.createStatement();

			String query = "SELECT id, definition FROM lexique WHERE mot= "+'"'+lexique.getMot()+'"';
			ResultSet resultat = declaration.executeQuery(query);
			if(resultat.next()) {
				lexique.setDefinition(resultat.getString("definition"));
				lexique.setId(resultat.getInt("id"));
				succes = true;
			}

		} catch (SQLException e) {

		}return succes;
	}

	public static void afficheGlossaire() {
		try {

			/* Création de la connexion*/
			Connection connexion = startConnection();

			/* Création de l'objet gérant les requêtes */
			Statement declaration = (Statement) connexion.createStatement();

			/* Requete */
			String query = "SELECT id, mot, definition FROM lexique;"; //ici ajout

			/* Exécution d'une requête de lecture */
			ResultSet resultat = declaration.executeQuery(query);

			/* Récupération des données */ 
			while (resultat.next()) {
				Object[] row = new Object[]{
						resultat.getInt("id"), 
						resultat.getString("mot"),
						resultat.getString("definition") // ici ajout
				};
				System.out.println(Arrays.toString(row));

			}

			/* fermeture du resultatSet */
			resultat.close();
			/* fermeture de la connexion */ 
			closeConnection(connexion);

		} catch (SQLException e) {
			System.err.println(
					"Erreur d'affichage des catégories: " + e.getMessage()
					);
		}
	}

	/**
	 * Ajout d'un catégorie
	 *
	 * @param nom
	 */
	public static boolean ajouterGlossaire(Lexique lexique) {
		boolean succes = false;
		try {
			/* Création de la connexion */
			Connection co = startConnection();

			/* Création de l'objet gérant les requetes */
			Statement declaration = (Statement) co.createStatement();

			/* Requete */
			String query = "INSERT IGNORE INTO lexique ( mot , definition) VALUES ('" + lexique.getMot() + "' , '"+ lexique.getDefinition() +"')";

			/* Execution d'une requete en écriture */
			int executeUpdate = declaration.executeUpdate(query);

			/* Traitement de l'insertion */
			if (executeUpdate == 1) {
				System.out.println("Insertion dans lexique effectuée ! ");
				succes = true;
			} else {
				System.out.println("Insertion dans lexique non effectuée.");

			}

			/* Fermeture de la connexion */
			closeConnection(co);
		} catch (SQLException e) {
			System.err.println("Erreur d'insertion d'une glossaire " + e.getMessage());
		}
		return succes;
	}

	/**
	 * Supression d'une glossaire en précisant l'id
	 *
	 * @param id
	 */
	public static void supprimerGlossaire(int id) {
		try {
			/* Création de la connexion */
			Connection co = startConnection();
			/* Création de l'objet gérant les requetes */
			Statement declaration = (Statement) co.createStatement();

			/* Requete */
			String query = "DELETE FROM lexique WHERE id = " + id;

			/* Execution d'une requete en écriture */
			int executeUpdate = declaration.executeUpdate(query);

			/* Traitement de l'insertion */
			if (executeUpdate == 1) {
				System.out.println("Suppression de la lexique effectuée ! ");
			} else {
				System.out.println("Suppression de la catégorie non effectuée.");
			}

			/* Fermeture de la connexion */
			closeConnection(co);
		} catch (SQLException e) {
			System.err.println("Erreur de suppression d'une catégorie " + e.getMessage());
		}
	}
}
