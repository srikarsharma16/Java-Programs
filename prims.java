package Prims;
import java.util.*;
public class prims 
{
   static int n,i,j,ne=1;
   static int a,b,u,v;
   public static void main(String[] args)
   {
	   int visited[]=new int[10];
	   int cost[][]=new int[10][10];
	   int min,mincost=0;
	   Scanner in=new Scanner(System.in);
	   System.out.println("Enter the number of nodes");
	   n=in.nextInt();
	   for(i=1;i<=n;i++)
		   visited[i]=0;
	   System.out.println("Enter the adjacency matrix:");
	   for(i=1;i<=n;i++)
		   for(j=1;j<=n;j++)
		   {
			   cost[i][j]=in.nextInt();
			   if(cost[i][j]==0)
				   cost[i][j]=999;
		   }
	   visited[1]=1;
	   while(ne<n)
	   {
		   min=999;
		   for(i=1;i<=n;i++)
		   {
			   for(j=1;j<=n;j++)
			   {
				   if(cost[i][j]<min)
				   {
					   if(visited[i]!=0)
					   {
						   min=cost[i][j];
						   a=u=i;
						   b=v=j;
					   }
						   
				   }
			   }
		   }
		   if(visited[u]==0||visited[v]==0)
		   {
			   System.out.println("Edge " +ne+ ":" +u+ " , " +v+ " cost: " +min);
			   ne++;
			   mincost+=min;
			   visited[b]=1;
		   }
		   cost[a][b]=cost[b][a]=999;
	   }
	   System.out.println("The minimum cost ="+mincost);
   }
}
