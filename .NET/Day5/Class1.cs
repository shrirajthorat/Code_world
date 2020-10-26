using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Account
{
    public class Acc
    {
        static int getId;
        int id,balanceAmt;
        string name;

        public Acc(String name,int balanceAmt)
        {
            id = ++getId;
            this.name = name;
            this.balanceAmt = balanceAmt;
            if (id == 3)
                throw new Exception("Can not create 3rd acc");
        }

        public void deposite(int a)
        {
            balanceAmt = balanceAmt + a;
        }
        public void withdraw(int a)
        {
            if (0 < balanceAmt - a)
                balanceAmt = balanceAmt - a;
            else
                Console.WriteLine("Can not withdraw..insufficient balance");
        }
        public void displlay()
        {
            Console.WriteLine(name+" "+balanceAmt);
        }
    }
}
