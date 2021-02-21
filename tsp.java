import java.util.Scanner;
public class tsp {
public static void main(String[] args)
{
	int c[][]=new int[10][10];
	int tour[]=new int[10];
	int i,j,cost,n;
	System.out.println("Enter number of cities");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	if(n==1)
	{
		System.out.println("path not found");
		System.exit(0);
	}
	System.out.println("Enter the cost matrix");
	for(i=1;i<=n;i++)
		for(j=1;j<=n;j++)
			c[i][j]=in.nextInt();
	System.out.println("Ttavelling sales person problem");
	System.out.println("THE COST MATRIX IS:");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			System.out.print("\t"+c[i][j]);
		}
			System.out.println();
	}
	for(i=1;i<=n;i++)
		tour[i]=i;
	cost=tspdp(c,tour,1,n);
	System.out.println("The optimal tour is:");
	for(i=1;i<=n;i++)
		System.out.print(tour[i]+"->");
	System.out.println("1");
	System.out.println("Minimum cost: " +cost);
}
static int tspdp(int c[][],int tour[],int start,int n)
{
	int mintour[]=new int[10];
	int temp[]=new int[10];
	int mincost=999,ccost,i,j,k;
	if(start==n-1)
	{
		return(c[tour[n-1]][tour[n]]+c[tour[n]][1]);
	}
	for(i=start+1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
			temp[j]=tour[j];
			temp[start+1]=tour[i];
			temp[i]=tour[start+1];
			if(c[tour[start]][tour[i]]+(ccost=tspdp(c,temp,start+1,n))<mincost)
			{
				mincost=c[tour[start]][tour[i]]+ccost;
				for(k=1;k<=n;k++)
					mintour[k]=temp[k];
			}
		}
	for(i=1;i<=n;i++)
		tour[i]=mintour[i];
	return mincost;
}
}
