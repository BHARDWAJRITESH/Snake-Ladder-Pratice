import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Simulator");
        int position= 0;
        int diceRoll=1+(int)Math.floor(Math.random()*10)%6;
        System.out.println("Player Rolls:" +diceRoll);
        int checkOption=1+(int)Math.floor(Math.random()*10)%3;
        if (checkOption==0) {
            System.out.println("No Play");
        }
        else if(checkOption==1){
            System.out.println("Ladder Comes");
            position+=diceRoll;
        }
        else{
            System.out.println("Snake Comes");
            position-=diceRoll;
        }

}
}
