import java.util.*;
public class StackClass{
   public static  int k = 5;
    public static  void guesseingNumberGame(){
        try (Scanner sc = new Scanner(System.in)) {
            int number = 1+(int)(100*Math.random());
      int points =0;
            int i, guess;
            System.out.println("A numbr is choosen" +  "between 1 to 100" + "Guess the numnbr" + "within 5 trails.");
            for( i = 0;i<k;i++){
                System.out.println("Guess the number");
                guess = sc.nextInt();
                if(number == guess){
                    points += 10;
                    System.out.println(
                        "Congratulations!" +
                        " you guessed the number"
                    );
                    break;
                }
                else if(number>guess && i!= k-1){
                    System.out.println("The numnber is"
                    + "greater then" + guess);
                }
                else if(number < guess && i!= k-1){
                    System.out.println("The numbr is"+
                    "less then" +  guess);
                }
            }
            if(i == k){
                System.out.println("you have exhausted" + " k trails");
                System.out.println("The number was" + number);
            }
        }
         

        }
    public static void main(String[] args) {
        StackClass sc = new StackClass();
        guesseingNumberGame();
       
    }
}