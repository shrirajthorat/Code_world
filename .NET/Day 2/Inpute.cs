using System;

namespace inpute
{
    class Inpute
    {
        public void square()
        {
            String a;
            int c;
            Console.WriteLine("Enter no : ");
            a = Console.ReadLine();
            bool b = int.TryParse(a,out c);
            if (b == true)
                Console.WriteLine(c * c);
            else
                Console.WriteLine("Invalid inpute");
           
        }
        public void byteTest()
        {
            String a;
            byte c;
            Console.WriteLine("Enter no : ");
            a = Console.ReadLine();
            bool b = byte.TryParse(a, out c);
            Console.WriteLine(c);
        }
        public void byteTest2()
        {
            String a;
            byte c;
            Console.WriteLine("Enter no : ");
            checked
            {
                a = Console.ReadLine();
                bool b = byte.TryParse(a, out c);
               
                Console.WriteLine(c);
                Console.ReadLine();
            }
        }

       
      
    }
}
