import java.net.SocketPermission;
import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Empolyee
{
    String Fname,Lname;
    double Msalary,YealySalary,TotalSalary;
    Empolyee()
    {
        Fname=" ";
        Lname=" ";
        Msalary=0.0;
    }
    void SetFname(String Fname)
    {
        this.Fname=Fname;
    }
    Strind
}
public class Empolyee_Test
{
    public static void main(String args[])
    {
        System.out.println("enter first empolyee details");
        Scanner sc=new Scanner(System.in);
        Empolyee E1=new Empolyee();
        System.out.println("enter first name : ");
        E1.SetFname(sc.next());
        System.out.println("enter the second name : ");
        E1.SetLname(sc.next());
        System.out.println("enter monthaly salary : ");
        E1.SetMsalary(sc.nextDouble());

        System.out.println("----------------------------------------");
        
        System.out.println("enter Second empolyee details");
        Scanner sc=new Scanner(System.in);
        Empolyee E2=new Empolyee();
        System.out.println("enter first name : ");
        E2.SetFname(sc.next());
        System.out.println("enter the second name : ");
        E2.SetLname(sc.next());
        System.out.println("enter monthaly salary : ");
        E2.SetMsalary(sc.nextDouble());

        System.out.println("empolyee first name : "+E1.GatFname());
        System.out.println("empolyee last name : "+E1.GatLname());
        System.out.println("empolyee monthly salary : "+E1.GatMsalary());

        E1.GetYealySalary();
        E1.GetTotalSalary();

        System.out.println("----------------------------------------");

        System.out.println("empolyee first name : "+E1.GatFname());
        System.out.println("empolyee last name : "+E1.GatLname());
        System.out.println("empolyee monthly salary : "+E1.GatMsalary());

        E1.GetYealySalary();
        E1.GetTotalSalary();

    }
}