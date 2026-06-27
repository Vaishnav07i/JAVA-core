import java.util.Scanner;

public class defineChar {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);



//without methods
        /*
        System.out.println("Enter the character :");
        char  ch=sc.nextLine().charAt(0);


        if(ch >= 'a' && ch<='z') {
            System.out.println("lowercase");
        } else if (ch >= 'A' && ch<='Z') {
            System.out.println("Uppercase");
        } else if (ch >='0' ) {
            System.out.println("+ve number");

        } else if (ch==' ') {
            System.out.println("space");

        }
        else{
            System.out.println("special character");
        }
*/
            //with method
            System.out.println("enter a character");
            char ch =sc.nextLine().charAt(0);
            if(Character.isUpperCase(ch)){
                System.out.println("UPPERCASE");
            } else if (Character.isLowerCase(ch)){
                System.out.println("lowercase");
            } else if (Character.isDigit(ch)) {
                System.out.println("Integer");
            } else if (Character.isSpaceChar(ch)) {
                System.out.println("space");

            }
            else{
                System.out.println("special character");
            }


            sc.close();

    }
    }


