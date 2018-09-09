using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.DecoratorPattern.Condiments
{
    public class SteamedMilk : CondimentDecorator
    {
        private readonly Beverage _beverage;

        public SteamedMilk(Beverage beverage)
        {
            this._beverage = beverage;
        }

        public override string Description => _beverage.Description + ", steamed milk";

        public override double Cost()
        {
            return .10 + _beverage.Cost();
        }
    }
}
