import java.util.*;
import java.io.*;
class Employee{
	int id;
	float grosssalary, netsalary,bpay;
	String name, address, mail, mno;
	Scanner get = new Scanner(System.in);
	Employee(){
	System.out.println("Enter Name of the Employee:");
	name = get.next();
	System.out.println("Enter id:");
	id = get.nextInt();
	System.out.println("Enter Address of the Employee:");
	address = get.next();
	System.out.println("Enter mailid of the Employee:");
	mail = get.next();
	System.out.println("Enter mobile no. of the Employee:");
	mno = get.next();
}
void salary(){
	grosssalary= (0.97f*bpay)+(0.10f*bpay)+(0.12f*bpay) + (0.001f*bpay)+bpay;
	netsalary= grosssalary-((0.12f*bpay) + (0.001f*bpay));
}
void display(){
	System.out.println("Employee Name: "+name);
	System.out.println("ID: "+id);
	System.out.println("Mail Id: "+mail);
	System.out.println("Address: "+address);
	System.out.println("Mobile No. : "+mno);
	System.out.println("Gross Salary : "+grosssalary);
	System.out.println("Net Salary : "+netsalary);
}
}
class Programmer extends Employee{
	Programmer(){
		System.out.println("Enter Basic Pay:");
	bpay = get.nextFloat();
	salary();
	}
	void display(){
		System.out.println("\n ==============\n Programmer\n ================\n");
		super.display();
	}
}
class AssistantProfessor extends Employee{
	AssistantProfessor(){
	System.out.println("Enter Basic Pay:");
	bpay = get.nextFloat();
	salary();
	}
	void display(){
	System.out.println(" ==============================\n Assistant Professor\n==============================\n");
	super.display();
	}
}
class AssociateProfessor extends Employee{
	AssociateProfessor(){
		System.out.println("Enter Basic Pay:");
		bpay = get.nextFloat();
		salary();
	}
	void display(){
		System.out.println(" =======================\n Associate Professor\n=======================\n");
		super.display();
	}
}
class Professor extends Employee
{
	Professor(){
			System.out.println("Enter Basic Pay:");
			bpay = get.nextFloat();
			salary();
		}
		void display()
		{
			System.out.println(" =============\n Professor\n =============\n");
			super.display();
		}
}
class Employees
{
public static void main(String args[]) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(" -------------\n PAY SLIPS \n ------------ \n 1. Professor \n 2. AssociateProfessor\n 3. Assistant Professor\n 4. Programmer");
	System.out.printf("\n Choose the type of Employee: ");
	int choice=Integer.parseInt(br.readLine());
	switch(choice){
		case 1:
		System.out.println(" =========================\n Enter Professor Details \n========================="+"\n");
		Professor ob1 = new Professor();
		ob1.display();
		break;
		case 2:
		System.out.println(" =================================\n Enter Associate ProfessorDetails \n ================================="+"\n");
		AssociateProfessor ob2 = new AssociateProfessor();
		ob2.display();
		break;
		case 3:
		System.out.println(" =================================\n Enter Assistant ProfessorDetails\n ================================="+"\n");
		AssistantProfessor ob3 = new AssistantProfessor();ob3.display();
		break;
		case 4:
		System.out.println(" ============================\n Enter Programmer Details \n============================"+"\n");
		Programmer ob4 = new Programmer();
		ob4.display();
		break;
		default:
		System.out.println("Enter correct choice");
		break;
	}
	}
}
