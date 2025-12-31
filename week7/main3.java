package week7;


/**
 * Write a description of class main3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main3
{
    public static void main(String[] args)
    {
        employee e1=new employee();
        employee e2=new employee();
        employee e3=new employee();
        
        e1.id=01;
        e1.name="ram";
        e1.salary=50000;
        
         e2.id=02;
        e2.name="hari";
        e2.salary=40000;
        
         e3.id=03;
        e3.name="shyam";
        e3.salary=60000;
        
        System.out.println("employee 1 Details:");
        System.out.println("ID: " + e1.id);
        System.out.println("Name:"  + e1.name);
        System.out.println("Salary:"  + e1.salary);
        
        System.out.println("employee 2 Details:");
        System.out.println("ID: " + e2.id);
        System.out.println("Name:"  + e2.name);
        System.out.println("Salary:"  + e2.salary);
        
        System.out.println("employee 3 Details:");
        System.out.println("ID: " + e3.id);
        System.out.println("Name:"  + e3.name);
        System.out.println("Salary:"  + e3.salary);
        
        if(e1.salary>e2.salary && e1.salary>e3.salary)
        {
            System.out.println("The highest salary is" + e1.salary);
        }
        
        else if(e3.salary>e1.salary && e3.salary>e2.salary)
        {
            System.out.println("The highest salary is" + e3.salary);
        }
        else
        {
            System.out.println("The highest salary is" + e2.salary);
        }
            
        }
        
    
        
        
    }
