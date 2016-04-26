using System;
using System.Collections.Generic;

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            Animal cow = new Animal();
            Console.WriteLine(cow.CreateSound());
        }

        public static int Add(int value1, int value2)
        {
            return value1 + value2;
        }

        public static decimal Add(decimal val1, decimal val2)
        {
            return val1 + val2;
        }

        public static String fizzBuzz(int value)
        {
            if (value % 15 == 0)
                return "FizzBuzz";
            else if (value % 3 == 0)
                return "Fizz";
            else if (value % 5 == 0)
                return "Buzz";
            else return value.ToString();
        }

    }

    public class Test
    {
        public Test()
        {

        }

        public int Add(int val1, int val2)
        {
            return val1 + val2;
        }
    }

    public class Animal
    {
        public Animal()
        {

        }

        public virtual string CreateSound()
        {
            return "Bloop";
        }
    }


    public class Cow : Animal
    {
        public Cow()
        {

        }

        public override string CreateSound()
        {
            return "Moooo";
        }
    }
}
