import java.util.Scanner;
public class student 
{
  String USN;
  String Name;
  String Branch;
  long phone;
  void insertrecord(String usn,String name,String branch,long ph)
  {
	  USN=usn;
	  Name=name;
	  Branch=branch;
	  phone=ph;
  }
  void displayrecord()
  {   
	  System.out.println(USN+" "+Name+" "+Branch+" "+phone);
  }
  public static void main(String args[])
  {
	  student s[]=new student[100];
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number of students");
	  int n=sc.nextInt();
	  for(int i=0;i<n;i++)
	  s[i]=new student();
	  for(int j=0;j<n;j++)
	  {
		  System.out.println("Enter usn name branch phonenum");
		  String USN=sc.next();
		  String Name=sc.next();
		  String Branch=sc.next();
		  long phone=sc.nextLong();
		  s[j].insertrecord(USN,Name,Branch,phone);
	  }
	  System.out.println("USN    NAME    BRANCH     PHONENUM");
	  for(int m=0;m<n;m++)
	  {
		  s[m].displayrecord();
	  }	  
  }
}