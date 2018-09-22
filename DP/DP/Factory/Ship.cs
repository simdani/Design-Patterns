using System;
using System.Collections.Generic;
using System.Text;

namespace DP.Factory
{
    public class Ship : Enemy
    {
        public Ship()
        {
            Name = "Ship";
            Console.WriteLine(Name + " created.");
        }
    }
}
