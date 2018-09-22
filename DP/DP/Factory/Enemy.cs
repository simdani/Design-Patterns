using System;
using System.Collections.Generic;
using System.Text;

namespace DP.Factory
{
    public abstract class Enemy
    {
        public string Name { get; set; }
        public int Damage { get; set; }

        public int Distance { get; set; }
    }
}
