package knapsack;
import java.util.Scanner;
public class knapsack_dynamic 
{
  static int v[][]=new int[30][30];
  public static int max1(int a,int b)
  {
	  return(a>b)?a:b;
  }
  public static void main(String[] args)
  {
	  int w[]=new int[30];
	  int p[]=new int[30];
	  Scanner in=new Scanner(System.in);
	  int i,j,n,max;
	  System.out.println("Enter the number of elements");
	  n=in.nextInt();
	  for(i=1;i<=n;i++)
	  {
		  System.out.println("Enter the weight and profit of item"+i);
		  w[i]=in.nextInt();
		  p[i]=in.nextInt();
	  }
	  System.out.println("Enter the capacity of Knapsack");
	  max=in.nextInt();
	  for(i=0;i<=n;i++)
		  v[i][0]=0;
	  for(j=0;j<=max;j++)
		  v[0][j]=0;
	  for(i=1;i<=n;i++)
		  for(j=1;j<=max;j++)
		  {
			  if(w[i]>j)
			  {
				  v[i][j]=v[i-1][j];}
				  else
				  { v[i][j]=max1(v[i-1][j],v[i-1][j-w[i]]+p[i]);
			  }
		  }
			  System.out.println("the maxium profit:"+v[n][max]);
			  System.out.println("The items selected are:");
			  j=max;
			  for(i=n;i>=1;i--)
				  if(v[i][j]!=v[i-1][j])
			  {
				  System.out.println("item :"+i);
				  j=j-w[i];
			  }
		  }
  }

