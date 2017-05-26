import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;




public class Jeu {

    private Plateau myPlateau;
    private Affichage affichage;

  public boolean collision(Objet obj1, Objet obj2) {
  return false;
  }
  
  public void afficher(){
	  affichage.afficher(myPlateau);
  }
  
  
  //ces mouvements sont temporaires, ils seront à remplacer par des inputs au clavier
  public void mouvementJoueurs(Sens sens){
	  myPlateau.getJoueurs().
	  
  }
  
  public void exploserBombes(){
	  
  }

  
  public void tour(){
	  mouvementJoueurs();
	  exploserBombes();
	  afficher();
  }
  
  public Jeu(){
	  
  }

}