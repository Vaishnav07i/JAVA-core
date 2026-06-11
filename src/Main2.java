import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        //System.out.println(Math.PI);
        //double result;
        //result=Math.pow(2,3);
        //result=Math.abs(-5);
        //result=Math.sqrt(9);
        //result=Math.round(7.8);
        //result=Math.ceil(3.14); //4
        //result=Math.floor(3.99); //3
        //result=Math.max(7,9);
        //result=Math.min(6,7);
        //System.out.println(result);
        Scanner scanner=new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter value of a");
        a= scanner.nextDouble();
        System.out.println("Enter value of b");
        b= scanner.nextDouble();

        c=Math.sqrt(Math.pow(a,2)+Math.pow(b ,2));
        System.out.println("Hypotenses is :"+c);
        scanner.close();

    }
}
