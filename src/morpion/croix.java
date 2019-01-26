package morpion;

public class croix {
	
	public static int nb_points;
	public equipe equipe;
	private int[] position = new int[2];
	
	croix(equipe eq) {
		nb_points++;
		equipe = eq;
	}

	public equipe getEquipe() {
		return equipe;
	}
	
	
	
	
}
