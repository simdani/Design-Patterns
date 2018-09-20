using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.CommandPattern
{
    public class CeilingFan
    {
        public static int HIGH = 3;
        public static int MEDIUM = 2;
        public static int LOW = 1;
        public static int OFF = 0;
        private string location;
        public int speed { get; private set; }

        public CeilingFan(string location)
        {
            this.location = location;
            speed = OFF;
        }

        public void High()
        {
            speed = HIGH;
        }

        public void Medium()
        {
            speed = MEDIUM;
        }

        public void Low()
        {
            speed = LOW;
        }

        public void Off()
        {
            speed = OFF;
        }
    }
}
