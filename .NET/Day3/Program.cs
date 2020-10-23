using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Struct_and_Enum
{
    struct math
    {
        public void square(int i)
        {
            Console.WriteLine("Square={0}",i*i);
        }
        public void cube(int i)
        {
            Console.WriteLine("Square={0}", i * i*i);
        }
        public static void factorOfNo(int n)
        {
            Console.WriteLine("Factor of no are : ");
            for (int i = 1; i <= n / 2; i++)
            {
                if (n % i == 0)
                    Console.WriteLine(i);
            }
        }
    }
    struct emp
    {
        public string name;
        public int salary;
      public emp(string name, int salary)
        {
           this.name = name;
            this.salary = salary;
        }
     
      public void display()
      {
          Console.WriteLine("name={0} salary={1}",name,salary);
      }
    }
    class Program
    {
        static void Main(string[] args)
        {
           // math m = new math();
           // m.square(5);
           // m.cube(5);
          //  Console.WriteLine("Enter no ");
            //string a = Console.ReadLine();
            //int b;
            //bool c = int.TryParse(a, out b);
            //math.factorOfNo(b);

            emp e = new emp("Shree",1100000);
            e.display();      
            Console.WriteLine("Enter no ");
            string a = Console.ReadLine();
            int b;
            bool c = int.TryParse(a, out b);
            Console.WriteLine("type={0} ,parent type={1}", b.GetType(),b.GetType().BaseType);
            Console.WriteLine("type={0},parent type={1}", e1.GetType(),e1.GetType().BaseType.BaseType);
            
            Console.ReadLine();
                
        }
    }
}
