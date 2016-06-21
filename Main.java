import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean stopperMatiere = true;
		boolean stopperEtudiant = true;
		List<Etudiant> etudiants = new ArrayList<>();

		System.out.println("\nBienvenue. veuillez entrer un etudiant, ses matières et ses notes par matière.");

		do{
			List<Note> matieres = new ArrayList<>();
			System.out.println("entrez le nom de l'étudiant: ");
			String nomEtudiant = sc.nextLine();

			do{
				System.out.println("entrez le nom de la matière: ");
				String nomMatiere = sc.nextLine();
				System.out.println("entrez la note obtenue dans cette matière: ");
				double NoteMatiere = sc.nextDouble();
				System.out.println("entrez le coefficient de la matière: ");
				int coefficientMatiere = sc.nextInt();
				Note matiere = new Note(nomMatiere, NoteMatiere, coefficientMatiere);
				matieres.add(matiere);
				sc.nextLine();
				System.out.println("voulez vous entrer une nouvelle matière?  (y pour oui et n'importe quel autre lettre pour non) ");
				String reponseMatiere = sc.nextLine();
				stopperMatiere = true;
				if(!reponseMatiere.equals("y")){
					stopperMatiere = false;
				}
				
			}while(stopperMatiere == true);

			Etudiant etudiant = new Etudiant(nomEtudiant, matieres);
			etudiants.add(etudiant);
			System.out.println("voulez vous entrer un nouvel étudiant?  (y pour oui et n'importe quel autre lettre pour non) ");
                        String reponseEtudiant = sc.nextLine();
			stopperEtudiant = true;		
                        if(!reponseEtudiant.equals("y")){
          	              stopperEtudiant = false;
                        }

		}while(stopperEtudiant == true);
		
		System.out.println("les etudiants que vous avez entré ont les suivants: ");
		//test pour git
		for(Etudiant etudiant : etudiants){
			etudiant.toString();
		}
	}


}
