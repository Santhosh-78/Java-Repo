import java.util.Scanner;
class ArithmeticScanner{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a value");
int a = sc.nextInt();
System.out.println("Enter b value");
int b = sc.nextInt();
System.out.println("Addition " + (a+b));
System.out.println("Subtraction " + (a-b));
System.out.println("Multiplication " + (a*b));
System.out.println("Division " + (a/b));
System.out.println("Modulus " + (a%b));
}
}

