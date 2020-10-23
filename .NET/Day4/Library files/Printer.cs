using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Account
{
    public class Printer
    {
        static Printer ob;
        static Printer()
        {
            Console.WriteLine("Welcomt to XEROX");
        }
        private Printer()
        { 
            ob=null;
        }
        public static Printer singelton()
        {
            if(ob==null)
                ob=new Printer();
            return ob;
        }
        public void  display()
        {
            Console.WriteLine("Welcome to singelton ");
        }
    }
}
