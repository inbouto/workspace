
public class Bombe extends Case  {
	private int rayon;
	private TypeBombe type;
	private int decompte;
	
	
	
	public int getDecompte() {
		return decompte;
	}
	public void setDecompte(int decompte) {
		this.decompte = decompte;
	}
	public int getRayon() {
		return rayon;
	}
	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	public TypeBombe getType() {
		return type;
	}
	public void setType(TypeBombe type) {
		this.type = type;
	}
	
	public void exploser(){
		
	}
	
	public void detruire(){
		exploser();
	}
	
}
