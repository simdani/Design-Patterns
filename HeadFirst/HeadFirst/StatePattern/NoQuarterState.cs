using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.StatePattern
{
    public class NoQuarterState : State
    {
        private GumballMachine gumballMachine;

        public NoQuarterState(GumballMachine gumballMachine)
        {
            this.gumballMachine = gumballMachine;
        }
        public void InsertQuarter()
        {
            Console.WriteLine("You inserted a quarter");
            gumballMachine.SetState(gumballMachine.noQuarterState);
        }

        public void EjectQuarter()
        {
            Console.WriteLine("You haven't insert a quarter");
        }

        public void TurnCrank()
        {
            Console.WriteLine("You turned, but there is no quarter");
        }

        public void Dispense()
        {
            Console.WriteLine("You need to pay first");
        }
    }
}
