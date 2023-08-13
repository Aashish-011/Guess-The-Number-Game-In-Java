import java.util.Random;
import java.util.Scanner;
class GuessTheNumberGame{
    int compNum,userNum;
    int noOfGuesses = 0;

    public GuessTheNumberGame() {
        Random random = new Random();
        this.compNum = random.nextInt(100) + 1 ;
    }
    public void takeUserNumber(){
        System.out.println("Guess The Number Between 1-100");
        Scanner sc = new Scanner(System.in);
        userNum = sc.nextInt();
    }
    boolean play(){
        noOfGuesses++;
        if (compNum == userNum){
            System.out.println("YOU WON...!!!...YOU WON...!!!YOU WON");
            System.out.println("Your Number = " + userNum );
            System.out.println("Computer Number = " + compNum);
            System.out.println("Your Score = " + (100-noOfGuesses));
        }
        if (userNum>compNum){
            System.out.println("Your Number Is Greater");
        }
        if (userNum<compNum){
            System.out.println("Your Number Is Smaller");
        }
        return false;
    }
}
public class Exer_03_2 {
    public static void main(String[] args) {
        GuessTheNumberGame player1 = new GuessTheNumberGame();
        boolean b = false;
        while (!b){
            player1.takeUserNumber();
            b= player1.play();
        }
    }
}
