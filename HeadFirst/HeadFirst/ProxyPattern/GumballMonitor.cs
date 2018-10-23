using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.ProxyPattern
{
    public class GumballMonitor
    {
        private GumballMachine machine;

        public GumballMonitor(GumballMachine machine)
        {
            this.machine = machine;
        }

        public void Report()
        {
            Console.WriteLine("Gumball machine: " + machine.location);
        }
    }
}
