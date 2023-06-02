package aula8;

public class TestaGame {

	public static void main(String[] args) {
		
		System.out.print("Game 1, ");
		Game game1 = new Game("The Last of US", 50.0, 2, 5, 4.8f);
		game1.visualiza();
		
		System.out.print("\nGame 2, ");
		Game game2 = new Game("God of War", 75.0, 1, 17, 4.9f);
		game2.visualiza();
	}

}
