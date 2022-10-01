package Inheritance;
import java.util.*;
public class Inheritance {
    public class Employee {
        String name;
        int id;
        String mob;
        String email;
        int bp;
        Scanner sc=new Scanner(System.in);
        public void getdata() {
            System.out.println("Enter the Name of the Employee : ");
            name=sc.nextLine();
//			String dummy=sc.next();
            System.out.println("Enter the id of the Employee : ");
            id=sc.nextInt();
            System.out.println("Enter the Mobile No. of the Employee : ");
            mob=sc.next();
            while(mob.length()!=10) {
                System.out.println("Invalid Mobile No!! ");
                System.out.println("Enter the Mobile No. of the Employee : ");
                mob=sc.next();
            }
            System.out.println("Enter the e-mail of the Employee : ");
            email=sc.next();
            while(!email.contains("@") || !email.contains(".")) {
                System.out.println("Invalid email address!! ");
                System.out.println("Enter the email of the Employee : ");
                email=sc.next();
            }
        }
        public void putdata() {
            System.out.println("Name of the Employee : "+name);
            System.out.println("ID of the Employee : "+id);
            System.out.println("Mobile No. of the Employee : "+mob);
            System.out.println("E-mail of the Employee : "+email);
            System.out.println();
        }
        public double DA,HRA,PF,CF,netSalary,grossSalary;

        public void salaryGenerator() {
            DA=(0.97)*bp;
            HRA =(0.1)*bp;
            PF=(0.12)*bp;
            CF=(0.01)*bp;
            grossSalary=bp+DA+HRA+PF;
            netSalary=grossSalary-CF-PF;

            System.out.println("Gross salary of the Employee : "+grossSalary);
            System.out.println("Net salary of the Employee : " +netSalary);
        }
    }
    public class Programmer extends Employee {
        void setdata() {
            System.out.println("Enter the Basic pay of Programmer : ");
            bp=sc.nextInt();
        }
    }
    public class TeamLeader extends Employee {
        void setdata() {
            System.out.println("Enter the Basic pay of Team Leader : ");
            bp=sc.nextInt();
        }
    }
    public class APM extends Employee {
        void setdata() {
            System.out.println("Enter the Basic pay of Assitant Project Manager : ");
            bp=sc.nextInt();
        }
    }
    public class PM extends Employee {
        void setdata() {
            System.out.println("Enter the Basic pay of Project Manager : ");
            bp=sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Inheritance a=new Inheritance();
        Employee b =a.new Employee();
        Programmer c=a.new Programmer();
        TeamLeader d=a.new TeamLeader();
        APM e=a.new APM();
        PM f=a.new PM();

        Scanner sc=new Scanner(System.in);

        System.out.println("Choose whose Salary to be calculated : \n 1. Programmer \n 2. Team Leader \n 3. APM \n 4. PM \n 5. Exit \n");
        int x=sc.nextInt();
        while(x!=5) {
            switch(x) {
            case 1:
                c.getdata();
                c.setdata();
                c.putdata();
                c.salaryGenerator();
                break;
            case 2:
                d.getdata();
                d.setdata();
                d.putdata();
                d.salaryGenerator();
                break;
            case 3:
                e.getdata();
                e.setdata();
                e.putdata();
                e.salaryGenerator();
                break;
            case 4:
                f.getdata();
                f.setdata();
                f.putdata();
                f.salaryGenerator();
                break;
            case 5:
                System.out.println("Thanks for using this program !!!...");
                break;
            default:
                System.out.println("Invalid Entry....");
                break;
            }
            System.out.println("Choose whose Salary to be calculated : \n 1.Programmer \n 2. Team Leader \n 3. APM \n 4. PM \n 5. Exit \n");
            x=sc.nextInt();
        }
    }
}