using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.CommandPattern
{
    public class LightsOffCommand : ICommand
    {
        private Light light;

        public LightsOffCommand(Light light)
        {
            this.light = light;
        }

        public void Execute()
        {
            light.Off();
        }

        public void Undo()
        {
            light.On();
        }
    }
}
