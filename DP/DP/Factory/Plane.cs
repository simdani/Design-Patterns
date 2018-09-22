using System;
using System.Collections.Generic;
using System.Text;

namespace DP.Factory
{
    public class Plane : Enemy
    {
        public Plane()
        {
            Name = "Plane";
            Console.WriteLine(Name + " created.");
        }
    }
}
