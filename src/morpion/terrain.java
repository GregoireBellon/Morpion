package morpion;

public class terrain {
	
	private equipe win;
	final public int TAILLE = 3; //longueur ou largeur du terrain
	
	private Case[][] Cases = new Case[TAILLE][TAILLE]; //il y a taille² cases sur le terrain
	
	terrain(){
		
	}
	
	public boolean winstatus() {
		int i, j;
		for(i=0; i<TAILLE; i++) {
			int count=0;
			String last="";
			for(j=0;j<TAILLE; j++) {
				
				if (Cases[i][j].equipeCase().nom_equipe=="") {
					count=1;
					last="";
				}
				else {
					if(!last.equals(Cases[i][j].equipeCase().nom_equipe)) { //Si dernière équipe est différente de celle actuelle...
						last=Cases[i][j].equipeCase().nom_equipe; //dernière équipe = equipe actuelle
						count=1; //retour au count 1
					}
					if(last.equals(Cases[i][j].equipeCase().nom_equipe)) { //si même équipe qu'avant...
				
					count++; //count++
					
				}
					}
				
			}
			if(count==3) {
				win= Cases[i][j].equipeCase(); //si 3* la même équipe de suite, alors elle est déclarée comme gagnante
				return true; //victoire déclarée
			
			}
		}
		for(i=0; i<TAILLE; i++) {
			int count=0;
			String last="";
			for(j=0;j<TAILLE; j++) {
				
				if (Cases[j][i].equipeCase().nom_equipe=="") {
					count=1;
					last="";
				}
				else {
					if(!last.equals(Cases[i][j].equipeCase().nom_equipe)) {
						last=Cases[i][j].equipeCase().nom_equipe;
						
					}
					if(last.equals(Cases[i][j].equipeCase().nom_equipe)) {
				
					count++;
					
				}
					}
				
			}
			if(count==3) {
				win= Cases[j][i].equipeCase(); //si 3* la même équipe de suite, alors elle est déclarée comme gagnante
				return true; //victoire déclarée
			}
		
		}
		return false;
	}
	
}