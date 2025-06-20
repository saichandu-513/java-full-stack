import java.util.Scanner;
/* Number1 */

/*class ITCareer
{
public static void main(String[] args)
{
int n;
System.out.print("How many times do you want to print enter the number:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for( int i=1;i<=n;i++)
{
System.out.println("Bright IT Career");
}
}
}*/

/* Number2 */

/*class Number1To20
{
public static void main(String[] args)
{
int i=1;
System.out.println("print the numbers:");
while(i<=20)
{
System.out.println(i);
i++;
}
}
}*/

/* Number3 */

/*class EqualandNotEqual
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the value of a:");
int a=s.nextInt();
System.out.print("Enter the value of b:");
int b=s.nextInt();
if(a==b)
{
System.out.print("Both are equal");
}
if(a!=b)
{
System.out.print("Both are not equal");
}
}
}*/

/* Number4 */

/*class OddEven
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the Integer:");
int a=s.nextInt();
if(a%2==0)
{
System.out.println("Even Number");
}
else
{
System.out.println("Odd Number");
}
}
}*/

/* Number5 */

/*class LargestAmongThreeNumbers
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the value a:");
int a=s.nextInt();
System.out.print("Enter the value b:");
int b=s.nextInt();
System.out.print("Enter the value c:");
int c=s.nextInt();
if((a>b)&&(a>c))
{
System.out.print(" a is largest");
}
else if(b>c)
{
System.out.print("b is largest");
}
else
{
System.out.print("c is largest");
}
}
}*/

/* Number6 */

/*class Even10to100
{
public static void main(String[] args) 
{
int i=10;
while (i <= 100) 
{
if (i%2 == 0) 
{
System.out.print(i+" ");
}
i++;
}
}
}*/

/* Number7  */

/*class Dowhile1To10
{
public static void main(String[] args)
{
int i=1;
do
{
System.out.println(i);
i++;
}while(i<=10);
}
}*/

/* Number8 */

/*class Armstrong
{
public static void main(String[] args)
{
int n,sum=0,rem;
System.out.print("Enter the Integer:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int A=n;
while(n>0)
{
rem=n%10;
sum+= Math.pow(rem,3);
n/=10;
}
if(A==sum)
{
System.out.println("Given number is Armstrong");
}
else
{
System.out.println("Given number is not Armstrong");
}
}
}*/

/* Number9 */

/*class PrimeorNot
{
public static void main(String[] args)
{
int n,count=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter the Integer:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count+=1;
}
}
if(count==2)
{
System.out.println("The number is Prime");
}
else
{
System.out.println("The number is not a prime");
}
}
}*/

/* Number10 */

/*class Palindrome
{
public static void main(String[] args)
{
int n,reverse=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter ther value:");
n=s.nextInt();
int num=n;
while (n > 0) 
{
int digit = n % 10;
reverse = reverse * 10 + digit;
n = n / 10;
}
if(reverse==num)
{
System.out.println("Enter number is Palindrome");
}
else
{
System.out.println("Enter number is not a Palindrome");
}
}
}*/

/* Number11 */

/*class SwitchEvenorOdd
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the Integer:");
n=s.nextInt();
switch(n%2)
{
case 0:
System.out.print("It is Even");
break;
case 1:
System.out.print("It is Odd");
}
}
}*/

/* Number12 */

/*class Gender
{
public static void main(String[] args)
{
String g;
Scanner s=new Scanner(System.in);
System.out.print("Enter the Gender:");
g=s.nextLine();
switch(g)
{
case "M":
System.out.print("Male");
break;
case "m":
System.out.print("male");
break;
case "F":
System.out.print("Female");
break;
case "f":
System.out.print("female");
break;
default:
System.out.print("Enter the correct choice");
break;
}
}
}*/

/* Number13 */

/*class LargestNumber
{
public static void main(String[] args)
{
int a=10,b=20,c=30;
if(a>b)
{
System.out.println("a is Large");
}
else if(b>c)
{
System.out.println("b is Large");
}
else
{
System.out.println("c is Large");
}
}
}*/






















