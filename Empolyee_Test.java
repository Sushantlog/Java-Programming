import java.net.SocketPermission;
import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

class Empolyee
{
    String Fname,Lname;
    double MSalary,YealySalary,TotalSalary;
    Empolyee()
    {
        Fname=" ";
        Lname=" ";
        MSalary=0.0;
    }
    void SetFname(String Fname)
    {
        this.Fname=Fname;
    }
    String GetFname()
    {
        return Fname;
    }


    void SetLname(String Lname)
    {
        this.Lname=Lname;
    }
    String GetLname()
    {
        return Lname;
    }


    void SetMSalary(Double MSalary)
    {
        this.MSalary=MSalary;
    }
    double GetMSalary()
    {
       if(MSalary>=0) 
       {
            return MSalary;
       }
       else{
        return MSalary=0.0;
       }
    }
    void GetYealySalary()
    {
        YealySalary=MSalary*12;
        System.out.println("The yearly salary of a empolyee is : "+YealySalary);
    }
    void GetTotalSalary()
    {
        System.out.println("the salary with 10% raise : "+(((YealySalary*10)/100)+YealySalary));
    }

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
        System.out.println("enter the last name : ");
        E1.SetLname(sc.next());
        System.out.println("enter monthaly salary : ");
        E1.SetMSalary(sc.nextDouble());

        System.out.println("----------------------------------------");
        
        System.out.println("enter Second empolyee details");
        Empolyee E2=new Empolyee();
        System.out.println("enter first name : ");
        E2.SetFname(sc.next());
        System.out.println("enter the last name : ");
        E2.SetLname(sc.next());
        System.out.println("enter monthaly salary : ");
        E2.SetMSalary(sc.nextDouble());

        System.out.println("----------------------------------------");

        System.out.println("empolyee first name : "+E1.GetFname());
        System.out.println("empolyee last name : "+E1.GetLname());
        System.out.println("empolyee monthly salary : "+E1.GetMSalary());

        E1.GetYealySalary();
        E1.GetTotalSalary();

        System.out.println("----------------------------------------");

        System.out.println("empolyee first name : "+E2.GetFname());
        System.out.println("empolyee last name : "+E2.GetLname());
        System.out.println("empolyee monthly salary : "+E2.GetMSalary());

        E2.GetYealySalary();
        E2.GetTotalSalary();

    }
}