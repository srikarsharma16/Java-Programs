import java.util.Scanner;
public class floyd {
public void flyd(int [][]w,int n)
{
	int i,j,k;
	for(k=1;k<=n;k++)
		for(i=1;i<=n;i++)
			for(j=1;j<=n;j++)
				w[i][j]=Math.min(w[i][j],w[i][k]+w[k][j]);
}
public static void main(String[] args)
{
	int i,j,n;
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[10][10];
	System.out.println("Enter the number of vertices");
	n=sc.nextInt();
	System.out.println("Enter the weighted matrix");
	for(i=1;i<=n;i++)
		for(j=1;j<=n;j++)
			a[i][j]=sc.nextInt();
	floyd f=new floyd();
	f.flyd(a, n);
	System.out.println("The shoretst path matrix");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			System.out.print(a[i][j]+" ");
		}
	System.out.println();
}
sc.close();
}
}