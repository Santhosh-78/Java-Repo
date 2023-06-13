import java.util.Scanner;

class ScannerExample{
public static void main(String args[])
{
System.out.println("Enter your name");
Scanner sc = new Scanner(System.in);
String name = sc.next();
System.out.println("Your name is "+ name);
System.out.println("Enter your age");
int name1 = sc.nextInt();
System.out.println("Your age is "+ name1);
System.out.println("Enter your mark");
float name2 = sc.nextFloat();
System.out.println("Your mark is "+ name2);
System.out.println("Enter your phone no");
long name3 = sc.nextLong();
System.out.println("Your phone no is "+ name3);
System.out.println("Enter your short value");
short name4 = sc.nextShort();
System.out.println("Your short value is "+ name4);
System.out.println("Enter your double value");
double name5 = sc.nextDouble();
System.out.println("Your double value is "+ name5);
System.out.println("Enter your boolean value");
boolean name6 = sc.nextBoolean();
System.out.println("Your boolean value is "+ name6);
System.out.println("Enter your byte value");
byte name7 = sc.nextByte();
System.out.println("Your byte value is "+ name7);

System.out.println("Enter your character");
char name8 = sc.next().charAt(3);
System.out.println("Your character is "+ name8);


}
}
