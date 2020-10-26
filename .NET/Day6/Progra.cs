using System;

namespace GetterSetter
{
   /* class Account {
        int id,balance;
        static int count;
        static float Interestrate = 0.07f;
        const float minBalance = 1000;
        static Account()
        {
            Console.WriteLine("Bank of maharastra");
        }
        public Account(String nm,int bal)
        {
            id = ++count;
            Name=nm;
            Balance = bal;
        }
        public static void roi(Account a)
        {
              a.balance+=(int)(a.balance*Interestrate);               
        }
        public int Id{
            get{ return id;}
        }
        public String Name
        {
            get;
            set;
        }
        public int Balance {
            get {
                return balance;
            }
            set {
                if (value <= 0)
                    throw new Exception("enter more than 0");
                else
                    balance = value;
            }
        
        }
        public void deposite(int n)
        {
            if(n>=0)
                balance += n;
            else
                throw new Exception("deposite more than 0");
        }
        public void withdraw(int n)
        {
            if (balance - n > minBalance && n >= 0)
                balance -= n;
            else
                throw new Exception("Withdraw more than 0");
        }
        public void diaplay()
        {
            Console.WriteLine(Id+" "+Name+" "+Balance);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Account a=null,a2=null;

            try
            {
                 a = new Account("Shriraj", 5000);
                 a2 = new Account("Ganesh", 540);
            
            }
            catch(Exception e) {
                Console.WriteLine(e);
            }
            try
            {
                a.deposite(1000);
                a.withdraw(4562);
                a.diaplay();
                try
                {
                    a2.withdraw(-5);
                }
                catch (Exception e)
                {
                   Console.WriteLine(e);
                }
                a2.diaplay();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
            Console.ReadLine();
        }
    }*/

    class Employee {
        int id, salary,netSalary;
        static int count;
        const double tds = 0.1;
        static Employee(){
            Console.WriteLine("ABC ltd");
        }
        public Employee(int salary,String nm)
        {
            id = ++count;
            if (id < 4)
            {
                Salary = salary;
                Name = nm;
            }
            else
                throw new Exception("Can not create 4th obj");
        }
        public int Id { get { return id; } }
        public String Name
        {
            get;
            set;
        }
        public int Salary
        {
            get
            {
                return salary;
            }
            set
            {
                if (value <= 0 || value>=50000)
                    throw new Exception("salary should be in between 0 to 50000");
                else
                    salary = value;
            }

        }
        public int NetSalary {
            get { return netSalary; }
            set { netSalary = value; }
        }
        public int TDS()
        {
           NetSalary=salary-(int)(salary* tds);
           return (int)(salary * tds);
        }
        public void diaplay()
        {
            Console.WriteLine(Id + " " + Name + " " + salary + " " + netSalary);
        }
    }

    class main {

        static void Main(string[] args)
        {
            Employee e1 = null, e2 = null, e3 = null,e4;
            try
            {
                 e1 = new Employee(45000, "Shree");
                 e2 = new Employee(5000, "Ganu");
                 e3 = new Employee(4, "ab");
                 e4 = new Employee(458,"sdf");
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }
            Console.WriteLine(e1.TDS());
           e1.diaplay();
           Console.WriteLine(e2.TDS());
           e2.diaplay();
           Console.WriteLine(e3.TDS());
           e3.diaplay();
         

            Console.ReadLine();

        }
    }

}
