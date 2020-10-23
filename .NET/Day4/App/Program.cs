using System;
using Account;
using Calci;
using Emp;

namespace Day3
{
    class Program
    {
        static void Main(string[] args)
        {
            Class1 c1 = new Class1(1,"shriraj",100);
            c1.deposite(50);
            c1.withdraw(75);
            c1.display();
            Class1 c2 = new Class1(2, "GAanesh", 500);
            c2.deposite(515);
            c2.withdraw(750);
            c2.display();

            Calculator.square(5);
            Calculator.cube(5);
            Calculator.absolute(-5.25);
            Calculator.floor(5.75);
            Calculator.ceil(5.8);

            Printer p1 = Printer.singelton();
            p1.display();
            Printer p2 = Printer.singelton();
            p2.display();

            Employee e1 = new Employee();
            Console.WriteLine("Default value are ");
            e1.display();
            Employee e2 = new Employee(1,"Shree",1000);
            e2.net_salary();
            e2.display();
            Console.ReadLine();
        }
    }
}
