
public class GameLauncher {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}

class Player {
    int number; // the instance variable 
    
    public void guess (){
        number = (int) (Math.random() * 10);
    }
}

class GuessGame {
    public void startGame(){
    	Player player1 = new Player();
    	Player player2 = new Player();
    	Player player3 = new Player();

	int guessPlayer1 = 0;
	int guessPlayer2 = 0;
	int guessPlayer3 = 0;

	boolean player1isCorrect = false;
	boolean player2isCorrect = false;
	boolean player3isCorrect = false;

	int targetNumber = (int) (Math.random() * 10);
	System.out.println("I'm thinking of a number between 0 and 9...");

	while (true) {
	    System.out.println("Number to guess is " + targetNumber);
	    player1.guess();
	    player2.guess();
	    player3.guess();

	    guessPlayer1 = player1.number;
	    guessPlayer2 = player2.number;
	    guessPlayer3 = player3.number;

	    System.out.println("Player 1 guess: " + guessPlayer1);
	    System.out.println("Player 2 guess: " + guessPlayer2);
	    System.out.println("Player 3 guess: " + guessPlayer3);

	    if (guessPlayer1 == targetNumber) {
		    player1isCorrect = true;
	    }
	    if (guessPlayer2 == targetNumber) {
		    player2isCorrect = true;
	    }
	    if (guessPlayer3 == targetNumber) {
		    player3isCorrect = true;
	    }

	    if(player1isCorrect || player2isCorrect || player3isCorrect){
            System.out.println("We have a winner!");
            System.out.println("Player one got it right? " + player1isCorrect);
            System.out.println("Player two got it right? " + player2isCorrect);
            System.out.println("Player three got it right? " + player3isCorrect);
            System.out.println("Game is over.");
            break;
	    }
	    else {
		    System.out.println("Players will have to try again.");
	    }
	}
    }
}
