import java.util.Vector;

public class Joueur implements Destruction {

  private int posX;

  private int posY;

  private int vitesse;

  private int nbBombes;

  private int vies;
  
  private Vector<Bombe> bombes;
  
  private int decompteBombes;

  
  

  public Vector<Bombe> getBombes() {
	return bombes;
}

public void setBombes(Vector<Bombe> bombes) {
	this.bombes = bombes;
}

public int getDecompteBombes() {
	return decompteBombes;
}

public void setDecompteBombes(int decompteBombes) {
	this.decompteBombes = decompteBombes;
}

public int getPosX() {
	return posX;
}

public void setPosX(int posX) {
	this.posX = posX;
}

public int getPosY() {
	return posY;
}

public void setPosY(int posY) {
	this.posY = posY;
}

public int getVitesse() {
	return vitesse;
}

public void setVitesse(int vitesse) {
	this.vitesse = vitesse;
}

public int getNbBombes() {
	return nbBombes;
}

public void setNbBombes(int nbBombes) {
	this.nbBombes = nbBombes;
}

public int getVies() {
	return vies;
}

public void setVies(int vies) {
	this.vies = vies;
}

public void detruire() {
	vies--;
  }

  public Joueur() {
	  vitesse = 1;
	  posX = 0;
	  posY = 0;
	  nbBombes = 0;
	  vies = 1;
  }

  
  public void deplacement(Sens sens){
	  switch(sens) {
	  case Haut:
		  posY += vitesse;
		  break;
	  case Bas :
		  posY -= vitesse;
		  break;
	  case Gauche :
		  posX -= vitesse;
		  break;
	  case Droite :
		  posX += vitesse;
		  break;
	  }
  }
  
  
}