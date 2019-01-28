package morpion;

import java.util.ArrayList;

public class equipe {

	public String nom_equipe;
	private int nb_membre = 0;
	private ArrayList<String> membres = new ArrayList<String>();

	public equipe(String nom_equipe, String membres) {

		this.nom_equipe = nom_equipe;
		this.membres.add(nb_membre, membres);
		nb_membre++;
		return;

	}

	public void ajt_membre(String nom_nv) {
		this.membres.add(nb_membre, nom_nv);
		
		return;
	}

	public void enlever_membre(String nom_supp) {

		membres.remove(nom_supp);
		
		return;
	}

	
}
