using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Account
{
    public class Class1
    {
        int id;
        String name;
        int balanceAmt;

        public Class1(int id,String name,int balanceAmt)
        {
            this.id = id;
            this.name = name;
            this.balanceAmt = balanceAmt;

        }
        public void deposite(int amt)
        {
            balanceAmt = balanceAmt + amt;
        }
        public void withdraw(int amt)
        {
            balanceAmt = balanceAmt - amt;
        }
        public void display()
        {
            Console.WriteLine(name+" "+balanceAmt);
        }
    }
}
