using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.TemplateMethodPattern
{
    public class Tea : CaffeineBeverage
    {
        public override void Brew()
        {
            Console.WriteLine("Steeping the tea");
        }

        public override void AddCondiments()
        {
            Console.WriteLine("Adding a lemon");
        }
    }
}
