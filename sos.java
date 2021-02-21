import java.util.Scanner;
public class sos {
	static int c=0;
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n,d,i,sum=0;
		int s[]=new int[20];
		int x[]=new int [20];
		System.out.println("Enter the size of the set");
		n=in.nextInt();
		System.out.println("Enter the set in increasing order");
		for(i=0;i<n;i++)
			s[i]=in.nextInt();
		System.out.println("Enter the value of d:");
		d=in.nextInt();
		for(i=0;i<n;i++)
			sum=sum+s[i];
		System.out.println("\n\n\tSum of subset problem");
		if(sum<d||s[0]>d)
		{
			System.out.println("Subset is not possible");
			System.exit(0);
		}
		subset(0,0,sum,x,s,d);
		if(c==0)
			System.out.println("\n\n\tSubset is not possible");
	}
static void subset(int m,int k,int r,int x[],int s[],int d)
{
	x[k]=1;
	if(m+s[k]==d)
	{
		c++;
		System.out.print("\n\n\tSolution"+c+"is {");
		for(int i=0;i<=k;i++)
			if(x[i]==1)
			{
				System.out.print(s[i]+" ");
			}
		System.out.println("}");
	}
	else if((m+s[k]+s[k+1])<=d)
		subset(m+s[k],k+1,r-s[k],x,s,d);
	if((m+r-s[k])>=d&&(m+s[k+1])<=d)
	{
		x[k]=0;
		subset(m,k+1,r-s[k],x,s,d);
	}
}
}
