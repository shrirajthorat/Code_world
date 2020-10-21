using System;

namespace Day1
{
    class Program
    {
        static void Main(string[] args)
        {
            short a = 10;
            short b = 20;
            short c = (short)(a + b);
            Console.WriteLine("Short"+c);
            byte e = 10;
            byte d = 20;
            Console.WriteLine("Byte : "+d*e);
            float f = 3.0f;
            float g = 4.5f;
            float h=f*g;
            Console.WriteLine("Float : "+h);
            Console.WriteLine(new Demomath().square(5.2f));
            Console.WriteLine(new Demomath().cube(5.2f));
            Console.ReadLine();
        }
    }
    class Demomath
    {
       public float square(float a)
        {
            return a * a;
        }
       public float cube(float a)
       {
           return a * a*a;
       }
    }
}
