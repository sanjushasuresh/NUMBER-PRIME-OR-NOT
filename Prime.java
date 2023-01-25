import java.util.Scanner;
public class Prime
{
  public static void main(String[] args)
  {
    int i,f=0;
    System.out.println("Enter a value");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(i=2;i<=n/2;i++)
    {
      if(n%i==0)
      {
        f=1;
        break;
      }
    }
    if(f==0)
      System.out.println("It is a prime");
    else
      System.out.println("It is not a prime");
  }
} 