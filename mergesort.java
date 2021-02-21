import java.util.Scanner;
import java.util.Random;
public class mergesort {
	static int max=10000;
  void merge(int[] array,int low,int mid,int high)
  {
    	int i=low;
    	int j=mid+1;
    	int k=low;
    	int[]resarray;
    	resarray=new int[max];
    	while(i<=mid&&j<=high)
    	{
    		if(array[i]<array[j])
    		{
    			resarray[k]=array[i];
    			k++;
    			i++;
    		}
    		else
    		{
    			resarray[k]=array[j];
    			k++;
    			j++;
    		}
    	}
    	while(i<=mid)
    	resarray[k++]=array[i++];
    	while(j<=high)
    		resarray[k++]=array[j++];
    	for(int m=low;m<=high;m++)
    		array[m]=resarray[m];
    }
void sort(int[] array,int low,int high)
{
	if(low<high)
	{
		int mid=(low+high)/2;
		sort(array,low,mid);
		sort(array,mid+1,high);
		merge(array,low,mid,high);
	}
}
public static void main(String[] args)
{
   int[]array ;
   int i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the array size");
   int n=sc.nextInt();
   array=new int[max];
   Random generator=new Random();
   for(i=0;i<n;i++)
	   array[i]=generator.nextInt(20);
   System.out.println("Array before sorting");
   for(i=0;i<n;i++)
   System.out.println(array[i]+" ");
   long startTime=System.nanoTime();
   mergesort m=new mergesort();
   m.sort(array,0,n-1);
   long stopTime=System.nanoTime();
   long elapseTime=(stopTime-startTime);
   System.out.println("Time taken to sort array is:"+elapseTime+"nanoseconds");
   System.out.println("Sorted array is:");
   for(i=0;i<n;i++)
	   System.out.println(array[i]);
   double best=n*Math.log(n);
   double avg=best;
   double worst=best;
   System.out.println("best"+Math.round(best));
   System.out.println("avg"+Math.round(avg));
   System.out.println("worst"+Math.round(worst));
}
}

