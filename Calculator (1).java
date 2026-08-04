//Create a calculator that takes two numbers and an operator (+, -, *, /) and uses switch to perform the operation.
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter Numbers:");
        Long a=sc.nextLong();
        Long b=sc.nextLong();
        System.out.printf("Enter operator:");
        char x=sc.next().charAt(0);
        switch(x){
            case '+':System.out.println(""+(a+b));
                    break;
            case '-':System.out.println(""+(a-b));
                    break;
            case '*':System.out.println(""+(a*b));
                    break;
            case '/':System.out.println(""+(a/b));
                    break;
            default:
                    System.out.println("Invalid Entry");
              
        }
        sc.close();
    }
}