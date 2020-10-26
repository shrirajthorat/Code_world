using System;


namespace A
{
    class Program
    {
        static void Main(string[] args)
        {
            /*int [] arr=new int[5];
            int[] arr2 = new int[5];
            for (int i = 0; i < arr.Length; i++)
            {
                arr[i]=int.Parse(Console.ReadLine());
            }
            Console.WriteLine();
            Array.Sort(arr);

            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine(arr[i]);
            }
            Console.WriteLine();
            Array.Reverse(arr);
            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine(arr[i]);
            }
            Console.WriteLine();
            arr.CopyTo(arr2, 0);
            foreach (int i in arr2)
                Console.WriteLine(i);

            String a=Console.ReadLine();
            string b = a.ToLower();
            Console.WriteLine(b);
            Console.WriteLine(Object.ReferenceEquals(a,b));*/

            String name = Console.ReadLine();
            String pass = Console.ReadLine();
            String ConfirmPass = Console.ReadLine();
            if (pass.Equals(ConfirmPass))
                Console.WriteLine("Valid");
            else
                Console.WriteLine("Not valid");

            Console.ReadLine();
        }
    }
}
