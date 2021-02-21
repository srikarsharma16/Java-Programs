class Staff
{
	int staffid,phone,salary;
	String name;
	public Staff(int id,int ph,int sal,String na)
	{
		staffid=id;
		phone=ph;
		salary=sal;
		name=na;
	}
	void display()
	{
		System.out.println("....................");
		System.out.println("Staff Id:"+" "+staffid);
		System.out.println("Staff Phonenum:"+" "+phone);
		System.out.println("Staff Salary:"+" "+salary);
		System.out.println("Staff Name:"+" "+name);
	}
}
class Teaching extends Staff
{
	String domain;
	int noofpublications;
	public Teaching(int id,int ph,int sal,String na,String d,int nop)
	{
		super(id,ph,sal,na);
		domain =d;
		noofpublications=nop;
	}
	void Tdisplay()
	{
		System.out.println("...............");
		System.out.println("Teaching staff details");
		super.display();
		System.out.println("Domain:"+" "+domain);
		System.out.println("NOOFPUBLICATIONS:"+" "+noofpublications);
	}
}
class Technical extends Staff
{
	String skills;
	public Technical(int id,int ph,int sal,String na,String sk)
	{
		super(id,ph,sal,na);
		skills=sk;
	}
	void Tedisplay()
	{
		System.out.println("...............");
		System.out.println("Technical staff details");
		super.display();
		System.out.println("Skills:"+" "+skills);
	}
}
class Contract extends Staff
{
	int period;
	public Contract(int id,int ph,int sal,String na,int c)
	{
		super(id,ph,sal,na);
		period=c;
	}
	void Cdisplay()
	{
		System.out.println("...............");
		System.out.println("Contract staff details");
		super.display();
		System.out.println("Contract:"+" "+period);
}
}
public class multi_level
{
  public static void main(String args[])
  {
	  Teaching t1=new Teaching(11,990078556,33000,"Varun","CSE",10);
	  Teaching t2=new Teaching(12,990078556,33000,"Sakshi","EEE",15);
	  Teaching t3=new Teaching(13,990078556,33000,"Varsha","ISE",20);
	  t1.Tdisplay();
	  t2.Tdisplay();
	  t3.Tdisplay();
	  Technical te1=new Technical(14,77564488,23000,"Rakesh","JAVA");
	  Technical te2=new Technical(15,77564488,23000,"Pallavi","Python");
	  Technical te3=new Technical(16,77564488,23000,"Prakash","C++");
	  te1.Tedisplay();
	  te2.Tedisplay();
	  te3.Tedisplay();
	  Contract c1=new Contract(17,99886677,56000,"Sriraj",2);
	  Contract c2=new Contract(18,99886677,56000,"Spandhana",1);
	  Contract c3=new Contract(19,99886677,56000,"Shweta",3);
	  c1.Cdisplay();
	  c2.Cdisplay();
	  c3.Cdisplay();
  }
}
