﻿using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.AdapterPattern
{
    public class MallardDuck : IDuck
    {
        public void Quack()
        {
            Console.WriteLine("Quack!");
        }

        public void Fly()
        {
            Console.WriteLine("I'm flying");
        }
    }
}
