import java.util.Vector;

public class Plateau {

    /**
   * 
   * @element-type Joueur
   */
  public Vector<Joueur>  joueurs;
    /**
   * 
   * @element-type Flamme
   */
  public Vector<Flamme>  flammes;
    /**
   * 
   * @element-type Case
   */
  public Case[][]  cases;
  
  public Plateau(int tailleX, int tailleY, Joueur joueur) {
	  cases = new Case[tailleX][tailleY];
	  joueurs = new Vector<Joueur>();
	  joueurs.add(joueur);
	  flammes = new Vector<Flamme>();
  }

public Vector<Joueur> getJoueurs() {
	return joueurs;
}

public void setJoueurs(Vector<Joueur> joueurs) {
	this.joueurs = joueurs;
}

public Vector<Flamme> getFlammes() {
	return flammes;
}

public void setFlammes(Vector<Flamme> flammes) {
	this.flammes = flammes;
}

public Case[][] getCases() {
	return cases;
}

public void setCases(Case[][] cases) {
	this.cases = cases;
}

}