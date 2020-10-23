using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calci
{
    public class Calculator
    {
        static Calculator()
        {
            Console.WriteLine("Welcome to claculator");
        }
      public  static void square(int n)
        {
            Console.WriteLine("square : "+n*n);
        }
      public static void cube(int n)
        {
            Console.WriteLine("Cube : " + n * n * n);
        }
      public static void absolute(double n)
        {
            Console.WriteLine("absolute : " + Math.Abs(n));
        }
      public static void floor(double n)
        {
            Console.WriteLine("floor : " + Math.Floor(n));
        }
      public static void ceil(double n)
        {
            Console.WriteLine("ceil : " + Math.Ceiling(n));
        }
    }
}
