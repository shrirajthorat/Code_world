using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Emp
{
   public class Employee
    {
       int id;
       double netSalary,salary;
       String name;
       static Employee()
       {
           Console.WriteLine("Its Employee class");
       }
       public Employee() { }
       public Employee(int i,string nm,double salar)
       {
           id = i;
           name = nm;
           salary = salar;
       }
       public void net_salary()
       {
            netSalary=Math.Abs(salary-salary*0.1);
           Console.WriteLine("NetSAlary : "+netSalary );
       }
       public void display()
       {
           Console.WriteLine(name+"-"+netSalary);
       }
    }
}
