using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.DecoratorPattern.Condiments
{
    public class Whip : CondimentDecorator
    {
        private readonly Beverage _beverage;

        public Whip(Beverage beverage)
        {
            this._beverage = beverage;
        }

        public override string Description => _beverage.Description + ", Whip";

        public override double Cost()
        {
            return 0.10 + _beverage.Cost();
        }
    }
}
