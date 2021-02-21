import java.util.Scanner;
public class stack 
{
 final int max=100;
 int s[]=new int[max];
 int top=-1;
 void push(int ele)
 {
	if(top>=max-1)
		System.out.println("Stack overflow");
	else
		s[++top]=ele;
 }
 int pop()
 { 
	 int z=0;
	 if(top==-1)
		 System.out.println("Stack underflow");
	 else
		z=s[top--]; 
	return z;
 }
 int display()
 {
	 if(top==-1)
		 System.out.println("Stack is empty");
	 else
	 {
		 for(int i=top;i>-1;i--)
			 System.out.println(s[i]+" ");
	 }
	return max;
 }
 public static void main(String args[])
 {
	 int q=1;
	 stack m=new stack();
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Program to perform stack operation");
      while(q!=0)
      {
    	  System.out.println("ENTER 1.PUSH 2.POP 3.DISPLAY");
    	  System.out.println("ENTER YOUR CHOICE");
    	  int ch=sc.nextInt();
    	  switch(ch)
    	  {
    	  case 1: System.out.println("ENTER THE ELEMENT TO BE PUSHED");
    	          int ele=sc.nextInt();
    	          m.push(ele);
    	          break;
    	  case 2: int popele;
    	          popele=m.pop();
    	          System.out.println("The poped element is");
    	          System.out.println(popele+" ");
    	          break;
    	  case 3: System.out.println("ELEMENTS IN THE STACK ARE");
    	          m.display();
    	          break;
    	  case 4: q=0;
    	  }
      }
 }
}
