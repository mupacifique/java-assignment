import java.util.*;

class employee
{
static int employee_number;
static String name ;
static String address;
static int salary;
static int hours;
static void getdata()
{
Scanner k= new Scanner (System.in);
int op;
System.out.println("select option:[1]monthly,[2]weekly,[3]hourly");
op=k.nextInt();
if(op==1)
{
System.out.println("enter employee_number");
employee_number=k.nextInt();
System.out.println("enter name");
name=k.next();
System.out.println("enter address");
address=k.next();
System.out.println("enter salary");
salary=k.nextInt();
int result;
result=salary-(((salary*30)/100)+((salary*3)/100));
System.out.println("your salary ="+result);
}
else if(op==2)
{
System.out.println("enter employee_number");
employee_number=k.nextInt();
System.out.println("enter name");
name=k.next();
System.out.println("enter address");
address=k.next();
System.out.println("enter salary");
salary=k.nextInt();
int result;
result=salary;
System.out.println("your salary ="+result);	
}	
else if(op==3)
{
System.out.println("enter employee_number");
employee_number=k.nextInt();
System.out.println("enter name");
name=k.next();
System.out.println("enter address");
address=k.next();
System.out.println("enter hourly rate");
salary=k.nextInt();
System.out.println("enter hours");
hours=k.nextInt();

int result;
result=(salary*hours)-((((salary*hours)*30)/100)+(((salary*hours)*3)/100));
System.out.println("your salary ="+result);	
}
else
{
System.out.println("invalid option");
}
}

		
public static void main(String args[])
{
getdata();
}
}