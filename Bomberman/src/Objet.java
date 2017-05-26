public class Objet {

  private int posX;

  private int posY;
  /** 
   *  cette methode ne fait rien, mais elle reste important puisque elle sera appellée et pour d'autres sous-classes, serai override et aura un effet (Caisse, Joueur etc)
   */
  public void detruire() {
  }

  public int getPosX() {
  return 0;
  }

  public void setPosX(int newPosX) {
  }

  public int getPosY() {
  return 0;
  }

  public void setPosY(int newPosY) {
  }

  public Objet() {
  }

}