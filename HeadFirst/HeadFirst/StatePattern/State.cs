using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.StatePattern
{
    public interface State
    {
        void InsertQuarter();
        void EjectQuarter();
        void TurnCrank();
        void Dispense();
    }
}
