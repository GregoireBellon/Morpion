package morpion;

public class croix {
	
	public static int nb_points;
	public equipe equipe;
	private int[] position = new int[2];
	
	croix(int x, int y) {
		
		if(x<1 || x>3) {
			return;
		}
		if(y<1 || y>3) {
			return;
		}
		
		position[0]=x; //position de x
		position[1]=y; //position de y
		nb_points++;  
	}
	
	
	
}
