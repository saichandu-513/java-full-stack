import java.util.Scanner;

/* Number1 */

/*class StarSquare
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
n=s.nextInt();
for(int i=0;i<=n;i++)
{
for(int j=0;j<=n;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}*/

/* Number2 */

/* class NumberSquare
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(i);
}
System.out.println();
}
}
} */

/* Number3 */

/* class NumberSequence
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(j);
}
System.out.println();
}
}
} */

/* Number4 */

/* class Numbers
{
public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(k++ +"\t");
}
System.out.println();
}
}
} */

/* Number5 */

/* class Pattern5
{
public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(k==10)
{
k=1;
}
System.out.print(k++ +"\t");
}
System.out.println();
}
}
} */

/* Number6 */

/* class Pattern6
{
public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(k++ +"\t");
k+=1;
}
System.out.println();
}
}
} */

/* Number7 */

/*class Pattern7
{
public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(j%2);
}
System.out.println();
}
}
}*/

/* Number8 */

/*class Pattern8
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}*/

/* Number9 */
/*class Pattern9
{
public static void main(String[] args)
{
int n,even=2;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" "+even);
even+=2;
}
System.out.println();
even=2;
}
}
}*/

/* Number10 */

/* class Pattern10
{
public static void main(String[] args)
{
int n;
String s="INDIA";
Scanner s1=new Scanner(System.in);
System.out.print("Enter the value:");
n=s1.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
} */

/* Number11 */

/*class Pattern11
{
public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}*/

/* Number12 */

/*class Pattern12
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter the value:");
int n = s.nextInt();
for (int i = 1; i <= n; i++)
{
for (int j = i; j < n; j++)
{
System.out.print("  ");
}
for (int k = 1; k <= (2 * i - 1); k++)
{
System.out.print(" *");
}
System.out.println();
}
for (int i = n - 1; i >= 1; i--) 
{
for (int j = n; j > i; j--) 
{
System.out.print("  ");
}
for (int k = 1; k <= (2 * i - 1); k++) 
{
System.out.print(" *");
}
System.out.println();
}
}
}*/

/* Number13 */


/*class Pattern13 
{
public static void main(String[] args) 
{
Scanner s= new Scanner(System.in);
System.out.print("Enter the value:");
int n = s.nextInt();
for (int i = 1; i <= n; i++) 
{
for (int j = 1; j <= n - i; j++) 
{
System.out.print(" ");
}
for (int k = 1; k <= 2 * i - 1; k++) 
{
if (k == 1 || k == 2 * i - 1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
for (int i = n - 1; i >= 1; i--) 
{
for (int j = 1; j <= n - i; j++) 
{
System.out.print(" ");
}
for (int k = 1; k <= 2 * i - 1; k++) 
{
if (k == 1 || k == 2 * i - 1) 
{
System.out.print("*");
}
 else 
{
System.out.print(" ");
}
}
System.out.println();
}        
}
}*/

/* Number14 */

/*class Pattern14 
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=0;i<n;i++) 
{
for(int j=0;j<n;j++) 
{
if(i==0 || j==0 || j==n-1 || i==n-1) 
{
System.out.print("*");
}
else 
{
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/* Number15 */

/*class Pattern15 
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=0;i<n;i++) 
{
for(int j=0;j<n;j++) 
{
if(i==n/2 || j==n/2) 
{
System.out.print("*");
}
else 
{
System.out.print(" ");
}
}
System.out.println();
}
}
}*/ 

/* Number16 */

/*class Pattern16 
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++) 
{
for(int j=1;j<=n;j++) 
{
if(i==j || j==n-i+1) 
{
System.out.print("*");
}
else 
{
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/* Number17 */

/*class Pattern17 
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=0;i<n;i++) 
{
for(int j=0;j<n;j++) 
{
if(i==n/2 || j==n/2 || i==0 || j==0 || j==n-1 || i==n-1) 
{
System.out.print("*");
}
else 
{
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/* Number18 */

/*class Pattern18 
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=n;i>0;i--) 
{
for(int j=0;j<i;j++) 
{
if(j==0 || i==n || j==i-1) 
{
System.out.print(" *");
}
else 
{
System.out.print(" ");
}
}
System.out.println();
}
}
}*/

/* Number19 */

/*class Pattern19 
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=0;i<=n;i++) 
{
for(int j=0;j<=i;j++) 
{
if(j!=i) 
{
System.out.print("*");
}
else 
{
System.out.print(j);
}
}
System.out.println();
}
}
}*/

/* Number20 */

/*class Pattern20 
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=0;i<=n;i++) 
{
for(int j=0;j<=n;j++) 
{
if(j==0 || i==0 || i==j) 
{
System.out.print("*");
}
else 
{
System.out.print(" ");
}
}
System.out.println();
}
}
}*/