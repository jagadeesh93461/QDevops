import java.util.Scanner;
class Largest
{
public static void main(String args[])
{
int a,b,c;
System.out.println("Enter three integers ");
Scanner sct = new Scanner(System.in);
a = sct.nextInt();
b = sct.nextInt(); //User Input
c = sct.nextInt();
if ( a > b && a > c )  // Condition check for Largest number
System.out.println("1st number is largest.");
else if ( b > a && b > c )
System.out.println("2nd number is largest.");
else if ( c > a && c > b )
System.out.println("3rd number is largest.");
else
System.out.println("Number are not distinct.");
}
#feature201 change by vivek nov 23
import java.util.Scanner;
class ReverseNumber
{
public static void main(String args[])
{
int n, rev = 0;
System.out.println("Enter the number to reverse ");
Scanner sct = new Scanner(System.in);
n = sct.nextInt(); //User Input
while( n != 0 )// Reversing a Number Entered
{
rev = rev * 10;
rev = rev + n%10;
n = n/10;
}
System.out.println("Reverse of entered number is "+rev);
}
}
#end of feature201 code
}
s