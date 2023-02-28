// Casey Sova 10/14/2022
// Week 7 Homework
// Using overloaded constructors, overloaded methods, and random number generation,
// program a game of rock paper scissors between the user and a computer player.

// The following is the needed import statement for the Scanner method.
import java.util.Scanner;

public class RPSDriver {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
// The following welcomes the user to the program.        
        System.out.println("Welcome to Rock Paper Scissors\n");
        
// The following prompts the user for their play; either rock, paper, or scissors.
// The value is stored in the string field 'playerPlay'.
        System.out.print("Type rock, paper, or scissors: ");
        String playerPlay = scanner.next();
        
// The following is the instantiation of two Player objects, one representing the 'player'
// and the other representing the 'computer'. The 'player' object uses the 1-argument 
// constructor, and passes in the value of 'playerPlay'. The 'computer' object uses 
// the no-argument constructor. 
        Player player = new Player(playerPlay);
        Player computer = new Player();
        
// The following displays both the players' play and the computers' play by calling 
// the 'toString' method. 
        System.out.printf("\nYou played: %s", player.toString());
        System.out.printf("\nComputer played: %s", computer.toString());
        
// If both the player and computer played rock, the game ends in a tie.        
        if (player.toString().equalsIgnoreCase("rock") && computer.toString().equalsIgnoreCase("rock")) {
            System.out.print("\n\nIt's a tie!"); 
        }  
// If the player plays rock and the computer plays paper, the computer wins.        
        else if (player.toString().equalsIgnoreCase("rock") && computer.toString().equalsIgnoreCase("paper")) {
            System.out.print("\n\nComputer wins!");
        }
// If the player plays rock and the computer plays scissors, the player wins.        
        else if (player.toString().equalsIgnoreCase("rock") && computer.toString().equalsIgnoreCase("scissors")) {
            System.out.print("\n\nPlayer wins!");
        }
// If both the player and computer played paper, the game ends in a tie.        
        else if (player.toString().equalsIgnoreCase("paper") && computer.toString().equalsIgnoreCase("paper")) {
            System.out.print("\n\nIt's a tie!");
        }
// If the player plas paper and the computer plays scissors, the computer wins.        
        else if (player.toString().equalsIgnoreCase("paper") && computer.toString().equalsIgnoreCase("scissors")) {
            System.out.print("\n\nComputer wins!");
        }
// If the player plays paper and the computer plays rock, the player wins.        
        else if (player.toString().equalsIgnoreCase("paper") && computer.toString().equalsIgnoreCase("rock")) {
            System.out.print("\n\nPlayer wins!");
        }
// If both the player and computer played scissors, the game ends in a tie.        
        else if (player.toString().equalsIgnoreCase("scissors") && computer.toString().equalsIgnoreCase("scissors")) {
            System.out.print("\n\nIt's a tie!");
        }
// If the player plays scissors and the computer plays paper, the player wins.        
        else if (player.toString().equalsIgnoreCase("scissors") && computer.toString().equalsIgnoreCase("paper")) {
            System.out.print("\n\nPlayer wins!");
        }
// If the player plays scissors and the computer plays rock, the computer wins.         
        else if (player.toString().equalsIgnoreCase("scissors") && computer.toString().equalsIgnoreCase("rock")) {
            System.out.print("\n\nComputer wins!");
        }
    }
}
