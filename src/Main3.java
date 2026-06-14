import java.util.Random;
import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int guess;
        int attempts=0;
        int randomNum=random.nextInt(1,11);
        //System.out.println(randomNum);
        System.out.println("Welcome to the number guessing game");
        System.out.println("Guess no from from 1-10");
        do{
            System.out.println("Enter a guess:");
            guess=sc.nextInt();
            attempts++;
            if(guess==randomNum) {
                System.out.println("You guessed it right  yayy");
            }

            else{
                    System.out.println("OHH NO try again");
                }



        }while(guess!=randomNum);


        sc.close();
    }
}
