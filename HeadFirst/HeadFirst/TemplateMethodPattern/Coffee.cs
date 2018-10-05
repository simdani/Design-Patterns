using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.TemplateMethodPattern
{
    public class Coffee : CaffeineBeverage
    {
        public override void Brew()
        {
            Console.WriteLine("Dripping coffee through filter");
        }

        public override void AddCondiments()
        {
            Console.WriteLine("Adding Sugar and milk");
        }
    }
}
