import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
       // String[] fruits={"apple","mango","orange","coconut"};
        //System.out.println(fruits[1]);    for  single element
        /*for(String arr:fruits)        for whole array
            System.out.println(arr);
            OR
            for(int i=0;i<fruits.length;i++){
            sout(fruits[i]);



        int noOfFruits=fruits.length;
        System.out.println(noOfFruits);

        //SORT METHOD
        Arrays.sort(fruits);
        for(String arr:fruits){
            System.out.println(arr); //sorts alphabetical
        }
        fill element with single value

        Arrays.fill(fruits,"pineapple");
        for(String arr:fruits){
            System.out.println(arr); //fills all element with pineapple
        }


        //USER INPUT USING Array
        String[] food=new String[3];//empty array
        food[0]="pizza";
        food[1]="taco";
        System.out.println(food.length);
        for(String arr:food){
            System.out.println(arr);
        }
        */
        Scanner sc=new Scanner(System.in);
        /*String[] food=new String[3];//    STATIC ARRAY SIZE :empty array
        for(int i=0;i<food.length;i++){
            System.out.println("Enter your fav food items:");
            food[i]=sc.nextLine();


        }
        for(String arr:food) {
            System.out.println("Your fav food items are:"+arr);
        }

         */
        String[] food;
        int size;
        System.out.println("What  # food do u want?: ");
        size=sc.nextInt();
        sc.nextLine();
        food=new String[size];
        for(int i=0;i<food.length;i++) {
            System.out.print("Enter your fav food items:");
            food[i] = sc.nextLine();

        }
        for(String arr:food) {
            System.out.println("Your fav food items are:" + arr);
        }






            sc.close();


    }
}
