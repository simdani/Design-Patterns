using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.CommandPattern
{
    public class SimpleRemoteControl
    {
        private ICommand slot;

        public SimpleRemoteControl()
        {
        }

        public void SetCommand(ICommand command)
        {
            slot = command;
        }

        public void ButtonWasPressed()
        {
            slot.Execute();
        }
    }
}
