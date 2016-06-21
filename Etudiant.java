import java.util.List;
import java.util.ArrayList;

public class Etudiant {

	private String nom;
	private List<Note> notes = new ArrayList<>();
	private double moyenne;

	public Etudiant(){}
	
	public Etudiant(String nom, List<Note> notes){
		this.nom = nom;
		this.notes = notes;	
		this.calculerMoyenne();
        }

	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public List<Note> getNotes(){
		return this.notes;
	}
	public void setNotes(List<Note> notes){
		this.notes = notes;
	}
	
	public double getMoyenne(){
		return this.moyenne;
	}

	public void calculerMoyenne(){
                double total = 0;
                int sommeCoefficients = 0;

                for(Note note : this.notes){
                        total += note.getValeur()*note.getCoefficient();
                        sommeCoefficients += note.getCoefficient();
                }
                this.moyenne = total/sommeCoefficients;
	}

	@Override
	public String toString(){
		System.out.println("\n\n\t" + this.nom);
		for(Note note : this.notes){
			System.out.println(note.getNomMatiere() + " : " + note.getValeur() + "\t" + note.getCoefficient());
		}
		System.out.println("moyenne : " + this.moyenne);
		String resultat = "réussite";
		if(this.moyenne < 10){
			resultat = "échec";
		}
		return resultat;
	}
	

}
