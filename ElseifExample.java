import java.util.Scanner;
public class ElseifExample {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Mark");
int mark = sc.nextInt();
if(mark<35){
System.out.println("Your grade is F");
}else if(mark<=75 && mark>=35){
System.out.println("Your grade is B");
}else if(mark<=90 && mark>75){
System.out.println("Your grade is A");
}else if(mark<=100 && mark>90)
System.out.println("Your grade is O");
else{
System.out.println("Invaild number");
}
}
}