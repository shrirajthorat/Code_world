using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Array
{
    class Program
    {
        static void cube(int [,]b)
        {
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {   
                    b[i, j] = b[i, j] * b[i, j]*b[i,j];
                    Console.WriteLine(b[i, j]);
                }
            }
        }
        static void Main(string[] args)
        {
            int[,] a = new int[3, 3];
            int sum=0;
           for(int i=0;i<3;i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    a[i,j] = int.Parse(Console.ReadLine());
                }
            }
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                   sum=sum+a[i,j];
                }
            }
            Console.WriteLine("Sum={0}", sum);
            Console.WriteLine("Avg={0}",sum/9);
           /* int[,] b=new int[3,3];
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    sum = sum + a[i, j];
                    b[i, j] = a[i, j] * a[i, j];
                }
            }
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    Console.WriteLine(b[i,j]);
                }
            }
            Console.WriteLine("Sum={0}", sum);*/
           //cube(a);
            
            Console.ReadLine();
               
        }
    }
}
