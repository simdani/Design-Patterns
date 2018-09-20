using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.CommandPattern
{
    public class NoCommand : ICommand
    {
        public void Execute()
        {
        }

        public void Undo()
        {
        }
    }
}
