import java.util.*;
public class Employee {
String ename,desig;
int eid,bp,grade,hra;
double da,pf,gross,np;
void get()
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter name");
    ename=s.nextLine();
    System.out.println("Enter designation");
    desig=s.nextLine();
    System.out.println("Enter emp id");
    eid=s.nextInt();
}
void display()
{
    System.out.println("------employee personal data--");
    System.out.println(ename);
    System.out.println(eid);
    System.out.println(desig);    
}
}

import java.util.*;
public class Salary extends Employee {
void pay()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter basic");
bp=s.nextInt();
System.out.println("Enter grade");
grade=s.nextInt();
}
void DA(double dpercent)
{
    da=(bp+grade)*dpercent;  
    System.out.println("da");
    System.out.println(da);
    
}
void pf(double ppercent)
{
    pf=(bp+grade+da)*ppercent;
    System.out.println("pf");
    System.out.println(pf);
}
void calculate(int hra)
{
    gross=bp+grade+da+hra;
    np=gross-pf;
    System.out.println("gross");
    System.out.println(gross);
    System.out.println("np");
    System.out.println(np);    
}

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int ch;
        Employee emp=new Employee();
        Salary sal=new Salary();
        System.out.println("1.AP 2.AP(SG) 3.Asso.Prof 4.Asso.Prof(SG) 5.Prof");
        do
        {
        System.out.println("Enter choice");
        Scanner s=new Scanner(System.in);
        ch=s.nextInt();
        switch(ch)
        {
        case 1:
            System.out.println("Assistant professor");
            sal.get();
            sal.display();
            sal.pay();
            sal.DA(0.35);
            sal.pf(0.12);
            sal.calculate(1000);
            break;
        case 2:
            System.out.println("Ap(SG)");
            sal.get();
            sal.display();
            sal.pay();
            sal.DA(0.37);
            sal.pf(0.12);
            sal.calculate(1000);
            break;
        case 3:
            System.out.println("assso prof");
            sal.get();
            sal.display();
            sal.pay();
            sal.DA(0.40);
            sal.pf(0.13);
            sal.calculate(1200);
            break;
        case 4:
            System.out.println("Asso prof(SG)");
            sal.get();
            sal.display();
            sal.pay();
            sal.DA(0.45);
            sal.pf(0.13);
            sal.calculate(1200);
            break;
        case 5:
            System.out.println(" professor");
            sal.get();
            sal.display();
            sal.pay();
            sal.DA(0.50);
            sal.pf(0.15);
            sal.calculate(1400);
            break;
        }
        }while(ch<6);
    }

}