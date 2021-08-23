import java.util.Random;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome To Snake And Ladder Simulator");
        int start = 0;
        int Finish = 100;
        int playerPos;

        System.out.println("Game Start");
        playerPos = start;
        System.out.println("Player at Position:" +playerPos);
        int diceRoll=1+(int)Math.floor(Math.random()*10)%6;
        System.out.println("Player Rolls:" +diceRoll);

}
}
