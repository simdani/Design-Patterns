using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.DecoratorPattern.Condiments
{
    public class Soy : CondimentDecorator
    {
        private readonly Beverage _beverage;

        public Soy(Beverage beverage)
        {
            this._beverage = beverage;
        }

        public override string Description => _beverage.Description + ", Soy";

        public override double Cost()
        {
            return .15 + _beverage.Cost();
        }
    }
}
