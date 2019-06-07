package glossaire;

public class Lexique {
		private int id;
		private String mot;
		private String definition;
		
		
		
		
		
		
		
		@Override
		public String toString() {
			return "Lexique [id=" + id + ", mot=" + mot + ", definition=" + definition + "]";
		}
		/************************************************************/
		/******************** ACCESSEURS   ********************/
		/************************************************************/
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMot() {
			return mot;
		}
		public void setMot(String mot) {
			this.mot = mot;
		}
		public String getDefinition() {
			return definition;
		}
		public void setDefinition(String definition) {
			this.definition = definition;
		}
		
		
		
		
		
}

