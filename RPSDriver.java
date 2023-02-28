
import java.util.Scanner;

public class RPSDriver {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
               
        System.out.println("Welcome to Rock Paper Scissors\n");
        
        System.out.print("Type rock, paper, or scissors: ");
        String playerPlay = scanner.next();
        
        Player player = new Player(playerPlay);
        Player computer = new Player();
        
        System.out.printf("\nYou played: %s", player.toString());
        System.out.printf("\nComputer played: %s", computer.toString());
                
        if (player.toString().equalsIgnoreCase("rock") && computer.toString().equalsIgnoreCase("rock")) {
            System.out.print("\n\nIt's a tie!"); 
        }   
        
        else if (player.toString().equalsIgnoreCase("rock") && computer.toString().equalsIgnoreCase("paper")) {
            System.out.print("\n\nComputer wins!");
        }      
        
        else if (player.toString().equalsIgnoreCase("rock") && computer.toString().equalsIgnoreCase("scissors")) {
            System.out.print("\n\nPlayer wins!");
        }    
        
        else if (player.toString().equalsIgnoreCase("paper") && computer.toString().equalsIgnoreCase("paper")) {
            System.out.print("\n\nIt's a tie!");
        }     
        
        else if (player.toString().equalsIgnoreCase("paper") && computer.toString().equalsIgnoreCase("scissors")) {
            System.out.print("\n\nComputer wins!");
        }    
        
        else if (player.toString().equalsIgnoreCase("paper") && computer.toString().equalsIgnoreCase("rock")) {
            System.out.print("\n\nPlayer wins!");
        }   
        
        else if (player.toString().equalsIgnoreCase("scissors") && computer.toString().equalsIgnoreCase("scissors")) {
            System.out.print("\n\nIt's a tie!");
        }    
        
        else if (player.toString().equalsIgnoreCase("scissors") && computer.toString().equalsIgnoreCase("paper")) {
            System.out.print("\n\nPlayer wins!");
        }   
        
        else if (player.toString().equalsIgnoreCase("scissors") && computer.toString().equalsIgnoreCase("rock")) {
            System.out.print("\n\nComputer wins!");
        }
    }
}
