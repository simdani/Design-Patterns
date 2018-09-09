using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.DecoratorPattern.Beverages
{
    public sealed class DarkRoast : Beverage
    {
        public DarkRoast()
        {
            Description = "Dark Roast Coffee";
        }

        public override double Cost()
        {
            return 0.99;
        }
    }
}
