using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.ProxyPattern
{
    public class GumballMachine
    {
        public string location { get; }

        public GumballMachine(string location)
        {
            this.location = location;
        }
    }
}
