public class Note {

	private String nomMatiere;
	private double valeur;
	private int coefficient;

	public Note(){}
	
	public Note(String nomMatiere, double valeur, int coefficient){
		this.nomMatiere = nomMatiere;
		this.valeur = valeur;
		this.coefficient = coefficient;
	}

	public String getNomMatiere(){
		return this.nomMatiere;
	}
	public void setNomMatiere(String nomMatiere){
		this.nomMatiere = nomMatiere;
	}

	public double getValeur(){
		return this.valeur;
	}
	public void setValeur(double valeur){
		this.valeur = valeur;
	}

	public int getCoefficient(){
		return this.coefficient;
	}
	public void setCoefficient(int coefficient){
		this.coefficient = coefficient;
	}

}
