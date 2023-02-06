

// A random number between 0 and 9 is generated by the computer,
// A player is asked to guess the number,
// The player has 3 trials to guess the secret number correctly,
// If the player fails to guess the number after trials, exist the code and show the secret number,

import java.util.Scanner;
public class GameLauncher {
    public static void main(String[] args){
	GameLogic game = new GameLogic();
	game.startGame();
    }
}

class Player {
    int guessedNumber;
    int trials = 0;

    void chooseNumber(){
	Scanner input = new Scanner(System.in);
	System.out.print("Guess the number: ");
        guessedNumber = input.nextInt();
    }
}

class GameLogic {
    void startGame(){
	System.out.println("******STARTING GAME*******");
    	int secretNumber = (int) (Math.random() * 10); // this line generates a random number between 0 and 9;	
	System.out.println("Guess A number between 0 and 9");

	Player player = new Player();

	while (player.trials < 3){
	    player.chooseNumber();
	    player.trials = player.trials + 1;

	    if(player.guessedNumber == secretNumber){
		break;
	    }
	    else {
		System.out.println("Wrong Guess");
		if(player.guessedNumber < secretNumber){
		    System.out.println("HINT: Too low");
		}
		else if(player.guessedNumber > secretNumber) {
		    System.out.println("HINT: Too high");
		}
	    }
	}
	if(player.guessedNumber == secretNumber){
	    System.out.println("You got the secret number in" + player.trials + " trials");
	}
	else {
	    System.out.println("The secret number is: " + secretNumber);
	}
	System.out.println("******GAME ENDS*******");
    }
}