using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.StatePattern
{
    public class GumballMachine
    {
        public State soldOutState { get; }
        public State noQuarterState { get; }
        public State hasQuarterState { get; }
        public State soldSate { get; }

        protected State state;
        protected int count = 0;

        public GumballMachine(int numberGumballs)
        {
            soldOutState = new SoldOutState(this);
            noQuarterState = new NoQuarterState(this);
            hasQuarterState = new HasQuarterState(this);
            soldSate = new SoldState(this);
            this.count = numberGumballs;
            state = soldOutState;
            if (numberGumballs > 0)
            {
                state = noQuarterState;
            }
        }

        public void InsertQuarter()
        {
            state.InsertQuarter();
        }

        public void EjectQuarter()
        {
            state.EjectQuarter();
        }

        public void TurnCrank()
        {
            state.TurnCrank();
            state.Dispense();
        }

        public void SetState(State state)
        {
            this.state = state;
        }

        void releaseBall()
        {
            Console.WriteLine("A gumball comes rolling out");
            if (count != 0)
            {
                count = count - 1;
            }
        }
    }
}
