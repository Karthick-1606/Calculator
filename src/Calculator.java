import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
while (true){
    System.out.println("Enter the Operator: ");
    char op = input.next().trim().charAt(0);

    if ( op =='+' || op =='-' || op =='*' ||  op =='/' ||  op =='%' )
            {
                System.out.println("Enter a numbers: ");
                int a = input.nextInt();
                int b = input.nextInt();
                if (op=='+'){
                    System.out.println(a+b);
                }
                if (op=='-'){
                    System.out.println(a-b);
                }
                if (op=='*'){
                    System.out.println(a*b);
                }
                if (op=='/'){
                    if (b==0){
                        System.out.println("Division by zero is gives you infinite number");
                    } else {
                        System.out.println((double)a/b);
                    }
                }
                if (op=='%'){
                    System.out.println(a%b);
                }
                }else if (op=='x' || op=='X')  {
        break;
                }else {
        System.out.println("Invalid operation!!");
            }
        }


    }
}
