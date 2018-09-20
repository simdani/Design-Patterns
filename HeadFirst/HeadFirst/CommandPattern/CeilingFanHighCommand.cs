using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.CommandPattern
{
    public class CeilingFanHighCommand : ICommand
    {
        private CeilingFan ceilingFan;
        private int prevSpeed;

        public CeilingFanHighCommand(CeilingFan ceilingFan)
        {
            this.ceilingFan = ceilingFan;
        }

        public void Execute()
        {
            prevSpeed = ceilingFan.speed;
            ceilingFan.High();
        }

        public void Undo()
        {
            if (prevSpeed == CeilingFan.HIGH)
                ceilingFan.High();
            else if (prevSpeed == CeilingFan.MEDIUM)
                ceilingFan.Medium();
            else if (prevSpeed == CeilingFan.LOW)
                ceilingFan.Low();
            else if (prevSpeed == CeilingFan.OFF)
                ceilingFan.Off();
        }
    }
}
