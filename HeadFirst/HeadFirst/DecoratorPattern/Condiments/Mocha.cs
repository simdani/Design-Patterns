﻿using System;
using System.Collections.Generic;
using System.Text;

namespace HeadFirst.DecoratorPattern.Condiments
{
    public class Mocha : CondimentDecorator
    {
        private readonly Beverage _beverage;

        public Mocha(Beverage beverage)
        {
            _beverage = beverage;
        }

        public override string Description => _beverage.Description + ", Mocha";

        public override double Cost()
        {
            return .20 + _beverage.Cost();
        }
    }
}
