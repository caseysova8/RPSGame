
import java.security.SecureRandom;

public class Player {
        
    private int play;
        
    public Player() {
        this.setPlay();
    }
       
    public Player(String choice) {
        this.setPlay(choice);
    }
         
    private int getPlay()
    {
        return this.play;
    }
         
    public void setPlay(String choice) {      
        if (choice.equalsIgnoreCase("rock")) {
            setPlay(1);
        }       
        else if (choice.equalsIgnoreCase("paper")) {
            setPlay(2);
        }       
        else {
            setPlay(3);
        }
    }
        
    public void setPlay(int play) {
        this.play = play;
    }
         
    public void setPlay() {       
        SecureRandom randomNum = new SecureRandom();
        int generatedNum = 1 + randomNum.nextInt(3);
        setPlay(generatedNum);
    }
        
    public String toString() {        
        switch (getPlay()) {           
            case 1:
                return "rock";                
            case 2:
                return "paper";.                 
            default:
                return "scissors";
        }
    }   
}
