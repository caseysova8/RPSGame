// Casey Sova 10/14/2022
// Week 7 Homework
// Using overloaded constructors, overloaded methods, and random number generation,
// program a game of rock paper scissors between the user and a computer player.

// The following is the needed import statement to utilize the SecureRandom library.
import java.security.SecureRandom;

public class Player {
    
// The following is the initialization of the int field 'play' only used in this class.    
    private int play;
    
// The following is a no-argument constructor that calls the overloaded 'setPlay' method
// with no arguments.     
    public Player() {
        this.setPlay();
    }
    
// The following is a constructor with one string argument that represents the players'
// choice of rock, paper, or scissors. This constructor calls the overloaded 'setPlay' method
// with one string argument, passing in the players' choice.    
    public Player(String choice) {
        this.setPlay(choice);
    }
    
// The following is a private getter method for the play field.     
    private int getPlay()
    {
        return this.play;
    }
    
// The following is the overloaded 'setPlay' method with one string parameter,
// representing the choice of either rock, paper, or scissors.     
    public void setPlay(String choice) {      
// If 'choice' is equal to "rock", the value '1' is passed to the overloaded
// 'setPlay' method with one integer parameter.
        if (choice.equalsIgnoreCase("rock")) {
            setPlay(1);
        }
// If 'choice' is equal to "paper", the value '2' is passed to the overloaded
// 'setPlay' method with one integer parameter.        
        else if (choice.equalsIgnoreCase("paper")) {
            setPlay(2);
        }
// Else, the value '3' is passed to the overloaded 'setPlay' method with one
// integer parameter. It is assumed "scissors" is the only other option being played.         
        else {
            setPlay(3);
        }
    }
    
// The following is the overloaded 'setPlay' method with one integer parameter. The
// paramter being passed into the method sets the value for the field 'play'.    
    public void setPlay(int play) {
        this.play = play;
    }
    
// The following is the overloaded 'setPlay' method with no parameters.     
    public void setPlay() {
// The following is the instantiation of an object of the SecureRandom class.        
        SecureRandom randomNum = new SecureRandom();
// The following generates a random number between 1 and 3 and sets it equal to
// the integer field 'generatedNum'.
        int generatedNum = 1 + randomNum.nextInt(3);
// The following updates the 'play' field using the overloaded 'setPlay' method with
// one integer parameter.
        setPlay(generatedNum);
    }
    
// The following is the 'toString' method that returns the value of the play as a string.    
    public String toString() {
// The following is a switch statement.        
        switch (getPlay()) {
// If the 'getPlay()' method returns a 1, the string "rock" is returned to the code.             
            case 1:
                return "rock";
// If the 'getPlay()' method returns a 2, the string "paper" is returned to the code.                 
            case 2:
                return "paper";
// Else, the string "scissors" is returned to the code.                 
            default:
                return "scissors";
        }
    }   
}
